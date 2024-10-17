package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AidTips extends AppCompatActivity  {
    Button btnBLS;
    Button btnCPR;
    Button btnF;
    Button btnT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_injury);

        btnBLS = findViewById(R.id.btnBLS);
        btnCPR = findViewById(R.id.btnCPR);
        btnF = findViewById(R.id.btnFirstAid);
        btnT = findViewById(R.id.btnTreatment);

        // if the button click then it will go to Basic Life Support Page

        btnBLS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AidTips.this, BasicLifeSupport.class);
                startActivity(intent);

    }});

        // if the button click then it will go to CPR page
        btnCPR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AidTips.this, CprActivity.class);
                startActivity(intent);

            }});
        // if the button click then it will go to First Aid Info page
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AidTips.this, AboutFirstAid.class);
                startActivity(intent);

            }});
        // if the button click then it will go to Basic Treatment page
        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AidTips.this, TreatmentActivity.class);
                startActivity(intent);

            }});
    }}
