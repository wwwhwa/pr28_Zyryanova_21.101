package com.example.pr28;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class ClockActivity extends AppCompatActivity {
    Button btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);

        ImageView clockImageView = findViewById(R.id.minute_hand);
        Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.minute_turn);
        clockImageView.startAnimation(clockTurnAnimation);

        ImageView hourImageView = findViewById(R.id.hour_hand);
        Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
        hourImageView.startAnimation(hourTurnAnimation);

        btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
