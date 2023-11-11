package com.example.advokit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advokit.R;
import com.example.advokit.dataClass.Item;

import java.util.List;

public class FeedAdapter extends RecyclerView.Adapter<ViewHolder> {
    Context context;
    List<Item> items;

    public FeedAdapter(Context context,List<Item>items){
        this.context = context;
        this.items = items;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(items.get(position).getName());
        holder.address.setText(items.get(position).getAddress());
        holder.distance.setText(items.get(position).getDistacne());
        holder.hobby.setText(items.get(position).getHobby());
        holder.longDes.setText(items.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
