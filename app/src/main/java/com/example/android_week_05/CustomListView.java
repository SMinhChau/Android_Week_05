package com.example.android_week_05;

import android.os.Bundle;

import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomListView extends AppCompatActivity {
    private List<Food> listFood;
    private ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_activity1);

        listView = (ListView) findViewById(R.id.idListView);
        listFood = new ArrayList<>();
        listFood.add(new Food(1, "Tasty Donut","$10.00"));
        listFood.add(new Food(2, "Pink Donut","$20.00"));
        listFood.add(new Food(3, "Floating Donut","$30.00"));
        listFood.add(new Food(4, "Tasty Donut","$40.00"));

       FoodAdapter adapter = new FoodAdapter(this,R.layout.item_custom_list_view,listFood);
        listView.setAdapter(adapter);
    }
}
