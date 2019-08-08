package com.example.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_android_black_24dp, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack_black_24dp, "Line 3", "Line 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_add_a_photo_black_24dp, "Line 5", "Line 6"));
        exampleList.add(new ExampleItem(R.drawable.ic_android_black_24dp, "Line 7", "Line 8"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack_black_24dp, "Line 9", "Line 10"));
        exampleList.add(new ExampleItem(R.drawable.ic_add_a_photo_black_24dp, "Line 11", "Line 12"));
        exampleList.add(new ExampleItem(R.drawable.ic_android_black_24dp, "Line 13", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack_black_24dp, "Line 15", "Line 14"));
        exampleList.add(new ExampleItem(R.drawable.ic_add_a_photo_black_24dp, "Line 17", "Line 16"));
        exampleList.add(new ExampleItem(R.drawable.ic_android_black_24dp, "Line 19", "Line 18"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack_black_24dp, "Line 21", "Line 20"));
        exampleList.add(new ExampleItem(R.drawable.ic_add_a_photo_black_24dp, "Line 23", "Line 22"));
        exampleList.add(new ExampleItem(R.drawable.ic_android_black_24dp, "Line 25", "Line 24"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack_black_24dp, "Line 27", "Line 26"));
        exampleList.add(new ExampleItem(R.drawable.ic_add_a_photo_black_24dp, "Line 29", "Line 30"));
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
