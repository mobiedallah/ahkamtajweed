package com.mohammadobiedallah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class noon extends AppCompatActivity {
    final ArrayList<String> storageadgam1 = new ArrayList<>();
    final ArrayList<String> storageadgam2= new ArrayList<>();
    final ArrayList<String> storageklab= new ArrayList<>();
    final ArrayList<String> storagekhfa = new ArrayList<>();
    final ArrayList<String> storageadhar = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noon);
    }

    public void adgam1(View view) {

        Intent my =new Intent(this ,show.class);
my.putExtra("child","adgam1");
        my.putExtra("storage", storageadgam1);
        startActivity(my);


    }
    public void adgam2(View view) {

        Intent my =new Intent(this ,show.class);
        my.putExtra("child","adgam2");
        my.putExtra("storage", storageadgam2);
        startActivity(my);


    }
    public void klab(View view) {

        Intent my =new Intent(this ,show.class);
        my.putExtra("child","klap");
        my.putExtra("storage", storageklab);
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
    public void back(View view) {

        Intent my =new Intent(this ,Interface.class);

        startActivity(my);


    }
}
