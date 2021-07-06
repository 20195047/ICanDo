package com.example.icando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class score extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        mediaPlayer = MediaPlayer.create(score.this,R.raw.clap);
        mediaPlayer.start();

        score = findViewById(R.id.score);

        Intent intent = getIntent();

        String scr = intent.getStringExtra("SCORE");
        String rate = "";
        if(scr.equals("5")){
            rate = "Excellent!";
        }else if(scr.equals("4")){
            rate = "Very Good!";
        }else if(scr.equals("3")){
            rate = "Good!";
        }

        score.setText("Your Score:"+rate);
    }
}