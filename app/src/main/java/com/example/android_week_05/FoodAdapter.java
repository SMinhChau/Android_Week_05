package com.example.android_week_05;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class FoodAdapter extends BaseAdapter {

    private Context context;
    private int idLayout;
    private List<Food> listFood;
    private int positionSelect = -1;

    public FoodAdapter(Context context, int idLayout, List<Food> listFood) {
        this.context = context;
        this.idLayout = idLayout;
        this.listFood = listFood;
    }

    @Override
    public int getCount() {
        if (listFood.size() != 0 && !listFood.isEmpty()) {
            return listFood.size();
        }
        return 0;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        TextView titleText =  convertView.findViewById(R.id.title);
        TextView rice=  convertView.findViewById(R.id.rice);
        ImageView imageView =  convertView.findViewById(R.id.logo);


        final LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.layoutItem);
        final Food language = listFood.get(position);

        if (listFood!= null && !listFood.isEmpty()) {
            titleText.setText(language.getTitle());
            rice.setText(language.getRice());
            int idLanguage = language.getImg();

        }

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,language.getTitle(), Toast.LENGTH_LONG).show();
                positionSelect = position;
                notifyDataSetChanged();
            }
        });

        if (positionSelect == position) {
            linearLayout.setBackgroundColor(Color.BLUE);

        } else {
            linearLayout.setBackgroundColor(Color.WHITE);

        }
        return convertView;
    }
}
