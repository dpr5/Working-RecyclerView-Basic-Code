package com.example.ranad_000.recyclerpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

// TODO (8) Implement GreenAdapter.ListItemClickListener from the MainActivity
public class MainActivity extends AppCompatActivity implements RecyclerViewClickListener {

    private CardAdapter adapter;
    private RecyclerView recView;

    private List<Data_for_Cards> Data = new ArrayList<>();

    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recView = (RecyclerView) findViewById(R.id.rv_numbers);

        adapter = new CardAdapter(Data, this);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);
        recView.setHasFixedSize(true);
        recView.setAdapter(adapter);

        initData();


    }


    private void initData() {
        Data_for_Cards card = new Data_for_Cards("Chest Workouts", R.drawable.nantalan_lake);
        Data.add(card);

        card = new Data_for_Cards("Back Workouts", R.drawable.nantalan_lake);
        Data.add(card);

        card = new Data_for_Cards("Arm Workouts", R.drawable.nantalan_lake);
        Data.add(card);

        card = new Data_for_Cards("Leg Workouts", R.drawable.nantalan_lake);
        Data.add(card);

        card = new Data_for_Cards("Shoulder Workouts", R.drawable.nantalan_lake);
        Data.add(card);

        card = new Data_for_Cards("More Workouts coming soon...", R.drawable.nantalan_lake);
        Data.add(card);

    }

    @Override
    public void onListItemClick(int position) {
        String toastMessage = "Item #" + position + " clicked";
        mToast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG);
        mToast.show();
        switch (position) {
            case 0:
                Intent chest = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(chest);
                break;
            case 1:
                Intent back = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(back);
                break;
            case 2:
                Intent arms = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(arms);
                break;
            case 3:
                Intent leg = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(leg);
                break;
            case 4:
                Intent shoulder = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(shoulder);
                break;
        }
    }
}
