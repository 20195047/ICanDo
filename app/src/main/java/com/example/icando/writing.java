package com.example.icando;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class writing extends AppCompatActivity {
    private VideoView videoView;
    private Button letter_a, letter_b, letter_c, letter_d, letter_e, letter_f, letter_g,
            letter_h, letter_i, letter_j, letter_k, letter_l, letter_m, letter_n, letter_o, letter_p,
            letter_q, letter_r, letter_s, letter_t, letter_u, letter_v, letter_w, letter_x, letter_y,
            letter_z;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writing);
        videoView = findViewById(R.id.videoView);
        letter_a = findViewById(R.id.letter_a);
        letter_b = findViewById(R.id.letter_b);
        letter_c = findViewById(R.id.letter_c);
        letter_d = findViewById(R.id.letter_d);
        letter_e = findViewById(R.id.letter_e);
        letter_f = findViewById(R.id.letter_f);
        letter_g = findViewById(R.id.letter_g);
        letter_h = findViewById(R.id.letter_h);
        letter_i = findViewById(R.id.letter_i);
        letter_j = findViewById(R.id.letter_j);
        letter_k = findViewById(R.id.letter_k);
        letter_l = findViewById(R.id.letter_l);
        letter_m = findViewById(R.id.letter_m);
        letter_n = findViewById(R.id.letter_n);
        letter_o = findViewById(R.id.letter_o);
        letter_p = findViewById(R.id.letter_p);
        letter_q = findViewById(R.id.letter_q);
        letter_r = findViewById(R.id.letter_r);
        letter_s = findViewById(R.id.letter_s);
        letter_t = findViewById(R.id.letter_t);
        letter_u = findViewById(R.id.letter_u);
        letter_v = findViewById(R.id.letter_v);
        letter_w = findViewById(R.id.letter_w);
        letter_x = findViewById(R.id.letter_x);
        letter_y = findViewById(R.id.letter_y);
        letter_z = findViewById(R.id.letter_z);

        mediaPlayer = MediaPlayer.create(writing.this,R.raw.bgmusic);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
        

        letter_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonA();
            }
        });

        letter_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonB();
            }
        });

        letter_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonC();
            }
        });

        letter_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonD();
            }
        });

        letter_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonE();
            }
        });

        letter_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonF();
            }
        });

        letter_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonG();
            }
        });

        letter_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonH();
            }
        });

        letter_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonI();
            }
        });

        letter_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonJ();
            }
        });

        letter_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonK();
            }
        });

        letter_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonL();
            }
        });

        letter_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonM();
            }
        });

        letter_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonN();
            }
        });

        letter_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonO();
            }
        });

        letter_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonP();
            }
        });

        letter_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonQ();
            }
        });

        letter_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonR();
            }
        });

        letter_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonS();
            }
        });

        letter_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonT();
            }
        });

        letter_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonU();
            }
        });

        letter_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonV();
            }
        });

        letter_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonW();
            }
        });

        letter_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonX();
            }
        });

        letter_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonY();
            }
        });

        letter_z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonZ();
            }
        });

    }

    @Override
    public void onBackPressed() {
        mediaPlayer.stop();
        super.onBackPressed();

    }

    public void buttonA(){
        mediaPlayer.pause();
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.alpha_a;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
    public void buttonB(){
        mediaPlayer.pause();
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.alpha_b;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonC(){
        mediaPlayer.pause();
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.alpha_c;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonD(){
        mediaPlayer.pause();
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.alpha_d;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonE(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_e;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonF(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_f;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonG(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_g;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonH(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_h;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonI(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_i;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonJ(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_j;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonK(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_k;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonL(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_l;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonM(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_m;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonN(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_n;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonO(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_o;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonP(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_p;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonQ(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_q;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonR(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_r;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonS(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_s;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonT(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_t;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonU(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_u;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonV(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_v;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonW(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_w;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonX(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_x;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonY(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_y;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void buttonZ(){
        mediaPlayer.pause();
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.alpha_z;
        Uri uri = Uri.parse(videoPath1);
        videoView.setVideoURI(uri);
        videoView.start();
    }
}