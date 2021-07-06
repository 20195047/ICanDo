package com.example.icando;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private Button write, read, animals, quiz, spell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        write = findViewById(R.id.write);
        read = findViewById(R.id.read);
        animals = findViewById(R.id.animals);
        quiz = findViewById(R.id.quiz);
        spell = findViewById(R.id.spell);

        mediaPlayer = MediaPlayer.create(Menu.this,R.raw.bgmusic);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();


        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrtFunction();
            }
        });
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rdFunction();
            }
        });
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anmlsFunction();
            }
        });
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qzFunction();
            }
        });

        spell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spllFunction();
            }
        });
    }

    @Override
    public void onBackPressed() {
        mediaPlayer.stop();
        super.onBackPressed();

    }

    public void wrtFunction(){
        Intent intent = new Intent(Menu.this, writing.class);
        startActivity(intent);
        mediaPlayer.stop();

    }
    public void rdFunction(){
        Intent intent = new Intent(Menu.this, reading.class);
        startActivity(intent);
        mediaPlayer.stop();

    }
    public void anmlsFunction(){
        Intent intent = new Intent(Menu.this, animals.class);
        startActivity(intent);
        mediaPlayer.stop();

    }
    public void qzFunction(){
        Intent intent = new Intent(Menu.this, quiz_menu.class);
        startActivity(intent);
        mediaPlayer.stop();

    }
    public void spllFunction(){
        Intent intent = new Intent(Menu.this, spell_menu.class);
        startActivity(intent);
        mediaPlayer.stop();
    }

}