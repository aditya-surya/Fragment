package com.example.pt2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<String> selectedColor = new MutableLiveData<>();

    public void setSelectedColor(String color) {
        selectedColor.setValue(color);
    }

    public LiveData<String> getSelectedColor() {
        return selectedColor;
    }
}
