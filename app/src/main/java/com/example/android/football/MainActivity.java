package com.example.android.football;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.football.R;

/**
 * This activity keeps track of the football score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    // Tracks the shots on target for Team A
    int shotsTeamA = 0;

    // Tracks the shots on target for Team B
    int shotsTeamB = 0;

    // Tracks the yellow cards for Team A
    int yellowCardsTeamA = 0;

    // Tracks the yellow cards for Team B
    int yellowCardsTeamB = 0;

    // Tracks the yellow cards for Team A
    int redCardsTeamA = 0;

    // Tracks the yellow cards for Team B
    int redCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String jamesbond = "hi";
        String jamesBond = "hello";
        String s = jamesBond + jamesbond;
    }
    /**
     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
     // Inflate the menu; this adds items to the action bar if it is present.
     getMenuInflater().inflate(R.menu.menu_main, menu);
     return true;
     }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
     // Handle action bar item clicks here. The action bar will
     // automatically handle clicks on the Home/Up button, so long
     // as you specify a parent activity in AndroidManifest.xml.
     int id = item.getItemId();

     //noinspection SimpSlifiableIfStatement
     if (id == R.id.action_settings) {
     return true;
     }

     return super.onOptionsItemSelected(item);
     }

     /**
      * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the shots for Team A by 1 point.
     */
    public void addOneShotsForTeamA(View v) {
        shotsTeamA = shotsTeamA + 1;
        displayShotsForTeamA(shotsTeamA);
    }

    /**
     * Increase the shots for Team B by 1 point.
     */
    public void addOneShotsForTeamB(View v) {
        shotsTeamB = shotsTeamB + 1;
        displayShotsForTeamB(shotsTeamB);
    }

    /**
     * Increase the yellow card for Team A by 1 point.
     */
    public void addYellowCardForTeamA(View v) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayYellowCardsForTeamA(yellowCardsTeamA);
    }

    /**
     * Increase the yellow card for Team B by 1 point.
     */
    public void addYellowCardForTeamB(View v) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayYellowCardsForTeamB(yellowCardsTeamB);
    }

    /**
     * Increase the red card for Team A by 1 point.
     */
    public void addRedCardForTeamA(View v) {
        redCardsTeamA = redCardsTeamA + 1;
        displayRedCardsForTeamA(redCardsTeamA);
    }

    /**
     * Increase the red card for Team B by 1 point.
     */
    public void addRedCardForTeamB(View v) {
        redCardsTeamB = redCardsTeamB + 1;
        displayRedCardsForTeamB(redCardsTeamB);
    }


    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        shotsTeamA = 0;
        shotsTeamB = 0;
        yellowCardsTeamA = 0;
        yellowCardsTeamB = 0;
        redCardsTeamA = 0;
        redCardsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayShotsForTeamA(shotsTeamA);
        displayShotsForTeamB(shotsTeamB);
        displayYellowCardsForTeamA(yellowCardsTeamA);
        displayYellowCardsForTeamB(yellowCardsTeamB);
        displayRedCardsForTeamA(redCardsTeamA);
        displayRedCardsForTeamB(redCardsTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given shots for Team A.
     */
    public void displayShotsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_shots);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given shots for Team B.
     */
    public void displayShotsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_shots);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow cards for Team A.
     */
    public void displayYellowCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow cards for Team B.
     */
    public void displayYellowCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red cards for Team A.
     */
    public void displayRedCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red cards for Team B.
     */
    public void displayRedCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(score));
    }

}