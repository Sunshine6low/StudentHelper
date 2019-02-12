package com.sunshine.wdapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class FoodAdapter extends BaseAdapter {
    Context ctx;
    LayoutInflater lInflater;
    ArrayList<FoodPlace> objects;

    FoodAdapter(Context context, ArrayList<FoodPlace> places) {
        ctx = context;
        objects = places;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    // кол-во элементов
    @Override
    public int getCount() {
        return objects.size();
    }

    // элемент по позиции
    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    // id по позиции
    @Override
    public long getItemId(int position) {
        return position;
    }

    // пункт списка
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // используем созданные, но не используемые view
        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.food_item, parent, false);
        }
        FoodPlace fp = getProduct(position);
        ((TextView) view.findViewById(R.id.foodIdTextView)).setText(fp.getName());
        ((TextView) view.findViewById(R.id.ratingIdTextView)).setText(fp.getRatingString());
        return view;
    }

    // товар по позиции
    FoodPlace getProduct(int position) {
        return ((FoodPlace) getItem(position));
    }

}
