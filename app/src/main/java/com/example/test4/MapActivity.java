package com.example.test4;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


public class MapActivity extends AppCompatActivity implements MapInterface{
    ArrayList<MapModel> mapModels = new ArrayList<>();
    RecyclerView recyclerView;

    int[] mapImages2 = {R.drawable.cte1, R.drawable.cte2, R.drawable.alumni1,
            R.drawable.alumni2, R.drawable.amphi, R.drawable.cbma1, R.drawable.cbma2,R.drawable.ccjebldg, R.drawable.ccjelab,R.drawable.ccs1,
            R.drawable.ccs2, R.drawable.chmt1, R.drawable.chmt2, R.drawable.cit, R.drawable.coe1, R.drawable.coe2,
            R.drawable.coe3, R.drawable.gad, R.drawable.lib1, R.drawable.lib2, R.drawable.multi1, R.drawable.multi2,
            R.drawable.multi3, R.drawable.multi4, R.drawable.multi5, R.drawable.gebl1, R.drawable.gebl2, R.drawable.gebr1, R.drawable.gebr2,
           R.drawable.ssc, R.drawable.unigym1, R.drawable.unigym2, R.drawable.unihostel1, R.drawable.unihostel2};


    int[] mapImages = {R.drawable.cte11, R.drawable.cte22, R.drawable.alumni22,
            R.drawable.alumni11, R.drawable.amphi1, R.drawable.cbma11, R.drawable.cbma22,R.drawable.ccjebldg11, R.drawable.ccjelab11, R.drawable.ccs11,
            R.drawable.ccs22, R.drawable.chmt11, R.drawable.chmt22, R.drawable.cit11, R.drawable.coe11, R.drawable.coe22,
            R.drawable.coe33, R.drawable.gad11, R.drawable.lib11, R.drawable.lib22, R.drawable.multi11, R.drawable.multi22,
            R.drawable.multi33, R.drawable.multi44, R.drawable.multi55, R.drawable.gebl11, R.drawable.gebl22, R.drawable.gebr11, R.drawable.gebr22,
            R.drawable.ssc11, R.drawable.unigym11, R.drawable.unigym22, R.drawable.unihostel11, R.drawable.unihostel22};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        recyclerView = findViewById(R.id.mapRecyclerView);


  setUpMapModel();

        M_RecyclerViewAdapter adapter = new M_RecyclerViewAdapter(this, mapModels, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private void setUpMapModel(){
        String[] mapList = getResources().getStringArray(R.array.map);

        for (int i = 0; i<mapImages.length; i++) {
            mapModels.add(new MapModel(mapList[i],
                    mapImages[i], mapImages2[i]
            ));
        }

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.bottom_contacts);
//in order to access the other pages (navigation)
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.bottom_button) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.bottom_contacts) {
                return true;
            } else if (itemId == R.id.bottom_call) {
                startActivity(new Intent(getApplicationContext(), CallActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.bottom_aid) {
                startActivity(new Intent(getApplicationContext(), FirstAidActivity.class));
                finish();
                return true;
            }
            return false;
        });



    }

    @Override
    public void onItemClick(int position){
        Intent intent = new Intent(MapActivity.this, Map2.class);
        intent.putExtra("IMAGE", mapModels.get(position).getMapImage2());


        startActivity(intent);
    }

}






