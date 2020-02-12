package com.mohammadobiedallah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class expertreg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expertreg);
    }

    private void back(View view){
        Intent my =new Intent(this,MainActivity.class);
        startActivity(my);
    }
}
