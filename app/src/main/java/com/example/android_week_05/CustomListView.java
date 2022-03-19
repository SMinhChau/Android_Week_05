package com.example.android_week_05;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.os.PersistableBundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomListView extends AppCompatActivity {


    private ListView idListView;
    FoodAdapters adt;
    ArrayList<Food> arrayList;
    Button btnDount, btnPink,btnfloat;

    private EditText textSearch;


    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_activity1);

        idListView =  findViewById(R.id.idListView);
        textSearch= findViewById(R.id.editTextName);
        btnDount = findViewById(R.id.btnDount);
        btnPink = findViewById(R.id.btnPink);
        btnfloat=findViewById(R.id.btnFloat);

        arrayList = new ArrayList<>();


        arrayList.add(new Food("Tasty Donut","$10.00",R.drawable.donut_yellow_1));
        arrayList.add(new Food( "Pink Donut","$20.00",R.drawable.pink_donut_1));
        arrayList.add(new Food( "Floating Donut","$30.00",R.drawable.green_donut_1));
        arrayList.add(new Food("Tasty Donut","$40.00",R.drawable.donut_red_1));
        arrayList.add(new Food("Tasty Donut","$40.00",R.drawable.tasty_donut_1));

        adt= new FoodAdapters(this,R.layout.item_list,arrayList);
        idListView.setAdapter(adt);

        textSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                adt.setFilterBySearch(editable.toString());
            }
        });


        btnDount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adt.setAllDonut();
            }
        });
        btnPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adt.setFilterPink();
            }
        });
        btnfloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adt.setFilterFloating();
            }
        });
    }


}
