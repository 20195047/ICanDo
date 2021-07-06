package com.example.icando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class funquiz extends AppCompatActivity {

    private ImageView imageView;
    private ArrayList<String> images;
    private EditText answer;
    private Button submit, begin;
    private TextView textView, textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funquiz);

        imageView = findViewById(R.id.imageView);
        images = new ArrayList<>();
        images.add("android.resource://" + getPackageName() + "/" + R.drawable.sun);
        images.add("android.resource://" + getPackageName() + "/" + R.drawable.cow1);
        images.add("android.resource://" + getPackageName() + "/" + R.drawable.ball);
        images.add("android.resource://" + getPackageName() + "/" + R.drawable.dog1);
        images.add("android.resource://" + getPackageName() + "/" + R.drawable.van);

        answer = findViewById(R.id.answer);
        submit = findViewById(R.id.submit);
        begin = findViewById(R.id.begin);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);

        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beginbtn();
            }
        });
        submit.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitbtn();
            }
        }));
    }
    int num = 0;
    int point = 0;
    int item = 1;
    public void beginbtn(){
        answer.setEnabled(true);
        submit.setEnabled(true);
        Uri uri = Uri.parse(images.get(num));
        imageView.setImageURI(uri);
        begin.setEnabled(false);
    }
    public void submitbtn(){
        String ans = answer.getText().toString();
        textView.setText(item+"/5");
        if(num==0){
            if(ans.equals("sun")||ans.equals("Sun")||ans.equals("SUN")){
                point++;
                answer.setText("");
            }
        }if(num==1){
            if(ans.equals("cow")||ans.equals("Cow")||ans.equals("COW")){
                point++;
                answer.setText("");
            }
        }if(num==2){
            if(ans.equals("ball")||ans.equals("Ball")||ans.equals("BALL")){
                point++;
                answer.setText("");
            }
        }if(num==3){
            if(ans.equals("dog")||ans.equals("Dog")||ans.equals("DOG")){
                point++;
                answer.setText("");
            }
        }if(num==4){
            if(ans.equals("van")||ans.equals("Van")||ans.equals("VAN")){
                point++;
                answer.setText("");
            }
        }if(item==5){
            if (point>2){
                Intent intent = new Intent(funquiz.this, score.class);
                String scr = String.valueOf(point);
                intent.putExtra("SCORE", scr);
                startActivity(intent);
            }else{
                Intent intent = new Intent(funquiz.this, quiz_menu.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Ooops!, Sorry, Try to do your Best Next Time", Toast.LENGTH_LONG).show();
            }
        }
        item++;
        textView1.setText("Your Score:"+point);
        num++;
        Uri uri = Uri.parse(images.get(num));
        imageView.setImageURI(uri);

    }

}