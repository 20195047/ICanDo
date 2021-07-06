package com.example.icando;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class animals extends AppCompatActivity {

    private ArrayList<MediaPlayer> mediaPlayer;
    private ArrayList<String> animals;
    private ViewFlipper viewFlipper;
    private Button nxt, prv;
    private TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        viewFlipper = findViewById(R.id.viewFlipper);
        nxt = findViewById(R.id.nxt);
        prv = findViewById(R.id.prv);
        name = findViewById(R.id.name);

        animals = new ArrayList<>();
        animals.add("CAT");
        animals.add("CHICKEN");
        animals.add("COW");
        animals.add("DOG");
        animals.add("ELEPHANT");
        animals.add("FROG");
        animals.add("GOAT");
        animals.add("HORSE");
        animals.add("TIGER");
        animals.add("ZEBRA");


        mediaPlayer = new ArrayList<>();
        mediaPlayer.add(MediaPlayer.create(animals.this,R.raw.catmp3));
        mediaPlayer.add(MediaPlayer.create(animals.this,R.raw.chickenmp3));
        mediaPlayer.add(MediaPlayer.create(animals.this,R.raw.cowmp3));
        mediaPlayer.add(MediaPlayer.create(animals.this,R.raw.dogmp3));
        mediaPlayer.add(MediaPlayer.create(animals.this,R.raw.elephantmp3));
        mediaPlayer.add(MediaPlayer.create(animals.this,R.raw.frogmp3));
        mediaPlayer.add(MediaPlayer.create(animals.this,R.raw.goatmp3));
        mediaPlayer.add(MediaPlayer.create(animals.this,R.raw.horsemp3));
        mediaPlayer.add(MediaPlayer.create(animals.this,R.raw.tigermp3));
        mediaPlayer.add(MediaPlayer.create(animals.this,R.raw.zebramp3));

        int num2 = 0;
        mediaPlayer.get(num2).start();
        mediaPlayer.get(num2).setLooping(true);
        name.setText(animals.get(num2));

       nxt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               nextButton();
           }
       });
       prv.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               prevButton();
           }
       });
    }

    int num = 0;
    public void nextButton(){
        mediaPlayer.get(num).pause();
        viewFlipper.showNext();
        num++;
        mediaPlayer.get(num).start();
        name.setText(animals.get(num));
        mediaPlayer.get(num).setLooping(true);
        nxt.setEnabled(!(num==9));
        prv.setEnabled(num>0);
    }
    public void prevButton(){
        mediaPlayer.get(num).pause();
        viewFlipper.showPrevious();
        num--;
        mediaPlayer.get(num).start();
        name.setText(animals.get(num));
        mediaPlayer.get(num).setLooping(true);
        nxt.setEnabled(num<9);
        prv.setEnabled(!(num==0));
    }

    @Override
    public void onBackPressed() {
        mediaPlayer.get(num).stop();
        super.onBackPressed();
    }
}