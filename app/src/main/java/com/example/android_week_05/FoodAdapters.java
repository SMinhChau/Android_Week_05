package com.example.android_week_05;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodAdapters extends BaseAdapter {

    Context context;
    int layout;
    ArrayList<Food> arrayList;
    ArrayList<Food> arrayFilter;
    private int positionSelect = -1;

    public FoodAdapters(Context context, int layout, ArrayList<Food> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
        arrayFilter= arrayList;
    }

    @Override
    public int getCount() {
        return  arrayFilter.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(layout,viewGroup,false);
//Anh xa
        TextView tvTitle= view.findViewById(R.id.title);
        TextView tvRice= view.findViewById(R.id.rice);
        ImageView imgTv=  view.findViewById(R.id.img);
        //Gan gia tri
        Food food = arrayFilter.get(i);
        tvTitle.setText(food.getTitle());
        tvRice.setText(food.getRice());
        imgTv.setImageResource(food.getImg());

    view.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent= new Intent(context,ActivityDonut.class);
        intent.putExtra("cake",arrayList.get(i));

        context.startActivity(intent);
    }
    });

        LinearLayout layout= view.findViewById(R.id.item);
    if(positionSelect == i ){
        layout.setBackgroundColor(Color.parseColor("#78BD8C"));
    }
        return view;

    }
    public void setFilter(String filter) {
        arrayFilter = new ArrayList<>();
        System.out.println(filter);
        for(Food food: arrayList) {
            //indexOf: tim chuoi trong chuoi: thanh cong (123) => -1
            if(food.getTitle().toLowerCase().indexOf(filter) != -1) {
                arrayFilter.add(food);
            }
        }
        System.out.println(arrayFilter);

        notifyDataSetChanged();
    }
    public void setFilterBySearch(String giaTriInPut) {
        //123
        setFilter(giaTriInPut);
    }

    public void setAllDonut() {
        arrayFilter = arrayList;
        notifyDataSetChanged();
    }

    public void setFilterPink() {
        setFilter("pink");
    }
    public void setFilterFloating() {
        setFilter("floating");
    }
}
