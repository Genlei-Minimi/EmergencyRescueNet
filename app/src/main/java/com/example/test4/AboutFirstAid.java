package com.example.test4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
//class for first aid

public class AboutFirstAid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_firstaid);

        Button button = findViewById(R.id.button_vid);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(AboutFirstAid.this, VideoFirstAid.class);

            startActivity(intent);
        });


    }

}
