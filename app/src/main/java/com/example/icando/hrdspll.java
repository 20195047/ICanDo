package com.example.icando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class hrdspll extends AppCompatActivity {

    private MediaPlayer media;
    private ArrayList<MediaPlayer> mediaPlayer;
    private EditText spells;
    private Button submits, played;
    private ImageButton playable;
    private TextView items, scores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hrdspll);
        spells = findViewById(R.id.spells);
        submits = findViewById(R.id.submits);
        played = findViewById(R.id.played);
        playable = findViewById(R.id.playable);
        items = findViewById(R.id.items);
        scores = findViewById(R.id.scores);

        mediaPlayer = new ArrayList<>();
        mediaPlayer.add(MediaPlayer.create(hrdspll.this,R.raw.xylophone2));
        mediaPlayer.add(MediaPlayer.create(hrdspll.this,R.raw.jellyfish2));
        mediaPlayer.add(MediaPlayer.create(hrdspll.this,R.raw.elephant2));
        mediaPlayer.add(MediaPlayer.create(hrdspll.this,R.raw.zebra2));
        mediaPlayer.add(MediaPlayer.create(hrdspll.this,R.raw.orange2));

        spells.addTextChangedListener(loginTextWatcher);

        played.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playbtn();
            }
        });
        submits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitted();
            }
        });
        playable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plybtn();
            }
        });
    }

    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String answer = spells.getText().toString().trim();

            submits.setEnabled(!answer.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    public void playbtn(){
        spells.setEnabled(true);
        played.setEnabled(false);
        media = MediaPlayer.create(hrdspll.this, R.raw.letspell);
        media.start();
    }

    int num = 0;
    int score = 0;
    int item = 1;
    public void plybtn(){
        mediaPlayer.get(num).start();
    }

    public void submitted(){
        String answer = spells.getText().toString().trim();
        items.setText(item+"/5");
        if (num==0){
            if (answer.equals("xylophone")||answer.equals("Xylophone")||answer.equals("XYLOPHONE")){
                score++;
                spells.setText("");
            }
        }if (num==1){
            if (answer.equals("jellyfish")||answer.equals("Jellyfish")||answer.equals("JELLYFISH")){
                score++;
                spells.setText("");
            }
        }if (num==2){
            if (answer.equals("elephant")||answer.equals("Elephant")||answer.equals("ELEPHANT")){
                score++;
                spells.setText("");
            }
        }if (num==3){
            if (answer.equals("zebra")||answer.equals("Zebra")||answer.equals("ZEBRA")){
                score++;
                spells.setText("");
            }
        }if (num==4){
            if (answer.equals("orange")||answer.equals("Orange")||answer.equals("ORANGE")){
                score++;
                spells.setText("");
            }
        }if (item==5){
            if (score>2) {
                Intent intent = new Intent(hrdspll.this, score.class);
                String scr = String.valueOf(score);
                intent.putExtra("SCORE", scr);
                startActivity(intent);
            }else{
                Intent intent = new Intent(hrdspll.this, spell_menu.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Ooops!, Sorry, Try to do your Best Next Time", Toast.LENGTH_LONG).show();
            }
        }else{
            spells.setText("");
        }
        scores.setText("Your Score:"+score);
        num++;
        item++;
    }
}