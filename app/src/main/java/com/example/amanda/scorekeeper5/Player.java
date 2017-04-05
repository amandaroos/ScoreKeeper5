package com.example.amanda.scorekeeper5;

/**
 * Each Player has a name and a score
 */

public class Player {

    private int mScore;
    private String mName;

    public Player(){
        mScore = 0;
        mName = "New Player";
    }

    public void editName(String name){
        mName = name;
    }

    public void editScore(int score){
        mScore += score;
    }

    public String getName(){
        return mName;
    }

    public int getScore(){
        return mScore;
    }

}
