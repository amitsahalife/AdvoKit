package com.example.advokit.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advokit.R;


public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView dp,rating,chat;
    TextView name, address,degree,longDes;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        dp = itemView.findViewById(R.id.imageView);
        name = itemView.findViewById(R.id.name);
        degree = itemView.findViewById(R.id.degree);
        address = itemView.findViewById(R.id.address);
rating = itemView.findViewById(R.id.rating);
        longDes = itemView.findViewById(R.id.longDes);
        chat = itemView.findViewById(R.id.chat);

    }
}
