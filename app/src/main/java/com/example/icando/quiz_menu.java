package com.example.icando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quiz_menu extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private Button easy, normal, hard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_menu);

        easy = findViewById(R.id.easy);
        normal = findViewById(R.id.normal);
        hard = findViewById(R.id.hard);

        mediaPlayer = MediaPlayer.create(quiz_menu.this,R.raw.bgmusic);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                easyBtn();
            }
        });
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                normalBtn();
            }
        });
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hardBtn();
            }
        });
    }
    @Override
    public void onBackPressed() {
        mediaPlayer.stop();
        super.onBackPressed();
    }
    public void easyBtn(){
        Intent intent = new Intent(quiz_menu.this, funquiz.class);
        startActivity(intent);
        mediaPlayer.stop();
    }
    public void normalBtn(){
        Intent intent = new Intent(quiz_menu.this, nrmlquiz.class);
        startActivity(intent);
        mediaPlayer.stop();
    }
    public void hardBtn(){
        Intent intent = new Intent(quiz_menu.this, hrdquiz.class);
        startActivity(intent);
        mediaPlayer.stop();
    }
}