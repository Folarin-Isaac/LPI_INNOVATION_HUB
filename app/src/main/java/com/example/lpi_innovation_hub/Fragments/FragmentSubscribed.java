package com.example.lpi_innovation_hub.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lpi_innovation_hub.R;

public class FragmentSubscribed extends Fragment {
    View v;
    public FragmentSubscribed() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.subscribed_fragment, container, false);
        return v;
    }
}
