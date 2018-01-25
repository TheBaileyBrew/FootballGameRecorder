package com.example.android.footballgamerecorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


public class TeamSelection extends AppCompatActivity {
    Spinner teamOneSpinner;
    Spinner teamTwoSpinner;
    String teamOneName;
    String teamTwoName;
    String qbOne;
    String qbTwo;
    int scoreTeamOne=0;
    int scoreTeamTwo=0;
    int passingYardsTeamOne=0;
    int passingYardsTeamTwo=0;
    int rushingYardsTeamOne=0;
    int rushingYardsTeamTwo=0;
    int recievingYardsTeamOne=0;
    int recievingYardsTeamTwo=0;
    int fumblesTeamOne=0;
    int fumblesTeamTwo=0;
    int attemptsTeamOneQB=0;
    int attemptsTeamTwoQB=0;
    int completionsTeamOneQB=0;
    int completionsTeamTwoQB=0;
    int interceptionTeamOne=0;
    int interceptionTeamTwo=0;
    int rushAttemptsTeamOne=0;
    int rushAttemptsTeamTwo=0;
    int recAttemptsTeamOne=0;
    int recAttemptsTeamTwo=0;
    Button teamOneSafetyButton;
    Button teamTwoSafetyButton;
    String teamOneSafetyButtonText;
    String teamTwoSafetyButtonText;
    String fieldgoal = "FIELDGOAL";
    String safety = "SAFETY";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_selection);

        final TextView teamOneQB = (TextView) findViewById(R.id.team_one_passing_player_name);
        final TextView teamTwoQB = (TextView) findViewById(R.id.team_two_passing_player_name);


            //Team One spinner selection criteria and image dsisplay
            teamOneSpinner =(Spinner)

            findViewById(R.id.teamOne_spinner);

            //Created the ArrayAdapter
            ArrayAdapter<CharSequence> teamOneAdapter = ArrayAdapter.createFromResource(this, R.array.football_teams, android.R.layout.simple_spinner_dropdown_item);
        teamOneSpinner.setAdapter(teamOneAdapter);
        teamOneSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

            {
                @Override
                public void onItemSelected (AdapterView < ? > adapterView, View view,int i, long l){
                final ImageView im = (ImageView) findViewById(R.id.team_one_spinner_team_logo);
                String spinnerTeamOne = ((TextView) view).getText().toString();
                teamOneName = String.valueOf(teamOneSpinner.getSelectedItem());
                switch (spinnerTeamOne) {
                    case "Arizona Cardinals":
                        im.setImageResource(R.drawable.arizona_cardinals);
                        teamOneQB.setText(getResources().getString(R.string.arizona_cardinals));
                        break;
                    case "Atlanta Falcons":
                        im.setImageResource(R.drawable.atlanta_falcons);
                        teamOneQB.setText(getResources().getString(R.string.atlanta_falcons));
                        break;
                    case "Baltimore Ravens":
                        im.setImageResource(R.drawable.baltimore_ravens);
                        teamOneQB.setText(getResources().getString(R.string.baltimore_ravens));
                        break;
                    case "Buffalo Bills":
                        im.setImageResource(R.drawable.buffalo_bills);
                        teamOneQB.setText(getResources().getString(R.string.buffalo_bills));
                        break;
                    case "Carolina Panthers":
                        im.setImageResource(R.drawable.carolina_panthers);
                        teamOneQB.setText(getResources().getString(R.string.carolina_panthers));
                        break;
                    case "Chicago Bears":
                        im.setImageResource(R.drawable.chicago_bears);
                        teamOneQB.setText(getResources().getString(R.string.chicago_bears));
                        break;
                    case "Cincinnati Bengals":
                        im.setImageResource(R.drawable.cincinnati_bengals);
                        teamOneQB.setText(getResources().getString(R.string.cincinnati_bengals));
                        break;
                    case "Cleveland Browns":
                        im.setImageResource(R.drawable.cleveland_browns);
                        teamOneQB.setText(getResources().getString(R.string.cleveland_browns));
                        break;
                    case "Dallas Cowboys":
                        im.setImageResource(R.drawable.dallas_cowboys);
                        teamOneQB.setText(getResources().getString(R.string.dallas_cowboys));
                        break;
                    case "Denver Broncos":
                        im.setImageResource(R.drawable.denver_broncos);
                        teamOneQB.setText(getResources().getString(R.string.denver_broncos));
                        break;
                    case "Detroit Lions":
                        im.setImageResource(R.drawable.detroit_lions);
                        teamOneQB.setText(getResources().getString(R.string.detroit_lions));
                        break;
                    case "Green Bay Packers":
                        im.setImageResource(R.drawable.green_bay_packers);
                        teamOneQB.setText(getResources().getString(R.string.green_bay_packers));
                        break;
                    case "Houston Texans":
                        im.setImageResource(R.drawable.houston_texans);
                        teamOneQB.setText(getResources().getString(R.string.houston_texans));
                        break;
                    case "Indianapolis Colts":
                        im.setImageResource(R.drawable.indianapolis_colts);
                        teamOneQB.setText(getResources().getString(R.string.indianapolis_colts));
                        break;
                    case "Jacksonville Jaguars":
                        im.setImageResource(R.drawable.jacksonville_jaguars);
                        teamOneQB.setText(getResources().getString(R.string.jacksonville_jaguars));
                        break;
                    case "Kansas City Chiefs":
                        im.setImageResource(R.drawable.kansas_city_chiefs);
                        teamOneQB.setText(getResources().getString(R.string.kansas_city_chiefs));
                        break;
                    case "Los Angeles Chargers":
                        im.setImageResource(R.drawable.los_angeles_chargers);
                        teamOneQB.setText(getResources().getString(R.string.los_angeles_chargers));
                        break;
                    case "Los Angeles Rams":
                        im.setImageResource(R.drawable.los_angeles_rams);
                        teamOneQB.setText(getResources().getString(R.string.los_angeles_rams));
                        break;
                    case "Miami Dolphins":
                        im.setImageResource(R.drawable.miami_dolphins);
                        teamOneQB.setText(getResources().getString(R.string.miami_dolphins));
                        break;
                    case "Minnesota Vikings":
                        im.setImageResource(R.drawable.minnesota_vikings);
                        teamOneQB.setText(getResources().getString(R.string.minnesota_vikings));
                        break;
                    case "New England Patriots":
                        im.setImageResource(R.drawable.new_england_patriots);
                        teamOneQB.setText(getResources().getString(R.string.new_england_patriots));
                        break;
                    case "New Orleans Saints":
                        im.setImageResource(R.drawable.new_orleans_saints);
                        teamOneQB.setText(getResources().getString(R.string.new_orleans_saints));
                        break;
                    case "New York Giants":
                        im.setImageResource(R.drawable.new_york_giants);
                        teamOneQB.setText(getResources().getString(R.string.new_york_giants));
                        break;
                    case "New York Jets":
                        im.setImageResource(R.drawable.new_york_jets);
                        teamOneQB.setText(getResources().getString(R.string.new_york_jets));
                        break;
                    case "Oakland Raiders":
                        im.setImageResource(R.drawable.oakland_raiders);
                        teamOneQB.setText(getResources().getString(R.string.oakland_raiders));
                        break;
                    case "Philadelphia Eagles":
                        im.setImageResource(R.drawable.philadelphia_eagles);
                        teamOneQB.setText(getResources().getString(R.string.philadelphia_eagles));
                        break;
                    case "Pittsburgh Steelers":
                        im.setImageResource(R.drawable.pittsburgh_steelers);
                        teamOneQB.setText(getResources().getString(R.string.pittsburgh_steelers));
                        break;
                    case "San Francisco 49ers":
                        im.setImageResource(R.drawable.san_francisco_49ers);
                        teamOneQB.setText(getResources().getString(R.string.san_francisco_49ers));
                        break;
                    case "Seattle Seahawks":
                        im.setImageResource(R.drawable.seattle_seahawks);
                        teamOneQB.setText(getResources().getString(R.string.seattle_seahawks));
                        break;
                    case "Tampa Bay Buccaneers":
                        im.setImageResource(R.drawable.tampa_bay_buccaneers);
                        teamOneQB.setText(getResources().getString(R.string.tampa_bay_bucanneers));
                        break;
                    case "Tennessee Titans":
                        im.setImageResource(R.drawable.tennessee_titans);
                        teamOneQB.setText(getResources().getString(R.string.tennessee_titans));
                        break;
                    case "Washington Redskins":
                        im.setImageResource(R.drawable.washington_redskins);
                        teamOneQB.setText(getResources().getString(R.string.washington_redskins));
                        break;
                    case "Choose Your Team":
                        im.setImageResource(R.drawable.blank_helmet);
                        teamOneQB.setText(getResources().getString(R.string.blank_team));
                        break;
                }
            }
                @Override
                public void onNothingSelected (AdapterView < ? > adapterView){

            }
            });


            //Team Two spinner selection criteria and image display
            teamTwoSpinner =(Spinner)

            findViewById(R.id.teamTwo_spinner);

            ArrayAdapter<CharSequence> teamTwoAdapter = ArrayAdapter.createFromResource(this, R.array.football_teams, android.R.layout.simple_spinner_dropdown_item);
        teamTwoSpinner.setAdapter(teamTwoAdapter);
        teamTwoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

            {
                @Override
                public void onItemSelected (AdapterView < ? > adapterView, View view,int i, long l){
                final ImageView im2 = (ImageView) findViewById(R.id.team_two_spinner_team_logo);
                String spinnerTeamTwo = ((TextView) view).getText().toString();
                teamTwoName = String.valueOf(teamTwoSpinner.getSelectedItem());
                switch (spinnerTeamTwo) {
                    case "Arizona Cardinals":
                        im2.setImageResource(R.drawable.arizona_cardinals);
                        teamTwoQB.setText(getResources().getString(R.string.arizona_cardinals));
                        break;
                    case "Atlanta Falcons":
                        im2.setImageResource(R.drawable.atlanta_falcons);
                        teamTwoQB.setText(getResources().getString(R.string.atlanta_falcons));
                        break;
                    case "Baltimore Ravens":
                        im2.setImageResource(R.drawable.baltimore_ravens);
                        teamTwoQB.setText(getResources().getString(R.string.baltimore_ravens));
                        break;
                    case "Buffalo Bills":
                        im2.setImageResource(R.drawable.buffalo_bills);
                        teamTwoQB.setText(getResources().getString(R.string.buffalo_bills));
                        break;
                    case "Carolina Panthers":
                        im2.setImageResource(R.drawable.carolina_panthers);
                        teamTwoQB.setText(getResources().getString(R.string.carolina_panthers));
                        break;
                    case "Chicago Bears":
                        im2.setImageResource(R.drawable.chicago_bears);
                        teamTwoQB.setText(getResources().getString(R.string.chicago_bears));
                        break;
                    case "Cincinnati Bengals":
                        im2.setImageResource(R.drawable.cincinnati_bengals);
                        teamTwoQB.setText(getResources().getString(R.string.cincinnati_bengals));
                        break;
                    case "Cleveland Browns":
                        im2.setImageResource(R.drawable.cleveland_browns);
                        teamTwoQB.setText(getResources().getString(R.string.cleveland_browns));
                        break;
                    case "Dallas Cowboys":
                        im2.setImageResource(R.drawable.dallas_cowboys);
                        teamTwoQB.setText(getResources().getString(R.string.dallas_cowboys));
                        break;
                    case "Denver Broncos":
                        im2.setImageResource(R.drawable.denver_broncos);
                        teamTwoQB.setText(getResources().getString(R.string.denver_broncos));
                        break;
                    case "Detroit Lions":
                        im2.setImageResource(R.drawable.detroit_lions);
                        teamTwoQB.setText(getResources().getString(R.string.detroit_lions));
                        break;
                    case "Green Bay Packers":
                        im2.setImageResource(R.drawable.green_bay_packers);
                        teamTwoQB.setText(getResources().getString(R.string.green_bay_packers));
                        break;
                    case "Houston Texans":
                        im2.setImageResource(R.drawable.houston_texans);
                        teamTwoQB.setText(getResources().getString(R.string.houston_texans));
                        break;
                    case "Indianapolis Colts":
                        im2.setImageResource(R.drawable.indianapolis_colts);
                        teamTwoQB.setText(getResources().getString(R.string.indianapolis_colts));
                        break;
                    case "Jacksonville Jaguars":
                        im2.setImageResource(R.drawable.jacksonville_jaguars);
                        teamTwoQB.setText(getResources().getString(R.string.jacksonville_jaguars));
                        break;
                    case "Kansas City Chiefs":
                        im2.setImageResource(R.drawable.kansas_city_chiefs);
                        teamTwoQB.setText(getResources().getString(R.string.kansas_city_chiefs));
                        break;
                    case "Los Angeles Chargers":
                        im2.setImageResource(R.drawable.los_angeles_chargers);
                        teamTwoQB.setText(getResources().getString(R.string.los_angeles_chargers));
                        break;
                    case "Los Angeles Rams":
                        im2.setImageResource(R.drawable.los_angeles_rams);
                        teamTwoQB.setText(getResources().getString(R.string.los_angeles_rams));
                        break;
                    case "Miami Dolphins":
                        im2.setImageResource(R.drawable.miami_dolphins);
                        teamTwoQB.setText(getResources().getString(R.string.miami_dolphins));
                        break;
                    case "Minnesota Vikings":
                        im2.setImageResource(R.drawable.minnesota_vikings);
                        teamTwoQB.setText(getResources().getString(R.string.minnesota_vikings));
                        break;
                    case "New England Patriots":
                        im2.setImageResource(R.drawable.new_england_patriots);
                        teamTwoQB.setText(getResources().getString(R.string.new_england_patriots));
                        break;
                    case "New Orleans Saints":
                        im2.setImageResource(R.drawable.new_orleans_saints);
                        teamTwoQB.setText(getResources().getString(R.string.new_orleans_saints));
                        break;
                    case "New York Giants":
                        im2.setImageResource(R.drawable.new_york_giants);
                        teamTwoQB.setText(getResources().getString(R.string.new_york_giants));
                        break;
                    case "New York Jets":
                        im2.setImageResource(R.drawable.new_york_jets);
                        teamTwoQB.setText(getResources().getString(R.string.new_york_jets));
                        break;
                    case "Oakland Raiders":
                        im2.setImageResource(R.drawable.oakland_raiders);
                        teamTwoQB.setText(getResources().getString(R.string.oakland_raiders));
                        break;
                    case "Philadelphia Eagles":
                        im2.setImageResource(R.drawable.philadelphia_eagles);
                        teamTwoQB.setText(getResources().getString(R.string.philadelphia_eagles));
                        break;
                    case "Pittsburgh Steelers":
                        im2.setImageResource(R.drawable.pittsburgh_steelers);
                        teamTwoQB.setText(getResources().getString(R.string.pittsburgh_steelers));
                        break;
                    case "San Francisco 49ers":
                        im2.setImageResource(R.drawable.san_francisco_49ers);
                        teamTwoQB.setText(getResources().getString(R.string.san_francisco_49ers));
                        break;
                    case "Seattle Seahawks":
                        im2.setImageResource(R.drawable.seattle_seahawks);
                        teamTwoQB.setText(getResources().getString(R.string.seattle_seahawks));
                        break;
                    case "Tampa Bay Buccaneers":
                        im2.setImageResource(R.drawable.tampa_bay_buccaneers);
                        teamTwoQB.setText(getResources().getString(R.string.tampa_bay_bucanneers));
                        break;
                    case "Tennessee Titans":
                        im2.setImageResource(R.drawable.tennessee_titans);
                        teamTwoQB.setText(getResources().getString(R.string.tennessee_titans));
                        break;
                    case "Washington Redskins":
                        im2.setImageResource(R.drawable.washington_redskins);
                        teamTwoQB.setText(getResources().getString(R.string.washington_redskins));
                        break;
                    case "Choose Your Team":
                        im2.setImageResource(R.drawable.blank_helmet);
                        break;
                }

            }

                @Override
                public void onNothingSelected (AdapterView < ? > adapterView){

            }
            });

        qbOne = teamOneQB.getText().toString();
        qbTwo = teamTwoQB.getText().toString();


    }

    public void onClickStartGame(View view) {
        Intent goToStartGame = new Intent(this,StartGame.class);
        Log.i(teamOneName, "is the value of selection intent");
        goToStartGame.putExtra("team_one", teamOneName);
        goToStartGame.putExtra("team_two", teamTwoName);
        Log.i(qbOne, "is the name of the starting qb team one");
        Log.i(qbTwo, "is the name of the starting qb team two");
        goToStartGame.putExtra("qb_one", qbOne);
        goToStartGame.putExtra("qb_two", qbTwo);

        startActivity(goToStartGame);

    }



}
