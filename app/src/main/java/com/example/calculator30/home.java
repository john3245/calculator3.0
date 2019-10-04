package com.example.calculator30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        new Handler().postDelayed((new Runnable() {
            @Override
            public void run() {

                Intent it = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(it);


            }
        }),5000);

    }
}
