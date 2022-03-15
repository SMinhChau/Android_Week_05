package com.example.android_week_05;

import android.os.Bundle;

import android.os.PersistableBundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomListView extends AppCompatActivity {


    private ListView idListView;
    FoodAdapters adt;
    ArrayList<Food> arrayList;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_activity1);
        idListView =  findViewById(R.id.idListView);

        arrayList = new ArrayList<>();
        arrayList.add(new Food("Tasty Donut","$10.00",R.drawable.donut_yellow_1));
        arrayList.add(new Food( "Pink Donut","$20.00",R.drawable.pink_donut_1));
        arrayList.add(new Food( "Floating Donut","$30.00",R.drawable.green_donut_1));
        arrayList.add(new Food("Tasty Donut","$40.00",R.drawable.donut_red_1));

        adt= new FoodAdapters(this,R.layout.item_list,arrayList);

        idListView.setAdapter(adt);
    }
}
