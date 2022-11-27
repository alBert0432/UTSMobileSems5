package com.example.myrecycleapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView,clubView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView =itemView.findViewById(R.id.imageview);
        nameView =  itemView.findViewById(R.id.name);
        clubView = itemView.findViewById(R.id.club);


    }
}
