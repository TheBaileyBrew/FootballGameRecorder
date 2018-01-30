package com.example.android.footballgamerecorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;


public class GameHasStarted extends AppCompatActivity {
    int TeamOneScore=0;
    int TeamTwoScore=0;
    int TeamOneLastScoring=0;
    int TeamTwoLastScoring=0;
    int TeamOnePassyards=0;
    int TeamTwoPassyards=0;
    int TeamOneRushYard=0;
    int TeamTwoRushYard=0;
    int rushingTD=0;
    int rushingTD2=0;
    int receivingTD=0;
    int receivingTD2=0;
    int TeamOneRecYard=0;
    int TeamTwoRecYard=0;
    int TeamOneQBFumble=0;
    int TeamTwoQBFumble=0;
    int TeamOneRBFumble=0;
    int TeamTwoRBFumble=0;
    int TeamOneWRFumble=0;
    int TeamTwoWRFumble=0;
    int TeamOneCompleted=0;
    int TeamTwoCompleted=0;
    int TeamOneAttempts=0;
    int TeamTwoAttempts=0;
    int TeamOneInterceptions=0;
    int TeamTwoInterceptions=0;
    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.started_game);
        String teamOneName = getIntent().getStringExtra("team_one");
        String teamTwoName = getIntent().getStringExtra("team_two");
        final Spinner teamOneSpinnerScoring;
        Spinner teamTwoSpinnerScoring;

        TabHost host = findViewById(R.id.tabhost);
        host.setup();

        //Team One - Tab One
        TabHost.TabSpec spec = host.newTabSpec("Team One");
        spec.setContent(R.id.team_one);
        spec.setIndicator(teamOneName);
        host.addTab(spec);

        //Team Two - Tab Two
        spec = host.newTabSpec("Team Two");
        spec.setContent(R.id.team_two);
        spec.setIndicator(teamTwoName);
        host.addTab(spec);

        teamOneSpinnerScoring = findViewById(R.id.spinner_team_one_scoring);
        ArrayAdapter<CharSequence> teamOneAdapter = ArrayAdapter.createFromResource(this, R.array.scoring, android.R.layout.simple_spinner_dropdown_item);
        teamOneSpinnerScoring.setAdapter(teamOneAdapter);
        teamOneSpinnerScoring.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String spinnerTeamOne = ((TextView) view).getText().toString();
                switch (spinnerTeamOne) {
                    case "Passing Stats":
                        findViewById(R.id.passing_scoring_statistics).setVisibility(View.VISIBLE);
                        findViewById(R.id.receiving_scoring_statistics).setVisibility(View.INVISIBLE);
                        findViewById(R.id.rushing_scoring_statistics).setVisibility(View.INVISIBLE);
                        break;
                    case "Rushing Stats":
                        findViewById(R.id.passing_scoring_statistics).setVisibility(View.INVISIBLE);
                        findViewById(R.id.receiving_scoring_statistics).setVisibility(View.INVISIBLE);
                        findViewById(R.id.rushing_scoring_statistics).setVisibility(View.VISIBLE);
                        break;
                    case "Receiving Stats":
                        findViewById(R.id.passing_scoring_statistics).setVisibility(View.INVISIBLE);
                        findViewById(R.id.receiving_scoring_statistics).setVisibility(View.VISIBLE);
                        findViewById(R.id.rushing_scoring_statistics).setVisibility(View.INVISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        teamTwoSpinnerScoring = findViewById(R.id.spinner_team_two_scoring);
        ArrayAdapter<CharSequence> teamTwoAdapter = ArrayAdapter.createFromResource(this, R.array.scoring, android.R.layout.simple_spinner_dropdown_item);
        teamTwoSpinnerScoring.setAdapter(teamTwoAdapter);
        teamTwoSpinnerScoring.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String spinnerTeamTwo = ((TextView) view).getText().toString();
                switch (spinnerTeamTwo) {
                    case "Passing Stats":
                        findViewById(R.id.passing_scoring_statistics).setVisibility(View.VISIBLE);
                        findViewById(R.id.receiving_scoring_statistics).setVisibility(View.INVISIBLE);
                        findViewById(R.id.rushing_scoring_statistics).setVisibility(View.INVISIBLE);
                        break;
                    case "Rushing Stats":
                        findViewById(R.id.passing_scoring_statistics).setVisibility(View.INVISIBLE);
                        findViewById(R.id.receiving_scoring_statistics).setVisibility(View.INVISIBLE);
                        findViewById(R.id.rushing_scoring_statistics).setVisibility(View.VISIBLE);
                        break;
                    case "Receiving Stats":
                        findViewById(R.id.passing_scoring_statistics).setVisibility(View.INVISIBLE);
                        findViewById(R.id.receiving_scoring_statistics).setVisibility(View.VISIBLE);
                        findViewById(R.id.rushing_scoring_statistics).setVisibility(View.INVISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }



    //Updating the values of scoring, yardage and counts

    public void onClickTeamOneDefTD(View view) {
        TeamOneScore = TeamOneScore + 6;
        TeamOneLastScoring=6;
        teamOneTotalScore(TeamOneScore);
    }
    public void onClickTeamTwoDefTD(View view) {
        TeamTwoScore = TeamTwoScore + 6;
        TeamOneLastScoring=6;
        teamTwoTotalScore(TeamTwoScore);
    }

    public void onClickTeamOneRushTD(View view) {
        TeamOneScore = TeamOneScore + 6;
        TeamOneLastScoring=6;
        rushingTD = rushingTD +1;
        teamOneTotalScore(TeamOneScore);
        rbtd(rushingTD);
    }
    public void onClickTeamTwoRushTD(View view) {
        TeamTwoScore = TeamTwoScore + 6;
        TeamOneLastScoring=6;
        rushingTD2 = rushingTD2 +1;
        teamTwoTotalScore(TeamTwoScore);
        rbtd2(rushingTD2);
    }

    public void onClickTeamOneRecTD(View view) {
        TeamOneScore = TeamOneScore + 6;
        TeamOneLastScoring=6;
        receivingTD = receivingTD + 1;
        teamOneTotalScore(TeamOneScore);
        wrtd(receivingTD);
    }
    public void onClickTeamTwoRecTD(View view) {
        TeamTwoScore = TeamTwoScore + 6;
        TeamOneLastScoring=6;
        receivingTD2 = receivingTD2 + 1;
        teamTwoTotalScore(TeamTwoScore);
        wrtd2(receivingTD2);
    }

    public void onClickTeamOnePassComplete(View view) {
        TeamOneAttempts = TeamOneAttempts + 1;
        TeamOneCompleted = TeamOneCompleted + 1;
        teamOneIncomplete(TeamOneAttempts);
        teamOneComplete(TeamOneCompleted);
    }
    public void onClickTeamTwoPassComplete(View view) {
        TeamTwoAttempts = TeamTwoAttempts + 1;
        TeamTwoCompleted = TeamTwoCompleted + 1;
        teamTwoIncomplete(TeamTwoAttempts);
        teamTwoComplete(TeamTwoCompleted);
    }

    public void onClickTeamOnePassIncomplete(View view) {
        TeamOneAttempts = TeamOneAttempts + 1;
        teamOneIncomplete(TeamOneAttempts);
    }
    public void onClickTeamTwoPassIncomplete(View view) {
        TeamTwoAttempts = TeamTwoAttempts + 1;
        teamTwoIncomplete(TeamTwoAttempts);
    }

    public void onClickTeamOnePassInterception(View view) {
        TeamOneInterceptions = TeamOneInterceptions + 1;
        teamOneIntercept(TeamOneInterceptions);
    }
    public void onClickTeamTwoPassInterception(View view) {
        TeamTwoInterceptions = TeamTwoInterceptions + 1;
        teamTwoIntercept(TeamTwoInterceptions);
    }

    public void onClickTeamOnePassFumble(View view) {
        TeamOneQBFumble = TeamOneQBFumble +1;
        qbTeamOneFumble(TeamOneQBFumble);
    }
    public void onClickTeamTwoPassFumble(View view) {
        TeamTwoQBFumble = TeamTwoQBFumble +1;
        qbTeamTwoFumble(TeamTwoQBFumble);
    }

    public void onClickTeamOneMinusOneRush(View view) {
        TeamOneRushYard = TeamOneRushYard - 1;
        teamOneRushing(TeamOneRushYard);
    }
    public void onClickTeamTwoMinusOneRush(View view) {
        TeamTwoRushYard = TeamTwoRushYard - 1;
        teamTwoRushing(TeamTwoRushYard);
    }

    public void onClickTeamOnePlusOneRush(View view) {
        TeamOneRushYard = TeamOneRushYard + 1;
        teamOneRushing(TeamOneRushYard);
    }
    public void onClickTeamTwoPlusOneRush(View view) {
        TeamTwoRushYard = TeamTwoRushYard + 1;
        teamTwoRushing(TeamTwoRushYard);
    }

    public void onClickTeamOnePlusTenRush(View view) {
        TeamOneRushYard = TeamOneRushYard + 10;
        teamOneRushing(TeamOneRushYard);
    }
    public void onClickTeamTwoPlusTenRush(View view) {
        TeamTwoRushYard = TeamTwoRushYard + 10;
        teamTwoRushing(TeamTwoRushYard);
    }

    public void onClickTeamOneRBFumble(View view) {
        TeamOneRBFumble = TeamOneRBFumble + 1;
        rbTeamOneFumble(TeamOneRBFumble);
    }
    public void onClickTeamTwoRBFumble(View view) {
        TeamTwoRBFumble = TeamTwoRBFumble + 1;
        rbTeamTwoFumble(TeamTwoRBFumble);
    }

    public void onClickTeamOneMinusOneRec(View view) {
        TeamOneRecYard = TeamOneRecYard - 1;
        teamOneReceiving(TeamOneRecYard);
    }
    public void onClickTeamTwoMinusOneRec(View view) {
        TeamTwoRecYard = TeamTwoRecYard - 1;
        teamTwoReceiving(TeamTwoRecYard);
    }

    public void onClickTeamOnePlusOneRec(View view) {
        TeamOneRecYard = TeamOneRecYard + 1;
        teamOneReceiving(TeamOneRecYard);
    }
    public void onClickTeamTwoPlusOneRec(View view) {
        TeamTwoRecYard = TeamTwoRecYard + 1;
        teamTwoReceiving(TeamTwoRecYard);
    }

    public void onClickTeamOnePlusTenRec(View view) {
        TeamOneRecYard = TeamOneRecYard + 10;
        teamOneReceiving(TeamOneRecYard);
    }
    public void onClickTeamTwoPlusTenRec(View view) {
        TeamTwoRecYard = TeamTwoRecYard + 10;
        teamTwoReceiving(TeamTwoRecYard);
    }

    public void onClickTeamOneWRFumble(View view) {
        TeamOneWRFumble = TeamOneWRFumble + 1;
        wrTeamOneFumble(TeamOneWRFumble);
    }
    public void onClickTeamTwoWRFumble(View view) {
        TeamTwoWRFumble = TeamTwoWRFumble + 1;
        wrTeamTwoFumble(TeamTwoWRFumble);
    }

    //Updating the field values for scoring changes

    public void teamOneTotalScore (int score) {
        TextView teamOneScoreTabOne = findViewById(R.id.team_one_score_tab_one);
        TextView teamOneScoreTabTwo = findViewById(R.id.team_one_score_tab_two);
        teamOneScoreTabOne.setText(String.valueOf(score));
        teamOneScoreTabTwo.setText(String.valueOf(score));
    }
    public void teamTwoTotalScore (int score) {
        TextView teamTwoScoreTabOne = findViewById(R.id.team_two_score_tab_one);
        TextView teamTwoScoreTabTwo = findViewById(R.id.team_two_score_tab_two);
        teamTwoScoreTabOne.setText(String.valueOf(score));
        teamTwoScoreTabTwo.setText(String.valueOf(score));
    }

    public void teamOneRushing (int rush) {
        TextView teamOneRush = findViewById(R.id.rushing_yards_display_total);
        teamOneRush.setText(String.valueOf(rush));
    }
    public void teamTwoRushing (int rush) {
        TextView teamTwoRush = findViewById(R.id.rushing_yards_display_total_team2);
        teamTwoRush.setText(String.valueOf(rush));
    }

    public void teamOneReceiving (int rec) {
        TextView teamOneRec = findViewById(R.id.receiving_yards_display_total);
        teamOneRec.setText(String.valueOf(rec));
    }
    public void teamTwoReceiving (int rec) {
        TextView teamTwoRec = findViewById(R.id.receiving_yards_display_total_team2);
        teamTwoRec.setText(String.valueOf(rec));
    }

    public void teamOneIntercept (int pass) {
        TextView qbintercept = findViewById(R.id.passing_intercept_display_total);
        qbintercept.setText(String.valueOf(pass));
    }
    public void teamTwoIntercept (int pass) {
        TextView qbintercept2 = findViewById(R.id.passing_intercept_display_total_team2);
        qbintercept2.setText(String.valueOf(pass));
    }

    public void teamOneComplete (int pass) {
        TextView qbcomplete = findViewById(R.id.passing_comp_display_total);
        qbcomplete.setText(String.valueOf(pass));
    }
    public void teamTwoComplete (int pass) {
        TextView qbcomplete2 = findViewById(R.id.passing_comp_display_total_team2);
        qbcomplete2.setText(String.valueOf(pass));
    }

    //QUARTERBACK INCOMPLETE PASS DISPLAY
    public void teamOneIncomplete (int pass) {
        TextView qbincomplete = findViewById(R.id.passing_attempt_display_total);
        qbincomplete.setText(String.valueOf(pass));
    }
    public void teamTwoIncomplete (int pass) {
        TextView qbincomplete2 = findViewById(R.id.passing_attempt_display_total_team2);
        qbincomplete2.setText(String.valueOf(pass));
    }

    //WIDE RECEIVER INCOMPLETE PASS DISPLAY
    public void teamOneWRIncomplete (int pass) {
        TextView wrincomplete = findViewById(R.id.receiving_attempt_display_total);
        wrincomplete.setText(String.valueOf(pass));
    }
    public void teamTwoWRIncomplete (int pass) {
        TextView wrincomplete2 = findViewById(R.id.receiving_attempt_display_total_team2);
        wrincomplete2.setText(String.valueOf(pass));
    }

    //QUARTERBACK FUMBLE DISPLAY
    public void qbTeamOneFumble (int fumble) {
        TextView qbfumble = findViewById(R.id.passing_fumble_display_total);
        qbfumble.setText(String.valueOf(fumble));
    }
    public void qbTeamTwoFumble (int fumble) {
        TextView qbfumble2 = findViewById(R.id.passing_fumble_display_total_team2);
        qbfumble2.setText(String.valueOf(fumble));
    }

    //WIDE RECEIVER FUMBLE DISPLAY
    public void wrTeamOneFumble (int fumble) {
        TextView wrfumble = findViewById(R.id.receiving_fumble_display_total);
        wrfumble.setText(String.valueOf(fumble));
    }
    public void wrTeamTwoFumble (int fumble) {
        TextView wrfumble2 = findViewById(R.id.receiving_fumble_display_total_team2);
        wrfumble2.setText(String.valueOf(fumble));
    }

    //RUNNING BACK FUMBLE DISPLAY
    public void rbTeamOneFumble (int fumble) {
        TextView rbfumble = findViewById(R.id.rushing_fumble_display_total);
        rbfumble.setText(String.valueOf(fumble));
    }
    public void rbTeamTwoFumble (int fumble) {
        TextView rbfumble2 = findViewById(R.id.rushing_fumble_display_total_team2);
        rbfumble2.setText(String.valueOf(fumble));
    }

    //WIDE RECEIVER TOUCHDOWN DISPLAY
    public void wrtd (int td) {
        TextView wideTD = findViewById(R.id.receiving_td_display_total);
        wideTD.setText(String.valueOf(td));
    }
    public void wrtd2 (int td) {
        TextView wideTD2 = findViewById(R.id.receiving_td_display_total_team2);
        wideTD2.setText(String.valueOf(td));
    }

    //RUNNING BACK TOUCHDOWN DISPLAY
    public void rbtd (int td) {
        TextView backTD = findViewById(R.id.rushing_td_display_total);
        backTD.setText(String.valueOf(td));
    }
    public void rbtd2 (int td) {
        TextView backTD2 = findViewById(R.id.rushing_td_display_total_team2);
        backTD2.setText(String.valueOf(td));
    }




    public void onClickReturnToHalf (View view) {
        Intent goToHalf = new Intent (this, StartGame.class);

        startActivity(goToHalf);
    }



}
