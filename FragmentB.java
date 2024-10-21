package com.example.pt2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class FragmentB extends Fragment {

    private SharedViewModel sharedViewModel;
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        textView = view.findViewById(R.id.textView);

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        sharedViewModel.getSelectedColor().observe(getViewLifecycleOwner(), color -> {
            textView.setText("Selected Color: " + color);
            switch (color) {
                case "RED":
                    view.setBackgroundColor(Color.RED);
                    break;
                case "GREEN":
                    view.setBackgroundColor(Color.GREEN);
                    break;
                case "BLUE":
                    view.setBackgroundColor(Color.BLUE);
                    break;
            }
        });

        return view;
    }
}
