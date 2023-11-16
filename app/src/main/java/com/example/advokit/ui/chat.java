package com.example.advokit.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.example.advokit.R;
public class chat extends Fragment{
LottieAnimationView work;
ImageButton button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        work = view.findViewById(R.id.working);
        button = view.findViewById(R.id.send_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  work.getVisibility();
               // work.setVisibility(1);
                work.setVisibility(View.VISIBLE);
                Toast.makeText(getContext(),"working",Toast.LENGTH_SHORT).show();
            }
        });

    }
}