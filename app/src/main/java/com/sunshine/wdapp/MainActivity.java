package com.sunshine.wdapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    ArrayList<FoodPlace> foodPlaces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        RecyclerView foodList = findViewById(R.id.foodRV);
        foodList.setLayoutManager(new LinearLayoutManager(this));
        FoodRvAdapter foodRvAdapter = new FoodRvAdapter(foodPlaces);
        foodList.setAdapter(foodRvAdapter);
        foodList.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
                return false;
            }

            @Override
            public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean b) {

            }
        });
    }

    private void init(){
        //TODO Переделать список в базу данных
        foodPlaces = new ArrayList<>();
        foodPlaces.add(new FoodPlace("Греча",  4.5f, "Тут будет описание.", 44.594327, 33.532293));
        foodPlaces.add(new FoodPlace("Турист", 3f, "Тут", 44.594974, 33.531343));
    }
}
