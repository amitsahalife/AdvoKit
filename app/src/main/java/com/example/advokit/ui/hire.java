package com.example.advokit.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.advokit.R;
import com.example.advokit.adapter.hireAdapter;
import com.example.advokit.dataClass.Item;

import java.util.ArrayList;
import java.util.List;


public class hire extends Fragment {
    RecyclerView recyclerView;
    public hire() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feed, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        List<Item> items = new ArrayList<Item>();
        recyclerView = view.findViewById(R.id.recyler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new hireAdapter(getContext(),items));

      //  items.add(new Item(R.drawable.facebook_logo,"Amit Saha","Android Developer","Within 2 KM","Coffee | Coding | Friendship","Hi community! I am open to new connections ☺"));

       // items.add(new Item(,"amit","ss","ba",R.drawable.five_star,"ht"));
// TODO VANSHIKA
        items.add(new Item(R.drawable.male_one,"Amit Saha","jam Duyar","B.Tech In Criminal"
                ,5,"im better than kd pathak"
        ));

    }
}