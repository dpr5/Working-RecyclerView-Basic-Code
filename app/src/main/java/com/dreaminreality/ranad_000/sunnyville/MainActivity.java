package com.dreaminreality.ranad_000.sunnyville;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private static final int Num_Of_Items = 100;
    private GreenAdapter adapter;
    private RecyclerView mNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNumber = (RecyclerView)findViewById(R.id.rv_numbers);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mNumber.setLayoutManager(layoutManager);

        mNumber.setHasFixedSize(true);

        adapter = new GreenAdapter(Num_Of_Items);

        mNumber.setAdapter(adapter);
    }
}
