package com.example.advokit.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advokit.R;


public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView name, email,distance, address,hobby,longDes;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imageView);
        name = itemView.findViewById(R.id.name);
        distance = itemView.findViewById(R.id.distance);
        address = itemView.findViewById(R.id.textView);
        hobby= itemView.findViewById(R.id.shortDescription);
        longDes = itemView.findViewById(R.id.longDes);

    }
}
