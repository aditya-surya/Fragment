package com.example.pt2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class FragmentA extends Fragment {

    private SharedViewModel sharedViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        Button btnRed = view.findViewById(R.id.btnRed);
        Button btnGreen = view.findViewById(R.id.btnGreen);
        Button btnBlue = view.findViewById(R.id.btnBlue);

        btnRed.setOnClickListener(v -> sharedViewModel.setSelectedColor("RED"));
        btnGreen.setOnClickListener(v -> sharedViewModel.setSelectedColor("GREEN"));
        btnBlue.setOnClickListener(v -> sharedViewModel.setSelectedColor("BLUE"));

        return view;
    }
}
