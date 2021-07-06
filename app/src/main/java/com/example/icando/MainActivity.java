package com.example.icando;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button containedButton;

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    containedButton =(Button) findViewById(R.id.containedButton);

            mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.bgmusic);
            mediaPlayer.setLooping(true);
            mediaPlayer.start();

            containedButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btnFunction();
                }
            });



    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Are you sure you want to Exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.super.onBackPressed();
                        mediaPlayer.stop();
                    }
                })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    public void btnFunction() {
        Intent intent = new Intent(MainActivity.this, Menu.class);
        startActivity(intent);
        mediaPlayer.stop();
    }
}