package com.mohammadobiedallah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.IOException;
import java.util.ArrayList;

public class show extends AppCompatActivity implements MediaPlayer.OnPreparedListener {
     ArrayList<String> sourcestorage = new ArrayList<>();
    int i=0;
    String storageLocation;
    String child;
    ArrayList<String> list = new ArrayList<>();
    private MediaPlayer mMediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        TextView show = (TextView)findViewById(R.id.show);
        Intent my =getIntent();
        sourcestorage  = (ArrayList<String>)my.getStringArrayListExtra("storage");

    child= my.getStringExtra(child);
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("server/saving-data/fireblog/posts").child(child);

// Attach a listener to read the data at our posts reference
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                list.clear();
                for(DataSnapshot snapshot: dataSnapshot.getChildren())
                    list.add(snapshot.getValue().toString());

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }

        });
        show.setText(list.get(i));
        play();
        i++;

    }
    public void play() {

        mMediaplayer = new MediaPlayer();
        mMediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
  storageLocation=sourcestorage.get(i);
        final FirebaseStorage storage = FirebaseStorage.getInstance();
        // Create a storage reference from our app
        StorageReference storageRef = storage.getReferenceFromUrl(storageLocation);
        //   StorageReference spaceref = storageRef.child("audio/SampleAudio_0.4mb (1).mp3");

        storageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                try {
                    final String url = uri.toString();
                    mMediaplayer.setDataSource(url);
                    mMediaplayer.setOnPreparedListener(show.this);
                    mMediaplayer.prepareAsync();
                    mMediaplayer.start();
                    // Download url of file
                    //  final String url = uri.toString();
                    // mMediaplayer.setDataSource(url);
                    // wait for media player to get prepare
                    // mMediaplayer.setOnPreparedListener(MainActivity.this);
                    // mMediaplayer.prepareAsync();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.i("TAG", e.getMessage());
                    }
                });
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        mp.start();
    }

    void restart(View view){
        i=0;
        TextView show = (TextView)findViewById(R.id.show);
        show.setText(list.get(i));
        play();
        i++;

    }

    void back (View view){
        --i;
        TextView show = (TextView)findViewById(R.id.show);
        show.setText(list.get(i));
        play();
        i++;

    }

    void next(View view){

        TextView show = (TextView)findViewById(R.id.show);
        show.setText(list.get(i));
        play();
        i++;

    }

}
