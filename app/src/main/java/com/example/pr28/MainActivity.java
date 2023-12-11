package com.example.pr28;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Clock;

public class MainActivity extends AppCompatActivity{
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimationActivity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ClockActivity.class);
                startActivity(intent);
            }
        });
    }
    /* @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn1){
            Intent intent = new Intent(this, AnimationActivity.class);
            startActivity(intent);
        }if (v.getId() == R.id.btn2){
            Intent intent1 = new Intent(this, ClockActivity.class);
            startActivity(intent1);
        }
    }*/
}