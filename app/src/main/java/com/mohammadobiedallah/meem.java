package com.mohammadobiedallah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class meem extends AppCompatActivity {
    final ArrayList<String> storageadgam= new ArrayList<>();

    final ArrayList<String> storagekhfa = new ArrayList<>();
    final ArrayList<String> storageadhar = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meem);
    }
    public void adgam(View view) {

        Intent my =new Intent(this ,show.class);
        my.putExtra("child","adgam2");
        my.putExtra("storage", storageadgam);
        startActivity(my);


    }
    public void back(View view) {

        Intent my =new Intent(this ,Interface.class);

        startActivity(my);


    }
    public void khfa(View view) {

        Intent my =new Intent(this ,show.class);
        my.putExtra("child","adgam1");
        my.putExtra("storage", storagekhfa);
        startActivity(my);


    }
    public void adhar(View view) {

        Intent my =new Intent(this ,show.class);
        my.putExtra("child","adgam1");
        my.putExtra("storage", storageadhar);
        startActivity(my);


    }

}
