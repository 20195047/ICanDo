package com.example.icando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class spell_menu extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private Button easy1, normal1, hard1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spell_menu);

        easy1 = findViewById(R.id.easy1);
        normal1 = findViewById(R.id.normal1);
        hard1 = findViewById(R.id.hard1);

        mediaPlayer = MediaPlayer.create(spell_menu.this,R.raw.bgmusic);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        easy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                easyBtn();
            }
        });
        normal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                normalBtn();
            }
        });
        hard1.setOnClickListener(new View.OnClickListener() {
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
        Intent intent = new Intent(spell_menu.this, spelling.class);
        startActivity(intent);
        mediaPlayer.stop();
    }
    public void normalBtn(){
        Intent intent = new Intent(spell_menu.this, nrmlspll.class);
        startActivity(intent);
        mediaPlayer.stop();
    }
    public void hardBtn(){
        Intent intent = new Intent(spell_menu.this, hrdspll.class);
        startActivity(intent);
        mediaPlayer.stop();
    }
}
