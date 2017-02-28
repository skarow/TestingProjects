package com.example.adefault.testingprojects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreТeamA = 0;
    private int scoreТeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreA(scoreТeamA);
        displayScoreB(scoreТeamB);
    }

    public void addOneForTeamA(View view) {
        scoreТeamA++;
        displayScoreA(scoreТeamA);
    }

    public void addTwoForTeamA(View view) {
        scoreТeamA += 2;
        displayScoreA(scoreТeamA);
    }

    public void addThreeForTeamA(View view) {
        scoreТeamA += 3;
        displayScoreA(scoreТeamA);
    }

    public void addOneForTeamB(View view) {
        scoreТeamB++;
        displayScoreB(scoreТeamB);
    }

    public void addTwoForTeamB(View view) {
        scoreТeamB += 2;
        displayScoreB(scoreТeamB);
    }

    public void addThreeForTeamB(View view) {
        scoreТeamB += 3;
        displayScoreB(scoreТeamB);
    }

    public void reset(View view) {
        scoreТeamA = 0;
        scoreТeamB = 0;
        displayScoreA(scoreТeamA);
        displayScoreB(scoreТeamB);
    }

    protected  void displayScoreA(int score) {
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        textView.setText( "" + score );
    }

    protected  void displayScoreB(int score) {
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        textView.setText( "" + score );
    }
}
