package com.example.advokit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advokit.R;
import com.example.advokit.dataClass.Item;

import java.util.List;

public class hireAdapter extends RecyclerView.Adapter<ViewHolder> {
    Context context;
    List<Item> items;

    public hireAdapter(Context context, List<Item>items){
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

    holder.dp.setImageResource(items.get(position).getImage());
        holder.name.setText(items.get(position).getName());
        holder.address.setText(items.get(position).getAddress());
        holder.degree.setText(items.get(position).getDegree());
//holder.rating.setImageResource(items.get(position).getRating());
    //    holder.rating.setImageDrawable(items.get(position).getRating());
        holder.longDes.setText(items.get(position).getDescription());
        holder.chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo text change
                Toast.makeText(context.getApplicationContext(), "Sorry currently we are working on this feature It will release soon",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
