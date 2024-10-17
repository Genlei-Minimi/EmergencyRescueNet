package com.example.test4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
//class for cpr page

public class CprActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpr);


            Button button = findViewById(R.id.button_vid);
            button.setOnClickListener(v -> {
                Intent intent = new Intent(CprActivity.this, VideoCPR.class);

                startActivity(intent);
            });
    }
}
