package com.mohammadobiedallah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Interface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);
    }

    public void gonon(View view) {
        Intent my = new Intent(this, noon.class);
        startActivity(my);

    }

    public void gomem(View view) {
        Intent my = new Intent(this, meem.class);
        startActivity(my);
    }

    public void gomd(View view) {
        Intent my = new Intent(this,maad.class);
        startActivity(my);
    }


    public void other(View view) {
        Intent my = new Intent(this, other.class);
        startActivity(my);
    }
}
