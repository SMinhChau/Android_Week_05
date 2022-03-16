package com.example.android_week_05;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityDonut extends AppCompatActivity {

    private ImageView img;
    private TextView tvTittle;
    private TextView tvRice;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_donut);

    Intent intent= getIntent();
    Food food= (Food) intent.getSerializableExtra("cake");
    System.out.println(food);

    img= findViewById(R.id.imageDetail);
    tvTittle=findViewById(R.id.tvDetail);
    tvRice=findViewById(R.id.price);

    img.setImageResource(food.getImg());
    tvTittle.setText(food.getTitle());
    tvRice.setText(food.getRice());
    }
}
