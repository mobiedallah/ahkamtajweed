package com.mohammadobiedallah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText user,password;
Button reg,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       user=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.pass);
    }
   public void bureg2(View view) {
       // Intent my =new Intent(MainActivity.this,expertreg.class
       // );
       // startActivity(my);
    }
    public void bureg1(View view) {
        Intent my =new Intent(MainActivity.this,userReg.class
        );
        startActivity(my);
    }


    public void buLogin(View view) {

      //  String url="http://10.0.2.2/~hussienalrubaye/phpAndroid/login.php?UserName="+  user.getText().toString()+"&Password="+ etPassword.getText().toString();

      //  new MyAsyncTaskgetNews().execute(url);
    }

}
