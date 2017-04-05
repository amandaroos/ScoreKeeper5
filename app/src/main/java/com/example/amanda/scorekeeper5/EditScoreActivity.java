package com.example.amanda.scorekeeper5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.EditText;

/**
 * Allows the user to edit a player's score
 */

public class EditScoreActivity extends AppCompatActivity {

    private EditText mScoreEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_score);

        mScoreEditText = (EditText) findViewById(R.id.score_input);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_edit_score, menu);
        return true;
    }
}