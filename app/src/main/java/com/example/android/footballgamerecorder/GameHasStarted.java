package com.example.android.footballgamerecorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;


public class GameHasStarted extends AppCompatActivity {
    String testComplete;
    private String teamOneName;
    private String teamTwoName;
    private int TeamOneScore = 0;
    private int TeamTwoScore = 0;
    private int TeamOneLastScoring = 0;
    private int TeamTwoLastScoring = 0;
    private int TeamOnePassyards = 0;
    private int TeamTwoPassyards = 0;
    private int TeamOneRushYard = 0;
    private int TeamTwoRushYard = 0;
    private int TeamOneRecYard = 0;
    private int TeamTwoRecYard = 0;

    private int rushingTD = 0;
    private int rushingTD2 = 0;
    private int receivingTD = 0;
    private int receivingTD2 = 0;

    private int TeamOneQBFumble = 0;
    private int TeamTwoQBFumble = 0;
    private int TeamOneRBFumble = 0;
    private int TeamTwoRBFumble = 0;
    private int TeamOneWRFumble = 0;
    private int TeamTwoWRFumble = 0;

    private int TeamOneCompleted = 0;
    private int TeamTwoCompleted = 0;
    private int TeamOneAttempts = 0;
    private int TeamTwoAttempts = 0;
    private int TeamOneInterceptions = 0;
    private int TeamTwoInterceptions = 0;

