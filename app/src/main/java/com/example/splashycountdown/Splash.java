package com.example.splashycountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView txto = findViewById(R.id.txt_rst);
        Intent cambio = new Intent(this, MainActivity.class);
        new CountDownTimer(6000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                txto.setText("Espera "+millisUntilFinished/1000+" segundos");
            }

            @Override
            public void onFinish() {
                txto.setText("Bienvenido");
                startActivity(cambio);
                finish();
            }
        }.start();
    }
}