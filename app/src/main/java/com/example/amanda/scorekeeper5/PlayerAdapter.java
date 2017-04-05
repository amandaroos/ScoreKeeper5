package com.example.amanda.scorekeeper5;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates views for displaying the players in a ListView
 */

public class PlayerAdapter extends ArrayAdapter<Player>{

    private ArrayList<Player> mPlayers;

    /**
     * @param context
     * @param players List of Player objects to display
     */
    public PlayerAdapter (Activity context, ArrayList<Player> players){
        super(context, 0 , players);
        mPlayers = players;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Player} object located at this position in the list
        Player currentPlayer = getItem(position);

        //Get the name of the player and set to textview
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.player_name);
        nameTextView.setText(currentPlayer.getName());

        //Get the score of the player and set to textview
        TextView scoreTextView = (TextView) listItemView.findViewById(R.id.player_score);
        scoreTextView.setText(String.valueOf(currentPlayer.getScore()));

        scoreTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), EditScoreActivity.class);
                getContext().startActivity(intent);
            }
        });

        return listItemView;
    }

    public void addPlayer() {
        mPlayers.add(new Player());
    }

}
