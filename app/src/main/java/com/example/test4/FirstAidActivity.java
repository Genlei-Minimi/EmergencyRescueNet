package com.example.test4;

import static com.example.test4.R.id.btn_injury;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.widget.Button;
import android.widget.ImageButton;


public class FirstAidActivity extends AppCompatActivity {
    ImageButton btnInj;
    ImageButton btnFire;

    ImageButton btnEqauke;

    ImageButton btnTp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_aid);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.bottom_aid);


//in order to access the other pages (navigation)
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.bottom_button) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.bottom_call) {
                startActivity(new Intent(getApplicationContext(), CallActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.bottom_contacts) {
                startActivity(new Intent(getApplicationContext(), MapActivity.class));
                finish();
                return true;
            } else return itemId == R.id.bottom_aid;
        });
// to access the tips page
        btnInj = findViewById(R.id.btn_injury);
        btnFire = findViewById(R.id.btn_fire);
        btnEqauke = findViewById(R.id.btn_eq);
        btnTp = findViewById(R.id.btn_tp);
        btnInj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(FirstAidActivity.this, AidTips.class);
               startActivity(intent);



            }
        });

        btnFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstAidActivity.this, FireActivity.class);
                startActivity(intent);



            }
        });

        btnEqauke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstAidActivity.this, EQActivity.class);
                startActivity(intent);



            }
        });

        btnTp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstAidActivity.this, TyphoonActivity.class);
                startActivity(intent);



            }
        });


    }
}
