package com.example.splashycountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void botonMeow(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.gato_meow);
        sonido.start();
    }
    public void botonIntent_imp(View view){
        Intent implicito = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=QsGRLZiR61A&list=RD5sujn2JtUrM&index=5"));
        startActivity(implicito);
    }
}