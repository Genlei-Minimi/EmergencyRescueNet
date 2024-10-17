package com.example.test4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
//class for earthquake safety precautions

public class EQActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equake);


        Button button = findViewById(R.id.button_vid1);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(EQActivity.this, VideoEQ.class);

            startActivity(intent);
        });
    }


}
