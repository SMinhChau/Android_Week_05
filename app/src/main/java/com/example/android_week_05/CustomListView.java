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
    private List<Food> cakeList;
    private List<Food> list;
    private List<Food> cakeBtn;
    private EditText textSearch;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_activity1);

        idListView =  findViewById(R.id.idListView);
        textSearch= findViewById(R.id.editTextName);
        btnDount = findViewById(R.id.btnDount);
        btnPink = findViewById(R.id.btnPink);
        btnfloat=findViewById(R.id.btnAdd);

        arrayList = new ArrayList<>();
        list= new ArrayList<>();

        arrayList.add(new Food("Tasty Donut","$10.00",R.drawable.donut_yellow_1));
        arrayList.add(new Food( "Pink Donut","$20.00",R.drawable.pink_donut_1));
        arrayList.add(new Food( "Floating Donut","$30.00",R.drawable.green_donut_1));
        arrayList.add(new Food("Tasty Donut","$40.00",R.drawable.donut_red_1));
        arrayList.add(new Food("Tasty Donut","$40.00",R.drawable.tasty_donut_1));

        adt= new FoodAdapters(this,R.layout.item_list,arrayList);
        idListView.setAdapter(adt);

        cakeBtn = new ArrayList<>();
        cakeList= new ArrayList<>();

        textSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                cakeList.clear();

                String regex ="^("+s.toString().toUpperCase()+").*";
                for (Food cake: cakeBtn){
                    if (cake.getTitle().toUpperCase().matches(regex)){
                        cakeList.add(cake);
                    }
                }

                adt.notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        idListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Food cale= list.get(i);
//                Toast.makeText(getApplicationContext(),"dddd",Toast.LENGTH_LONG).show();
//                Intent intent= new Intent(CustomListView.this,ActivityDonut.class);
//
//                Bundle bundle= new Bundle();
//                bundle.putString("title",arrayList.get(i).getTitle());
//                bundle.putString("price",arrayList.get(i).getRice());
//                bundle.putInt("img",arrayList.get(i).getImg());
//                intent.putExtra("cake",bundle);
//                startActivity(intent);
            }
        });

    }


}
