package com.example.pr28;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AnimationActivity extends AppCompatActivity {
    Button btnback;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        ImageView moonImageView = findViewById(R.id.moon);
        //Класс AnimationUtils предоставляет методы для загрузки и запуска анимаций.
        // используем метод loadAnimation() для загрузки анимации.
        Animation moonRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.moonrise);
        //startAnimation - запуск анимации
        moonImageView.startAnimation(moonRiseAnimation);

        ImageView cloudImageView = findViewById(R.id.cloud);
        Animation cloudRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.cloudmove);
        cloudImageView.startAnimation(cloudRiseAnimation);

        btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}