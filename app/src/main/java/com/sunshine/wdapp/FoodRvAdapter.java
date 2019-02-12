package com.sunshine.wdapp;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

class FoodRvAdapter extends RecyclerView.Adapter<FoodRvAdapter.FoodViewHolder> {
    private ArrayList<FoodPlace> foodPlaces;

    FoodRvAdapter(ArrayList<FoodPlace> foodPlaces) {
        this.foodPlaces = foodPlaces;
    }

    @Override
    public int getItemCount() {
        return foodPlaces.size();
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.food_item, viewGroup, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final FoodViewHolder foodViewHolder, int i) {
        /*final BitmapFactory.Options bitmapOptions = new BitmapFactory.Options();
        DisplayMetrics displayMetrics = foodViewHolder.rs.getDisplayMetrics();
        bitmapOptions.inDensity = displayMetrics.densityDpi;
        bitmapOptions.inTargetDensity = 1;

        final Bitmap bitmap = BitmapFactory.decodeResource(foodViewHolder.rs, R.drawable.mat, bitmapOptions);
        bitmap.setDensity(Bitmap.DENSITY_NONE);
        foodViewHolder.view.post(new Runnable() {
            @Override
            public void run() {
                Bitmap.createBitmap(bitmap, 0, 0, foodViewHolder.rl.getWidth(), bitmap.getHeight());
                foodViewHolder.imageView.setImageBitmap(bitmap);
            }
        });*/
        foodViewHolder.imageView.setImageDrawable(foodViewHolder.rs.getDrawable(R.drawable.mat));
        foodViewHolder.name.setText(foodPlaces.get(i).getName());
        foodViewHolder.desc.setText(foodPlaces.get(i).getDesc());
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }



    static class FoodViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView name;
        TextView desc;
        ImageView imageView;
        RelativeLayout rl;
        Resources rs;
        View view;
        FoodViewHolder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.cv);
            name = itemView.findViewById(R.id.foodIdTextView);
            desc = itemView.findViewById(R.id.ratingIdTextView);
            imageView = itemView.findViewById(R.id.imagefv);
            rl = itemView.findViewById(R.id.rlFv);
            rs = itemView.getResources();
            view = itemView;
        }
    }
}
