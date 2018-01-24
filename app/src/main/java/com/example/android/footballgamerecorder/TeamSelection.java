package com.example.android.footballgamerecorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_selection);
        final TextView teamOneQB = (TextView) findViewById(R.id.team_one_passing_player_name);
        final TextView teamTwoQB = (TextView) findViewById(R.id.team_two_passing_player_name);

        //Team One spinner selection criteria and image dsisplay
        teamOneSpinner = (Spinner) findViewById(R.id.teamOne_spinner);
        //Created the ArrayAdapter
        ArrayAdapter<CharSequence> teamOneAdapter = ArrayAdapter.createFromResource(this, R.array.football_teams, android.R.layout.simple_spinner_dropdown_item);
        teamOneSpinner.setAdapter(teamOneAdapter);
        teamOneSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                final ImageView im = (ImageView)findViewById(R.id.team_one_spinner_team_logo);
                final ImageView imageStart = (ImageView)findViewById(R.id.team_one_game_start_logo);
                String s=((TextView)view).getText().toString();
                if(s.equals("Arizona Cardinals")) {
                    im.setImageResource(R.drawable.arizona_cardinals);
                    teamOneQB.setText(getResources().getString(R.string.arizona_cardinals)); }
                else if(s.equals("Atlanta Falcons")) {
                    im.setImageResource(R.drawable.atlanta_falcons);
                    teamOneQB.setText(getResources().getString(R.string.atlanta_falcons)); }
                else if(s.equals("Baltimore Ravens")) {
                    im.setImageResource(R.drawable.baltimore_ravens);
                    teamOneQB.setText(getResources().getString(R.string.baltimore_ravens)); }
                else if(s.equals("Buffalo Bills")) {
                    im.setImageResource(R.drawable.buffalo_bills);
                    teamOneQB.setText(getResources().getString(R.string.buffalo_bills)); }
                else if(s.equals("Carolina Panthers")) {
                    im.setImageResource(R.drawable.carolina_panthers);
                    teamOneQB.setText(getResources().getString(R.string.carolina_panthers)); }
                else if(s.equals("Chicago Bears")) {
                    im.setImageResource(R.drawable.chicago_bears);
                    teamOneQB.setText(getResources().getString(R.string.chicago_bears)); }
                else if(s.equals("Cincinnati Bengals")) {
                    im.setImageResource(R.drawable.cincinnati_bengals);
                    teamOneQB.setText(getResources().getString(R.string.cincinnati_bengals)); }
                else if(s.equals("Cleveland Browns")) {
                    im.setImageResource(R.drawable.cleveland_browns);
                    teamOneQB.setText(getResources().getString(R.string.cleveland_browns)); }
                else if(s.equals("Dallas Cowboys")) {
                    im.setImageResource(R.drawable.dallas_cowboys);
                    teamOneQB.setText(getResources().getString(R.string.dallas_cowboys)); }
                else if(s.equals("Denver Broncos")) {
                    im.setImageResource(R.drawable.denver_broncos);
                    teamOneQB.setText(getResources().getString(R.string.denver_broncos)); }
                else if(s.equals("Detroit Lions")) {
                    im.setImageResource(R.drawable.detroit_lions);
                    teamOneQB.setText(getResources().getString(R.string.detroit_lions)); }
                else if(s.equals("Green Bay Packers")) {
                    im.setImageResource(R.drawable.green_bay_packers);
                    teamOneQB.setText(getResources().getString(R.string.green_bay_packers)); }
                else if(s.equals("Houston Texans")) {
                    im.setImageResource(R.drawable.houston_texans);
                    teamOneQB.setText(getResources().getString(R.string.houston_texans)); }
                else if(s.equals("Indianapolis Colts")) {
                    im.setImageResource(R.drawable.indianapolis_colts);
                    teamOneQB.setText(getResources().getString(R.string.indianapolis_colts)); }
                else if(s.equals("Jacksonville Jaguars")) {
                    im.setImageResource(R.drawable.jacksonville_jaguars);
                    teamOneQB.setText(getResources().getString(R.string.jacksonville_jaguars)); }
                else if(s.equals("Kansas City Chiefs")) {
                    im.setImageResource(R.drawable.kansas_city_chiefs);
                    teamOneQB.setText(getResources().getString(R.string.kansas_city_chiefs)); }
                else if(s.equals("Los Angeles Chargers")) {
                    im.setImageResource(R.drawable.los_angeles_chargers);
                    teamOneQB.setText(getResources().getString(R.string.los_angeles_chargers)); }
                else if(s.equals("Los Angeles Rams")) {
                    im.setImageResource(R.drawable.los_angeles_rams);
                    teamOneQB.setText(getResources().getString(R.string.los_angeles_rams)); }
                else if(s.equals("Miami Dolphins")) {
                    im.setImageResource(R.drawable.miami_dolphins);
                    teamOneQB.setText(getResources().getString(R.string.miami_dolphins)); }
                else if(s.equals("Minnesota Vikings")) {
                    im.setImageResource(R.drawable.minnesota_vikings);
                    teamOneQB.setText(getResources().getString(R.string.minnesota_vikings)); }
                else if(s.equals("New England Patriots")) {
                    im.setImageResource(R.drawable.new_england_patriots);
                    teamOneQB.setText(getResources().getString(R.string.new_england_patriots)); }
                else if(s.equals("New Orleans Saints")) {
                    im.setImageResource(R.drawable.new_orleans_saints);
                    teamOneQB.setText(getResources().getString(R.string.new_orleans_saints)); }
                else if(s.equals("New York Giants")) {
                    im.setImageResource(R.drawable.new_york_giants);
                    teamOneQB.setText(getResources().getString(R.string.new_york_giants)); }
                else if(s.equals("New York Jets")) {
                    im.setImageResource(R.drawable.new_york_jets);
                    teamOneQB.setText(getResources().getString(R.string.new_york_jets)); }
                else if(s.equals("Oakland Raiders")) {
                    im.setImageResource(R.drawable.oakland_raiders);
                    teamOneQB.setText(getResources().getString(R.string.oakland_raiders)); }
                else if(s.equals("Philadelphia Eagles")) {
                    im.setImageResource(R.drawable.philadelphia_eagles);
                    teamOneQB.setText(getResources().getString(R.string.philadelphia_eagles)); }
                else if(s.equals("Pittsburgh Steelers")) {
                    im.setImageResource(R.drawable.pittsburgh_steelers);
                    teamOneQB.setText(getResources().getString(R.string.pittsburgh_steelers)); }
                else if(s.equals("San Francisco 49ers")) {
                    im.setImageResource(R.drawable.san_francisco_49ers);
                    teamOneQB.setText(getResources().getString(R.string.san_francisco_49ers)); }
                else if(s.equals("Seattle Seahawks")) {
                    im.setImageResource(R.drawable.seattle_seahawks);
                    teamOneQB.setText(getResources().getString(R.string.seattle_seahawks)); }
                else if(s.equals("Tampa Bay Buccaneers")) {
                    im.setImageResource(R.drawable.tampa_bay_buccaneers);
                    teamOneQB.setText(getResources().getString(R.string.tampa_bay_bucanneers)); }
                else if(s.equals("Tennessee Titans")) {
                    im.setImageResource(R.drawable.tennessee_titans);
                    teamOneQB.setText(getResources().getString(R.string.tennessee_titans)); }
                else if(s.equals("Washington Redskins")) {
                    im.setImageResource(R.drawable.washington_redskins);
                    teamOneQB.setText(getResources().getString(R.string.washington_redskins)); }
                else if(s.equals("Choose Your Team"))
                    im.setImageResource(R.drawable.blank_helmet);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Team Two spinner selection criteria and image display
        teamTwoSpinner = (Spinner) findViewById(R.id.teamTwo_spinner);
        ArrayAdapter<CharSequence> teamTwoAdapter = ArrayAdapter.createFromResource(this, R.array.football_teams, android.R.layout.simple_spinner_dropdown_item);
        teamTwoSpinner.setAdapter(teamTwoAdapter);
        teamTwoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                final ImageView im2 = (ImageView)findViewById(R.id.team_two_spinner_team_logo);
                String s2 = ((TextView)view).getText().toString();
                if(s2.equals("Arizona Cardinals")) {
                    im2.setImageResource(R.drawable.arizona_cardinals);
                    teamTwoQB.setText(getResources().getString(R.string.arizona_cardinals)); }
                else if(s2.equals("Atlanta Falcons")) {
                    im2.setImageResource(R.drawable.atlanta_falcons);
                    teamTwoQB.setText(getResources().getString(R.string.atlanta_falcons)); }
                else if(s2.equals("Baltimore Ravens")) {
                    im2.setImageResource(R.drawable.baltimore_ravens);
                    teamTwoQB.setText(getResources().getString(R.string.baltimore_ravens)); }
                else if(s2.equals("Buffalo Bills")) {
                    im2.setImageResource(R.drawable.buffalo_bills);
                    teamTwoQB.setText(getResources().getString(R.string.buffalo_bills)); }
                else if(s2.equals("Carolina Panthers")) {
                    im2.setImageResource(R.drawable.carolina_panthers);
                    teamTwoQB.setText(getResources().getString(R.string.carolina_panthers)); }
                else if(s2.equals("Chicago Bears")) {
                    im2.setImageResource(R.drawable.chicago_bears);
                    teamTwoQB.setText(getResources().getString(R.string.chicago_bears)); }
                else if(s2.equals("Cincinnati Bengals")) {
                    im2.setImageResource(R.drawable.cincinnati_bengals);
                    teamTwoQB.setText(getResources().getString(R.string.cincinnati_bengals)); }
                else if(s2.equals("Cleveland Browns")) {
                    im2.setImageResource(R.drawable.cleveland_browns);
                    teamTwoQB.setText(getResources().getString(R.string.cleveland_browns)); }
                else if(s2.equals("Dallas Cowboys")) {
                    im2.setImageResource(R.drawable.dallas_cowboys);
                    teamTwoQB.setText(getResources().getString(R.string.dallas_cowboys)); }
                else if(s2.equals("Denver Broncos")) {
                    im2.setImageResource(R.drawable.denver_broncos);
                    teamTwoQB.setText(getResources().getString(R.string.denver_broncos)); }
                else if(s2.equals("Detroit Lions")) {
                    im2.setImageResource(R.drawable.detroit_lions);
                    teamTwoQB.setText(getResources().getString(R.string.detroit_lions)); }
                else if(s2.equals("Green Bay Packers")) {
                    im2.setImageResource(R.drawable.green_bay_packers);
                    teamTwoQB.setText(getResources().getString(R.string.green_bay_packers)); }
                else if(s2.equals("Houston Texans")) {
                    im2.setImageResource(R.drawable.houston_texans);
                    teamTwoQB.setText(getResources().getString(R.string.houston_texans)); }
                else if(s2.equals("Indianapolis Colts")) {
                    im2.setImageResource(R.drawable.indianapolis_colts);
                    teamTwoQB.setText(getResources().getString(R.string.indianapolis_colts)); }
                else if(s2.equals("Jacksonville Jaguars")) {
                    im2.setImageResource(R.drawable.jacksonville_jaguars);
                    teamTwoQB.setText(getResources().getString(R.string.jacksonville_jaguars)); }
                else if(s2.equals("Kansas City Chiefs")) {
                    im2.setImageResource(R.drawable.kansas_city_chiefs);
                    teamTwoQB.setText(getResources().getString(R.string.kansas_city_chiefs)); }
                else if(s2.equals("Los Angeles Chargers")) {
                    im2.setImageResource(R.drawable.los_angeles_chargers);
                    teamTwoQB.setText(getResources().getString(R.string.los_angeles_chargers)); }
                else if(s2.equals("Los Angeles Rams")) {
                    im2.setImageResource(R.drawable.los_angeles_rams);
                    teamTwoQB.setText(getResources().getString(R.string.los_angeles_rams)); }
                else if(s2.equals("Miami Dolphins")) {
                    im2.setImageResource(R.drawable.miami_dolphins);
                    teamTwoQB.setText(getResources().getString(R.string.miami_dolphins)); }
                else if(s2.equals("Minnesota Vikings")) {
                    im2.setImageResource(R.drawable.minnesota_vikings);
                    teamTwoQB.setText(getResources().getString(R.string.minnesota_vikings)); }
                else if(s2.equals("New England Patriots")) {
                    im2.setImageResource(R.drawable.new_england_patriots);
                    teamTwoQB.setText(getResources().getString(R.string.new_england_patriots)); }
                else if(s2.equals("New Orleans Saints")) {
                    im2.setImageResource(R.drawable.new_orleans_saints);
                    teamTwoQB.setText(getResources().getString(R.string.new_orleans_saints)); }
                else if(s2.equals("New York Giants")) {
                    im2.setImageResource(R.drawable.new_york_giants);
                    teamTwoQB.setText(getResources().getString(R.string.new_york_giants)); }
                else if(s2.equals("New York Jets")) {
                    im2.setImageResource(R.drawable.new_york_jets);
                    teamTwoQB.setText(getResources().getString(R.string.new_york_jets)); }
                else if(s2.equals("Oakland Raiders")) {
                    im2.setImageResource(R.drawable.oakland_raiders);
                    teamTwoQB.setText(getResources().getString(R.string.oakland_raiders)); }
                else if(s2.equals("Philadelphia Eagles")) {
                    im2.setImageResource(R.drawable.philadelphia_eagles);
                    teamTwoQB.setText(getResources().getString(R.string.philadelphia_eagles)); }
                else if(s2.equals("Pittsburgh Steelers")) {
                    im2.setImageResource(R.drawable.pittsburgh_steelers);
                    teamTwoQB.setText(getResources().getString(R.string.pittsburgh_steelers)); }
                else if(s2.equals("San Francisco 49ers")) {
                    im2.setImageResource(R.drawable.san_francisco_49ers);
                    teamTwoQB.setText(getResources().getString(R.string.san_francisco_49ers)); }
                else if(s2.equals("Seattle Seahawks")) {
                    im2.setImageResource(R.drawable.seattle_seahawks);
                    teamTwoQB.setText(getResources().getString(R.string.seattle_seahawks)); }
                else if(s2.equals("Tampa Bay Buccaneers")) {
                    im2.setImageResource(R.drawable.tampa_bay_buccaneers);
                    teamTwoQB.setText(getResources().getString(R.string.tampa_bay_bucanneers)); }
                else if(s2.equals("Tennessee Titans")) {
                    im2.setImageResource(R.drawable.tennessee_titans);
                    teamTwoQB.setText(getResources().getString(R.string.tennessee_titans)); }
                else if(s2.equals("Washington Redskins")) {
                    im2.setImageResource(R.drawable.washington_redskins);
                    teamTwoQB.setText(getResources().getString(R.string.washington_redskins)); }
                else if(s2.equals("Choose Your Team"))
                    im2.setImageResource(R.drawable.blank_helmet);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void onClickStartGame(View view) {
        Intent goToStartGame = new Intent(this,StartGame.class);
        startActivity(goToStartGame);
    }
}
