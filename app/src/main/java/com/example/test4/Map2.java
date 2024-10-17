package com.example.test4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class Map2 extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.map_2);
        ImageButton imageButton = findViewById(R.id.backbutton);
        imageButton.setOnClickListener(this::onClick);

        int image = getIntent().getIntExtra("IMAGE", 0);

        ImageView MapImage = findViewById(R.id.map2image);

        MapImage.setImageResource(image);
        //MapImage.setRotation(MapImage.getRotation()+90F);

    }

    private void onClick(View v) {
        onBackPressed();


    }
}
