package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreePointsForTeamA(View v){
        TextView threePoints = (TextView) findViewById(R.id.team_a_score);
        int scoreA = Integer.parseInt(threePoints.getText().toString());
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoPointsForTeamA(View v){
        TextView twoPoints = (TextView) findViewById(R.id.team_a_score);
        int scoreA = Integer.parseInt(twoPoints.getText().toString());
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addFreeThrowPointsForTeamA(View v){
        TextView freePoints = (TextView) findViewById(R.id.team_a_score);
        int scoreA = Integer.parseInt(freePoints.getText().toString());
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }
}
