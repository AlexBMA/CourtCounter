package com.example.alexandru.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
    }

    public void displayForTeamA()
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addTreePointsForTeamA(View view)
    {
        score +=3;
        displayForTeamA();
    }
    public void addTwoPointsForTeamA(View view)
    {
        score +=2;
        displayForTeamA();
    }
    public void addFreeThrowForTeamA(View view)
    {
        score+=1;
        displayForTeamA();
    }
}
