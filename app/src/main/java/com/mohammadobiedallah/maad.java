package com.mohammadobiedallah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class maad extends AppCompatActivity {
    final ArrayList<String> storagebadal= new ArrayList<>();

    final ArrayList<String> storageared = new ArrayList<>();
    final ArrayList<String> storageawed = new ArrayList<>();
    final ArrayList<String> storagemonfasel= new ArrayList<>();

    final ArrayList<String> storagemotasel = new ArrayList<>();
    final ArrayList<String> storagekbra = new ArrayList<>();
    final ArrayList<String> storagesmail= new ArrayList<>();

    final ArrayList<String> storagelazem = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maad);
    }

    public void smail(View view) {
        Intent my =new Intent(this ,show.class);
        my.putExtra("child","adgam2");
        my.putExtra("storage",storagesmail);
        startActivity(my);

    }


    public void awed(View view) {

        Intent my =new Intent(this ,show.class);
        my.putExtra("child","adgam2");
        my.putExtra("storage", storageawed);
        startActivity(my);
    }

    public void monfasel(View view) {

        Intent my =new Intent(this ,show.class);
        my.putExtra("child","adgam2");
        my.putExtra("storage", storagemonfasel);
        startActivity(my);
    }

    public void kbra(View view) {

        Intent my =new Intent(this ,show.class);
        my.putExtra("child","adgam2");
        my.putExtra("storage",storagekbra);
        startActivity(my);
    }

    public void badal(View view) {

        Intent my =new Intent(this ,show.class);
        my.putExtra("child","adgam2");
        my.putExtra("storage", storagebadal);
        startActivity(my);
    }

    public void lazem(View view) {

        Intent my =new Intent(this ,show.class);
        my.putExtra("child","adgam2");
        my.putExtra("storage", storagelazem);
        startActivity(my);
    }

    public void ared(View view) {

        Intent my =new Intent(this ,show.class);
        my.putExtra("child","adgam2");
        my.putExtra("storage", storageared);
        startActivity(my);
    }

    public void motasel(View view) {

        Intent my =new Intent(this ,show.class);
        my.putExtra("child","adgam2");
        my.putExtra("storage",storagemotasel);
        startActivity(my);
    }

    public void back(View view) {

        Intent my =new Intent(this ,Interface.class);

        startActivity(my);
    }

}
