package com.example.icando;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import java.util.ArrayList;

public class reading extends AppCompatActivity {

    private VideoView videoView;
    private Button next, prev;
    private MediaPlayer mediaPlayer;
    private ArrayList<String> videoPatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);

        videoPatch = new ArrayList<>();
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.apple);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.ball);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.cow);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.dog);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.elephant);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.frog);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.goat);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.horse);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.icecream);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.jellyfish);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.kite);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.lion);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.mirror);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.nest);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.orange);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.pencil);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.queen);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.rabbit);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.sun);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.tiger);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.umbrella);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.van);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.window);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.xylophone);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.yak);
        videoPatch.add("android.resource://" + getPackageName() + "/" + R.raw.zebra);


        next = findViewById(R.id.next);
        prev = findViewById(R.id.prev);
        videoView = findViewById(R.id.videoView);

        mediaPlayer = MediaPlayer.create(reading.this,R.raw.bgmusic);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextbtn();
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prevbtn();
            }
        });

    }
    int num = 0;

    public void nextbtn(){
        mediaPlayer.stop();
        if(num>25){
            num=0;
        }
        Uri uri = Uri.parse(videoPatch.get(num));
        videoView.setVideoURI(uri);
        videoView.start();
        num++;
    }
    public void prevbtn(){
        mediaPlayer.stop();
        num=num-2;
        if(num<0){
            num=25;
        }
        Uri uri = Uri.parse(videoPatch.get(num));
        videoView.setVideoURI(uri);
        videoView.start();
        num++;

    }
}