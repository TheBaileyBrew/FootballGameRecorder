package com.example.android.footballgamerecorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by grumnb on 1/26/2018.
 */

public class GameHasStarted extends AppCompatActivity {
    int TeamOneScore=0;
    int TeamOnePassyards=0;
    int TeamOneRushYard=0;
    int rushingTD=0;
    int receivingTD=0;
    int TeamOneRecYard=0;
    int TeamOneQBFumble=0;
    int TeamOneRBFumble=0;
    int TeamOneWRFumble=0;
    int TeamOneCompleted=0;
    int TeamOneAttempts=0;
    int TeamOneInterceptions=0;
    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.started_game);
        String teamOneName = getIntent().getStringExtra("team_one");
        String teamTwoName = getIntent().getStringExtra("team_two");
        final Spinner teamOneSpinnerScoring;
        Spinner teamTwoSpinnerScoring;
        RelativeLayout PassingRelativeTeamOne;
        RelativeLayout ReceivingRelativeTeamOne;
        RelativeLayout RushingRelativeTeamOne;
        RelativeLayout PassingRelativeTeamTwo;
        RelativeLayout ReceivingRelativeTeamTwo;
        RelativeLayout RushingRelativeTeamTwo;

        TabHost host = (TabHost)findViewById(R.id.tabhost);
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

        teamOneSpinnerScoring = (Spinner) findViewById(R.id.spinner_team_one_scoring);
        ArrayAdapter<CharSequence> teamOneAdapter = ArrayAdapter.createFromResource(this, R.array.scoring, android.R.layout.simple_spinner_dropdown_item);
        teamOneSpinnerScoring.setAdapter(teamOneAdapter);
        PassingRelativeTeamOne = (RelativeLayout) findViewById(R.id.passing_scoring_statistics);
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

        teamTwoSpinnerScoring = (Spinner) findViewById(R.id.spinner_team_two_scoring);
        ArrayAdapter<CharSequence> teamTwoAdapter = ArrayAdapter.createFromResource(this, R.array.scoring, android.R.layout.simple_spinner_dropdown_item);
        teamTwoSpinnerScoring.setAdapter(teamTwoAdapter);
        PassingRelativeTeamOne = (RelativeLayout) findViewById(R.id.passing_scoring_statistics_team2);
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



    public void onClickTeamOneDefTD(View view) {
        TeamOneScore = TeamOneScore + 6;
        teamOneTotalScore(TeamOneScore);
    }

    public void onClickTeamOneRushTD(View view) {
        TeamOneScore = TeamOneScore + 6;
        rushingTD = rushingTD +1;
        teamOneTotalScore(TeamOneScore);
        rbtd(rushingTD);
    }

    public void onClickTeamOneRecTD(View view) {
        TeamOneScore = TeamOneScore + 6;
        receivingTD = receivingTD + 1;
        teamOneTotalScore(TeamOneScore);
        wrtd(receivingTD);

    }

    public void onClickTeamOnePassComplete(View view) {
        TeamOneAttempts = TeamOneAttempts + 1;
        TeamOneCompleted = TeamOneCompleted + 1;
        teamOneIncomplete(TeamOneAttempts);
        teamOneComplete(TeamOneCompleted);
    }

    public void onClickTeamOnePassIncomplete(View view) {
        TeamOneAttempts = TeamOneAttempts + 1;
        teamOneIncomplete(TeamOneAttempts);
    }

    public void onClickTeamOnePassInterception(View view) {
        TeamOneInterceptions = TeamOneInterceptions + 1;
        teamOneIntercept(TeamOneInterceptions);
    }

    public void onClickTeamOnePassFumble(View view) {
        TeamOneQBFumble = TeamOneQBFumble +1;
        qbTeamOneFumble(TeamOneQBFumble);
    }

    public void onClickTeamOneMinusOneRush(View view) {
        TeamOneRushYard = TeamOneRushYard - 1;
        teamOneRushing(TeamOneRushYard);
    }

    public void onClickTeamOnePlusOneRush(View view) {
        TeamOneRushYard = TeamOneRushYard + 1;
        teamOneRushing(TeamOneRushYard);
    }


    public void onClickTeamOnePlusTenRush(View view) {
        TeamOneRushYard = TeamOneRushYard + 10;
        teamOneRushing(TeamOneRushYard);
    }

    public void onClickTeamOneRBFumble(View view) {
        TeamOneRBFumble = TeamOneRBFumble + 1;
        rbTeamOneFumble(TeamOneRBFumble);
    }

    public void onClickTeamOneMinusOneRec(View view) {
        TeamOneRecYard = TeamOneRecYard - 1;
        teamOneReceiving(TeamOneRecYard);
    }

    public void onClickTeamOnePlusOneRec(View view) {
        TeamOneRecYard = TeamOneRecYard + 1;
        teamOneReceiving(TeamOneRecYard);
    }

    public void onClickTeamOnePlusTenRec(View view) {
        TeamOneRecYard = TeamOneRecYard + 10;
        teamOneReceiving(TeamOneRecYard);
    }

    public void onClickTeamOneWRFumble(View view) {
        TeamOneWRFumble = TeamOneWRFumble + 1;
        wrTeamOneFumble(TeamOneWRFumble);
    }

    public void teamOneTotalScore (int score) {
        TextView teamOneScoreTabOne = (TextView) findViewById(R.id.team_one_score_tab_one);
        TextView teamOneScoreTabTwo = (TextView) findViewById(R.id.team_one_score_tab_two);
        teamOneScoreTabOne.setText(String.valueOf(score));
        teamOneScoreTabTwo.setText(String.valueOf(score));
    }

    public void teamOneRushing (int rush) {
        TextView teamOneRush = (TextView) findViewById(R.id.teamOne_rushing_stats);
        teamOneRush.setText(String.valueOf(rush));
    }

    public void teamOneReceiving (int rec) {
        TextView teamOneRec = (TextView) findViewById(R.id.teamOne_receiving_stats);
        teamOneRec.setText(String.valueOf(rec));
    }

    public void teamOneIntercept (int pass) {
        TextView qbintercept = (TextView) findViewById(R.id.passing_intercept_display_total);
        qbintercept.setText(String.valueOf(pass));
    }

    public void teamOneComplete (int pass) {
        TextView qbcomplete = (TextView) findViewById(R.id.passing_comp_display_total);
        qbcomplete.setText(String.valueOf(pass));
    }
    public void teamOneIncomplete (int pass) {
        TextView qbincomplete = (TextView) findViewById(R.id.passing_attempt_display_total);
        qbincomplete.setText(String.valueOf(pass));
    }


    public void qbTeamOneFumble (int fumble) {
        TextView qbfumble = (TextView) findViewById(R.id.fumbles_qb_one_display);
        qbfumble.setText(String.valueOf(fumble));
    }
    public void wrTeamOneFumble (int fumble) {
        TextView wrfumble = (TextView) findViewById(R.id.fumbles_wr_one_display);
        wrfumble.setText(String.valueOf(fumble));
    }
    public void rbTeamOneFumble (int fumble) {
        TextView rbfumble = (TextView) findViewById(R.id.fumbles_rb_one_display);
        rbfumble.setText(String.valueOf(fumble));
    }

    public void wrtd (int td) {
        TextView wideTD = (TextView) findViewById(R.id.touchdown_wr_one_display);
        wideTD.setText(String.valueOf(td));
    }

    public void rbtd (int td) {
        TextView backTD = (TextView) findViewById(R.id.touchdown_rb_one_display);
        backTD.setText(String.valueOf(td));
    }



}
