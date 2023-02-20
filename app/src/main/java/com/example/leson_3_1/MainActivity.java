package com.example.leson_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.ResultReceiver;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        private RecyclerView recyclerView;
        private ArrayList<String> foodList=new ArrayList<>();
        private FoodAdapter adapter=new FoodAdapter(foodList);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.resault_View);
        loaData();
        recyclerView.setAdapter(adapter);
    }

    private void loaData() {
        foodList.add("BISHKEK");
        foodList.add("OSH");
        foodList.add("SOKULUK");
        foodList.add("KARABALTA");
        foodList.add("CHUI");
        foodList.add("TALAS");
        foodList.add("JALALABAD");
        foodList.add("YSYK KOL");
        foodList.add("KYRGZSTAN");
    }
}