package com.example.advokit.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.advokit.R;
import com.example.advokit.adapter.MyAdapter;
import com.example.advokit.adapter.hireAdapter;
import com.example.advokit.dataClass.DataClass;

import java.util.ArrayList;
import java.util.List;


public class homeFragment extends Fragment {
    RecyclerView recyclerView;
    List<DataClass> dataList;
    MyAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        List<DataClass> data = new ArrayList<>();
        recyclerView = view.findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new MyAdapter(getContext(),data));


        // photo strictly land
  // data.add(new DataClass("Narenda Modi","vatar",R.drawable.male_four));
//data.add (new DataClass("vatar",))
data.add(new DataClass("Criminal Case","SAibal bose khuni",R.drawable.dummy));
        data.add(new DataClass("BAL BOSE DEAD OR ALIVE?","A 25 Year old man shot dead \n" +
                "A surprising case has come from the narimore, Burdwan. 50 year old Mother in law fell in love"
              +  "with her son in law , The duo ran away after getting the father in law heavily intoxicated"

                ,R.drawable.dummy_two));
// syntax (title, description , then photo) (photo landscape mandatory )
        // TODO @VANSHIKA

     //   data.add(new DataClass("title of the case","description (try to write first line then use slash n it will be better",R.drawable.photo));



    }
}