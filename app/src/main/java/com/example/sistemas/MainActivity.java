package com.example.sistemas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cambioLogin(2000);
    }


    public void cambioLogin(int milisegundos) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // acciones que se ejecutan tras los milisegundos
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                Log.e("entre","despues de"+1000);
            }
        }, milisegundos);
    }
}