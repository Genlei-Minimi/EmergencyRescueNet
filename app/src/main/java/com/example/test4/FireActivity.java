package com.example.test4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
//class for fire prevention tips

public class FireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_prevention);


        Button button = findViewById(R.id.button_vid2);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(FireActivity.this, VideoFire.class);

            startActivity(intent);
        });
    }
}