    private int TeamOneRushAttempts = 0;
    private int TeamTwoRushAttempts = 0;

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.started_game);
        teamOneName = getIntent().getStringExtra("team_one");
        teamTwoName = getIntent().getStringExtra("team_two");
        final Spinner teamOneSpinnerScoring;
        final Spinner teamTwoSpinnerScoring;

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
        teamOneTotalScore(TeamOneScore);
    }

    public void onClickTeamTwoDefTD(View view) {
        TeamTwoScore = TeamTwoScore + 6;
        teamTwoTotalScore(TeamTwoScore);
    }

    public void onClickTeamOneRushTD(View view) {
        TeamOneScore = TeamOneScore + 6;
        rushingTD = rushingTD + 1;
        teamOneTotalScore(TeamOneScore);
        rbtd(rushingTD);
    }

    public void onClickTeamTwoRushTD(View view) {
        TeamTwoScore = TeamTwoScore + 6;
        rushingTD2 = rushingTD2 + 1;
        teamTwoTotalScore(TeamTwoScore);
        rbtd2(rushingTD2);
    }

    public void onClickTeamOneRecTD(View view) {
        TeamOneScore = TeamOneScore + 6;
        receivingTD = receivingTD + 1;
        teamOneTotalScore(TeamOneScore);
        wrtd(receivingTD);
    }

    public void onClickTeamTwoRecTD(View view) {
        TeamTwoScore = TeamTwoScore + 6;
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
        TeamOneQBFumble = +1;
        qbTeamOneFumble(TeamOneQBFumble);
    }

    public void onClickTeamTwoPassFumble(View view) {
        TeamTwoQBFumble = +1;
        qbTeamTwoFumble(TeamTwoQBFumble);
    }

    public void onClickTeamOneRBFumble(View view) {
        TeamOneRBFumble = +1;
        rbTeamOneFumble(TeamOneRBFumble);
    }

    public void onClickTeamTwoRBFumble(View view) {
        TeamTwoRBFumble = +1;
        rbTeamTwoFumble(TeamTwoRBFumble);
    }

    public void onClickTeamOneWRFumble(View view) {
        TeamOneWRFumble = TeamOneWRFumble + 1;
        wrTeamOneFumble(TeamOneWRFumble);
    }
    public void onClickTeamTwoWRFumble(View view) {
        TeamTwoWRFumble = TeamTwoWRFumble + 1;
        wrTeamTwoFumble(TeamTwoWRFumble);
    }

    public void onClickTeamOnePlusOne (View view) {
        TeamOneScore = TeamOneScore + 1;
        teamOneTotalScore(TeamOneScore);
    }
    public void onClickTeamTwoPlusOne (View view) {
        TeamTwoScore = TeamTwoScore + 1;
        teamTwoTotalScore(TeamTwoScore);
    }
    public void onClickTeamOnePlusTwo (View view) {
        TeamOneScore = TeamOneScore + 2;
        teamOneTotalScore(TeamOneScore);
    }
    public void onClickTeamTwoPlusTwo (View view) {
        TeamTwoScore = TeamTwoScore + 2;
        teamTwoTotalScore(TeamTwoScore);
    }
    public void onClickTeamOnePlusThree (View view) {
        TeamOneScore = TeamOneScore + 3;
        teamOneTotalScore(TeamOneScore);
    }
    public void onClickTeamTwoPlusThree (View view) {
        TeamTwoScore = TeamTwoScore + 3;
        teamTwoTotalScore(TeamTwoScore);
    }



    //Updating the field values for scoring changes

    public void teamOneTotalScore(int score) {
        TextView teamOneScoreTabOne = findViewById(R.id.team_one_score_tab_one);
        TextView teamOneScoreTabTwo = findViewById(R.id.team_one_score_tab_two);
        teamOneScoreTabOne.setText(String.valueOf(score));
        teamOneScoreTabTwo.setText(String.valueOf(score));
    }

    public void teamTwoTotalScore(int score) {
        TextView teamTwoScoreTabOne = findViewById(R.id.team_two_score_tab_one);
        TextView teamTwoScoreTabTwo = findViewById(R.id.team_two_score_tab_two);
        teamTwoScoreTabOne.setText(String.valueOf(score));
        teamTwoScoreTabTwo.setText(String.valueOf(score));
    }

    /*Display Rushing Yards*/
    public void teamOneRushing(int rush) {
        TextView teamOneRush = findViewById(R.id.rushing_yards_display_total);
        teamOneRush.setText(String.valueOf(rush));
    }
    public void teamTwoRushing(int rush) {
        TextView teamTwoRush = findViewById(R.id.rushing_yards_display_total_team2);
        teamTwoRush.setText(String.valueOf(rush));
    }

    /*Display Rushing Attempts*/
    public void teamOneRushAtt(int attempt) {
        TextView teamOneRushAttempt = findViewById(R.id.rushing_comp_display_total);
        teamOneRushAttempt.setText(String.valueOf(attempt));
    }
    public void teamTwoRushAtt(int attempt) {
        TextView teamTwoRushAttempt = findViewById(R.id.rushing_comp_display_total_team2);
        teamTwoRushAttempt.setText(String.valueOf(attempt));
    }


    /*Display Receiving Yards*/
    public void teamOneReceiving(int rec) {
        TextView teamOneRec = findViewById(R.id.receiving_yards_display_total);
        TextView teamOnePass = findViewById(R.id.passing_yards_display_total);
        teamOnePass.setText(String.valueOf(rec));
        teamOneRec.setText(String.valueOf(rec));
    }
    public void teamTwoReceiving(int rec) {
        TextView teamTwoRec = findViewById(R.id.receiving_yards_display_total_team2);
        TextView teamTwoPass = findViewById(R.id.passing_yards_display_total_team2);
        teamTwoPass.setText(String.valueOf(rec));
        teamTwoRec.setText(String.valueOf(rec));
    }

    /*Display Passing Interceptions*/
    public void teamOneIntercept(int pass) {
        TextView qbintercept = findViewById(R.id.passing_intercept_display_total);
        qbintercept.setText(String.valueOf(pass));
    }
    public void teamTwoIntercept(int pass) {
        TextView qbintercept2 = findViewById(R.id.passing_intercept_display_total_team2);
        qbintercept2.setText(String.valueOf(pass));
    }

    /*Display Passing Complete*/
    public void teamOneComplete(int pass) {
        TextView qbcomplete = findViewById(R.id.passing_comp_display_total);
        TextView wrcomplete = findViewById(R.id.receiving_comp_display_total);
        wrcomplete.setText(String.valueOf(pass));
        qbcomplete.setText(String.valueOf(pass));
    }
    public void teamTwoComplete(int pass) {
        TextView qbcomplete2 = findViewById(R.id.passing_comp_display_total_team2);
        TextView wrincomplete2 = findViewById(R.id.receiving_comp_display_total_team2);
        wrincomplete2.setText(String.valueOf(pass));
        qbcomplete2.setText(String.valueOf(pass));
    }

    /*Display QB Incomplete*/
    public void teamOneIncomplete(int pass) {
        TextView qbincomplete = findViewById(R.id.passing_attempt_display_total);
        TextView wrincomplete = findViewById(R.id.receiving_attempt_display_total);
        wrincomplete.setText(String.valueOf(pass));
        qbincomplete.setText(String.valueOf(pass));
    }
    public void teamTwoIncomplete(int pass) {
        TextView qbincomplete2 = findViewById(R.id.passing_attempt_display_total_team2);
        TextView wrincomplete2 = findViewById(R.id.receiving_attempt_display_total_team2);
        wrincomplete2.setText(String.valueOf(pass));
        qbincomplete2.setText(String.valueOf(pass));
    }



    /*Display Passing Fumbles*/
    public void qbTeamOneFumble(int fumble) {
        TextView qbfumble = findViewById(R.id.passing_fumble_display_total);
        qbfumble.setText(String.valueOf(fumble));
    }
    public void qbTeamTwoFumble(int fumble) {
        TextView qbfumble2 = findViewById(R.id.passing_fumble_display_total_team2);
        qbfumble2.setText(String.valueOf(fumble));
    }

    /*Display Receiving Fumbles*/
    public void wrTeamOneFumble(int fumble) {
        TextView wrfumble = findViewById(R.id.receiving_fumble_display_total);
        wrfumble.setText(String.valueOf(fumble));
    }
    public void wrTeamTwoFumble(int fumble) {
        TextView wrfumble2 = findViewById(R.id.receiving_fumble_display_total_team2);
        wrfumble2.setText(String.valueOf(fumble));
    }

    /*Display Rushing Fumbles*/
    public void rbTeamOneFumble(int fumble) {
        TextView rbfumble = findViewById(R.id.rushing_fumble_display_total);
        rbfumble.setText(String.valueOf(fumble));
    }
    public void rbTeamTwoFumble(int fumble) {
        TextView rbfumble2 = findViewById(R.id.rushing_fumble_display_total_team2);
        rbfumble2.setText(String.valueOf(fumble));
    }

    /*Display Receiving TD*/
    public void wrtd(int td) {
        TextView wideTD = findViewById(R.id.receiving_td_display_total);
        wideTD.setText(String.valueOf(td));
    }
    public void wrtd2(int td) {
        TextView wideTD2 = findViewById(R.id.receiving_td_display_total_team2);
        wideTD2.setText(String.valueOf(td));
    }

    /*Display Rushing TD*/
    public void rbtd(int td) {
        TextView backTD = findViewById(R.id.rushing_td_display_total);
        backTD.setText(String.valueOf(td));
    }
    public void rbtd2(int td) {
        TextView backTD2 = findViewById(R.id.rushing_td_display_total_team2);
        backTD2.setText(String.valueOf(td));
    }

    public void onClickTeamOneRushComplete(View view) {
        EditText teamOneRushingYards = findViewById(R.id.team_one_rushing_yardage);
        int rushYards = Integer.parseInt(teamOneRushingYards.getText().toString());
        testComplete = teamOneRushingYards.getText().toString();
        if (testComplete.matches("")) {
            Toast.makeText(this, "Invalid Entry", Toast.LENGTH_SHORT).show();
        } else if (rushYards > 0) {
            Toast.makeText(getApplicationContext(), rushYards + " Rushing Yards Added", Toast.LENGTH_LONG).show();
            TeamOneRushYard = TeamOneRushYard+ rushYards;
            TeamOneRushAttempts = TeamOneRushAttempts + 1;
            teamOneRushing(TeamOneRushYard);
            teamOneRushAtt(TeamOneRushAttempts);
            teamOneRushingYards.setText("");
        } else if (rushYards == 0) {
            Toast.makeText(getApplicationContext(), "No Gain", Toast.LENGTH_LONG).show();
            TeamOneRushAttempts = TeamOneRushAttempts + 1;
            teamOneRushAtt(TeamOneRushAttempts);
            teamOneRushingYards.setText("");
        } else {
            Toast.makeText(getApplicationContext(), rushYards + " RUSHING YARDS LOST", Toast.LENGTH_LONG).show();
            TeamOneRushYard = TeamOneRushYard + rushYards;
            TeamOneRushAttempts = TeamOneRushAttempts + 1;
            teamOneRushAtt(TeamOneRushAttempts);
            teamOneRushing(TeamOneRushYard);
            teamOneRushingYards.setText("");
        }
    }

    public void onClickTeamTwoRushComplete(View view) {
        EditText teamTwoRushingYards = findViewById(R.id.team_two_rushing_yardage);
        int rushYards = Integer.parseInt(teamTwoRushingYards.getText().toString());
        testComplete = teamTwoRushingYards.getText().toString();
        if (testComplete.matches("")) {
            Toast.makeText(this, "Invalid Entry", Toast.LENGTH_SHORT).show();
        } else if (rushYards > 0) {
            Toast.makeText(getApplicationContext(), rushYards + " Rushing Yards Added", Toast.LENGTH_LONG).show();
            TeamTwoRushYard = TeamTwoRushYard+ rushYards;
            TeamTwoRushAttempts = TeamTwoRushAttempts + 1;
            teamTwoRushing(TeamTwoRushYard);
            teamTwoRushAtt(TeamTwoRushAttempts);
            teamTwoRushingYards.setText("");
        } else if (rushYards == 0) {
            Toast.makeText(getApplicationContext(), "No Gain", Toast.LENGTH_LONG).show();
            TeamTwoRushAttempts = TeamTwoRushAttempts + 1;
            teamTwoRushAtt(TeamTwoRushAttempts);
            teamTwoRushingYards.setText("");
        } else {
            Toast.makeText(getApplicationContext(), rushYards + " Rushing Yards Lost", Toast.LENGTH_LONG).show();
            TeamTwoRushYard = TeamTwoRushYard + rushYards;
            TeamTwoRushAttempts = TeamTwoRushAttempts + 1;
            teamTwoRushAtt(TeamTwoRushAttempts);
            teamTwoRushing(TeamTwoRushYard);
            teamTwoRushingYards.setText("");
        }
    }

    public void onClickTeamOneRecComplete(View view) {
        EditText teamOneReceivingYards = findViewById(R.id.team_one_receiving_yardage);
        int recYards = Integer.parseInt(teamOneReceivingYards.getText().toString());
        testComplete = teamOneReceivingYards.getText().toString();
        if (testComplete.matches("")) {
            Toast.makeText(this, "Invalid Entry", Toast.LENGTH_SHORT).show();
        } else if (recYards > 0) {
            Toast.makeText(getApplicationContext(), recYards + " Receiving Yards Added", Toast.LENGTH_LONG).show();
            TeamOneRecYard = TeamOneRecYard+ recYards;
            teamOneReceiving(TeamOneRecYard);
            teamOneReceivingYards.setText("");
        } else if (recYards == 0) {
            Toast.makeText(getApplicationContext(), "No Gain", Toast.LENGTH_LONG).show();
            teamOneReceivingYards.setText("");
        } else {
            Toast.makeText(getApplicationContext(), recYards + " Receiving Yards Lost", Toast.LENGTH_LONG).show();
            TeamOneRecYard = TeamOneRecYard + recYards;
            teamOneReceiving(TeamOneRecYard);
            teamOneReceivingYards.setText("");
        }
    }

    public void onClickTeamTwoRecComplete(View view) {
        EditText teamTwoReceivingYards = findViewById(R.id.team_two_receiving_yardage);
        int recYards = Integer.parseInt(teamTwoReceivingYards.getText().toString());
        testComplete = teamTwoReceivingYards.getText().toString();
        if (testComplete.matches("")) {
            Toast.makeText(this, "Invalid Entry", Toast.LENGTH_SHORT).show();
        } else if (recYards > 0) {
            Toast.makeText(getApplicationContext(), recYards + " Receiving Yards Added", Toast.LENGTH_LONG).show();
            TeamTwoRecYard = TeamTwoRecYard+ recYards;
            teamTwoReceiving(TeamTwoRecYard);
            teamTwoReceivingYards.setText("");
        } else if (recYards == 0) {
            Toast.makeText(getApplicationContext(), "No Gain", Toast.LENGTH_LONG).show();
            teamTwoReceivingYards.setText("");
        } else {
            Toast.makeText(getApplicationContext(), recYards + " Receiving Yards Lost", Toast.LENGTH_LONG).show();
            TeamTwoRecYard = TeamTwoRecYard + recYards;
            teamTwoReceiving(TeamTwoRecYard);
            teamTwoReceivingYards.setText("");
        }
    }


    public void onClickReturnToHalf(View view) {
        Intent goToHalf = new Intent(this, HalfTime.class);
        goToHalf.putExtra("Team_One_Score", TeamOneScore);
        Log.i("score_team_one", String.valueOf(TeamOneScore));
        goToHalf.putExtra("Team_Two_Score", TeamTwoScore);
        Log.i("score_team_two", String.valueOf(TeamTwoScore));
        goToHalf.putExtra("Team_One_Pass", TeamOneRecYard);
        Log.i("passyards tm1", String.valueOf(TeamOneRecYard));
        goToHalf.putExtra("Team_Two_Pass", TeamTwoRecYard);
        Log.i("passyards tm2", String.valueOf(TeamTwoRecYard));
        goToHalf.putExtra("Team_One_Rush", TeamOneRushYard);
        Log.i("rushyards tm1", String.valueOf(TeamOneRushYard));
        goToHalf.putExtra("Team_Two_Rush", TeamTwoRushYard);
        Log.i("rushyards tm2", String.valueOf(TeamTwoRushYard));
        goToHalf.putExtra("Team_One_Rec", TeamOneRecYard);
        Log.i("recyards tm1", String.valueOf(TeamTwoRecYard));
        goToHalf.putExtra("Team_Two_Rec", TeamTwoRecYard);
        Log.i("recyards tm2", String.valueOf(TeamTwoRecYard));
        goToHalf.putExtra("team_one", teamOneName);
        goToHalf.putExtra("team_two", teamTwoName);
        startActivity(goToHalf);
    }
}



