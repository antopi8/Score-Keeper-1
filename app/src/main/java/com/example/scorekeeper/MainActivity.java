package com.example.scorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

    public class MainActivity extends AppCompatActivity {
        int scoreTeamA = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
        /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        displayForTeamA(1);
    }
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        displayForTeamA(2);
    }
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}