package com.example.amanda.scorekeeper5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.FloatingActionButton;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private PlayerAdapter mAdapter;
    private ArrayList<Player> mPlayers = new ArrayList<Player>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAdapter.addPlayer();
                mAdapter.notifyDataSetChanged();
            }
        });

        //Find the ListView which will be populated with the player data
        ListView playerListView = (ListView) findViewById(R.id.list_view_player);

        //Find and set empty view on the ListView so that it only shows when the list has 0 items.
        View emptyView = findViewById(R.id.empty_view);
        playerListView.setEmptyView(emptyView);

        //Initialize the Adapter with an ArrayList and set Adapter on the ListView
        mAdapter = new PlayerAdapter(this, mPlayers);
        playerListView.setAdapter(mAdapter);

    }
}