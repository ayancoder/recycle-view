package com.example.recycle_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecycleAdapter recycleAdapter;
    private List<String> countries = new ArrayList();
    private List<String> details = new ArrayList<>();
    private List<Integer> flags = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyceleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        countries.add("India");
        countries.add("USA");

        details.add("This Indian tri colour flag");
        details.add("This Indian flag");

        flags.add(R.drawable.india);
        flags.add(R.drawable.usa);
        recycleAdapter = new RecycleAdapter(countries, details, flags, MainActivity.this);
        recyclerView.setAdapter(recycleAdapter);

    }
}