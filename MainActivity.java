package com.example.android.tennisscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int subTeamA = 0;
    int subTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Adds one goal to the score for Team A.
     */
    public void addGoalForTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_team_a);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Adds one foul total fouls for Team A.
     */
    public void addFoulForTeamA(View v) {
        foulTeamA += 1;
        displayFoulForTeamA(foulTeamA);
    }
    /**
     * Displays the given subs for Team A.
     */
    public void displaySubsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.subs_team_a);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Adds one substitution to total subs for Team A.
     */
    public void addSubForTeamA(View v) {
        subTeamA += 1;
        displaySubsForTeamA(subTeamA);
        if (subTeamA == 3){
            Button btn1 = (Button) findViewById(R.id.subs_button_a);
            btn1.setEnabled(false);
        }
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Adds one goal to the score for Team B.
     */
    public void addGoalForTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given fouls for Team B.
     */
    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_team_b);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Adds one foul total fouls for Team B.
     */
    public void addFoulForTeamB(View v) {
        foulTeamB += 1;
        displayFoulForTeamB(foulTeamB);
    }
    /**
     * Displays the given subs for Team B.
     */
    public void displaySubsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.subs_team_b);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Adds one substitution to total subs for Team B.
     */
    public void addSubForTeamB(View v) {
        subTeamB += 1;
        displaySubsForTeamB(subTeamB);
        if (subTeamB >= 3){
            Button btn2 = (Button) findViewById(R.id.subs_button_b);
            btn2.setEnabled(false);
        }
    }
    public void scoreReset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        subTeamA = 0;
        subTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
        displaySubsForTeamA(subTeamA);
        displaySubsForTeamB(subTeamB);
        Button btn1 = (Button) findViewById(R.id.subs_button_a);
        if ( btn1.isEnabled() == false) {
            btn1.setEnabled(true);
        }
        Button btn2 = (Button) findViewById(R.id.subs_button_b);
        if (btn2.isEnabled() == false) {
            btn2.setEnabled(true);
        }
    }
}
