package com.example.alexandru.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
        displayForTeamB();
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * Adds 3 points for team A
     */
    public void addTreePointsForTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA();
    }

    /**
     * Add 2 points for team B
     */
    public void addTwoPointsForTeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA();
    }

    /**
     * Add 1 point for team B
     */
    public void addFreeThrowForTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA();
    }

    /**
     * Adds 3 points for team B
     */
    public void addTreePointsForTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB();
    }

    /**
     * Add 2 points for team B
     */
    public void addTwoPointsForTeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB();
    }

    /**
     * Add 1 point for team B
     */
    public void addFreeThrowForTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB();
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA();
        displayForTeamB();
    }
}
