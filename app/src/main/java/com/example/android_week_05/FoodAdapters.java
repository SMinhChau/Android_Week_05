package com.example.android_week_05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodAdapters extends BaseAdapter {

    Context context;
    int layout;
    ArrayList<Food> arrayList;

    public FoodAdapters(Context context, int layout, ArrayList<Food> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return  arrayList.size();
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
        tvTitle.setText(arrayList.get(i).getTitle());
        tvRice.setText(arrayList.get(i).getRice());
        imgTv.setImageResource(arrayList.get(i).getImg());

        return view;
    }
}
