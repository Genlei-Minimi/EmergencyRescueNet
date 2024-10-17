package com.example.test4;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PackageManagerCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;


import com.google.android.material.bottomnavigation.BottomNavigationView;


import java.util.ArrayList;


public class CallActivity extends AppCompatActivity implements ContactInterface {

ArrayList<ContactModel> contactModels = new ArrayList<>();
int[] contactImages = {R.drawable.baseline_contacts_24};
static int PERMISSION_CODE = 100;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);


        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setUpContactModel();

        C_RecyclerViewAdapter adapter = new C_RecyclerViewAdapter(this, contactModels, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }
    // this will set up the data from the model
    private void setUpContactModel(){
        String[] contactNames = getResources().getStringArray(R.array.emergency_contacts_list);
        String[] contactNumber = getResources().getStringArray(R.array.emergency_contacts_number);

        for (int i = 0; i<contactNames.length; i++) {
            contactModels.add(new ContactModel(contactNames[i], contactNumber[i],
                    contactImages[0]
            ));
        }

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.bottom_call);
//in order to access the other pages (navigation)
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.bottom_button) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.bottom_call) {
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


        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, PERMISSION_CODE);
        }
    }

//if click then it will direct the user to phone dialer and will input the contact info automatically
    @Override
    public void onItemClick(int position){
        String number = String.valueOf(contactModels.get(position).contactNum);
        String call = "tel:" + number.trim();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(call));




            startActivity(intent);
        }

    }

