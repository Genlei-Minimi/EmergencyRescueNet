package com.example.test4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TyphoonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typhoon);


        Button button = findViewById(R.id.button_vid3);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(TyphoonActivity.this, VideoTyphoon.class);

            startActivity(intent);
        });
    }
}
