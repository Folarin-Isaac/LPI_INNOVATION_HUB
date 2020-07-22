package com.example.lpi_innovation_hub.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lpi_innovation_hub.Activity.All;
import com.example.lpi_innovation_hub.Adapters.RecyclerAdapter;
import com.example.lpi_innovation_hub.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentAll extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private List<All>listAll;

    public FragmentAll() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.all_fragment, container, false);
        recyclerView= (RecyclerView)v.findViewById(R.id.recyclerView);
        RecyclerAdapter recyclerAdapter= new RecyclerAdapter(getContext(), listAll);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listAll = new ArrayList<>();

        //List of all items to be displayed in the RecyclerView
        listAll.add(new All("Adedeji Gideon", "adedejigideon12@gmail.com", R.drawable.man));
        listAll.add(new All("Folarin Isaac", "folarinisaac36@gmail.com", R.drawable.my_passport));
        listAll.add(new All("Arinze Onyeasigbulem", "christogonus45@gmail.com", R.drawable.man));
        listAll.add(new All("Deborah Joseph", "josdebum@gmail.com", R.drawable.man));
        listAll.add(new All("Aina Esther", "ainaesther@gmail.com", R.drawable.man));
        listAll.add(new All("Adenike Christianah", "nikkychristy@gmail.com", R.drawable.man));
        listAll.add(new All("Paul Okeke", "okekepaul@gmail.com", R.drawable.man));
        listAll.add(new All("Emmanuel John", "emmanueljohnny@gmail.com", R.drawable.man));
        listAll.add(new All("Dickson Michael", "dicksonmike100@gmail.com", R.drawable.man));
        listAll.add(new All("Mustapha Michael", "mustaphamike@gmail.com", R.drawable.man));

    }


}
