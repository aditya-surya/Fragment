package com.example.pt2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add Fragment A
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container_a, new FragmentA())
                .commit();

        // Add Fragment B
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container_b, new FragmentB())
                .commit();
    }
}
