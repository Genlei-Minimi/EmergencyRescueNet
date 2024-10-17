package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    Button button1;
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.bottom_button);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.bottom_button) {
                return true;
            } else if (itemId == R.id.bottom_call) {
                startActivity(new Intent(getApplicationContext(), CallActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.bottom_contacts) {
                startActivity(new Intent(getApplicationContext(), MapActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.bottom_aid) {
                startActivity(new Intent(getApplicationContext(), FirstAidActivity.class));
                finish();
                return true;
            }
            return false;
        });
        button1 = findViewById(R.id.btn1_emergency);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.wiwiwi);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();

                    }
                });
               mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                   @Override
                   public void onCompletion(MediaPlayer mp) {
                       mp.release();
                   }
               });
            }
        });
    }
}