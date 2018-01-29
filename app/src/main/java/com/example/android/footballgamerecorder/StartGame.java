package com.example.android.footballgamerecorder;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by grumnb on 1/24/2018.
 */

public class StartGame extends AppCompatActivity {


    static String teamOneName;
    static String teamTwoName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);

        String teamOneQuarterback;
        String teamTwoQuarterback;
        teamTwoName = getIntent().getStringExtra("team_two");
        teamOneName = getIntent().getStringExtra("team_one");

        TextView teamOnePassing = (TextView) findViewById(R.id.team_one_passing_yards_display);
        TextView teamTwoPassing = (TextView) findViewById(R.id.team_two_passing_yards_display);
        TextView teamOneRushing = (TextView) findViewById(R.id.team_one_rushing_yards_display);
        TextView teamTwoRushing = (TextView) findViewById(R.id.team_two_rushing_yards_display);
        TextView teamOneReceiving = (TextView) findViewById(R.id.team_one_receiving_yards_display);
        TextView teamTwoReceiving = (TextView) findViewById(R.id.team_two_receiving_yards_display);


        TextView textView = (TextView) findViewById(R.id.team_one_game_start_name_display);
        TextView scoreTeamOne = (TextView) findViewById(R.id.team_one_score_display);
        TextView textView2 = (TextView) findViewById(R.id.team_two_game_start_name_display);
        TextView scoreTeamTwo = (TextView) findViewById(R.id.team_two_score_display);
        textView.setText(teamOneName);
        textView2.setText(teamTwoName);
        TextView teamOneQB = (TextView) findViewById(R.id.team_one_passing_player_name);
        TextView teamTwoQB = (TextView) findViewById(R.id.team_two_passing_player_name);
        final ImageView im = (ImageView) findViewById(R.id.team_one_game_start_logo);
        final ImageView im2 = (ImageView) findViewById(R.id.team_two_game_start_logo);

        switch (teamOneName) {
            case "Arizona Cardinals":
                im.setImageResource(R.drawable.arizona_cardinals);
                teamOneQB.setText(getResources().getString(R.string.arizona_cardinals));
                textView.setTextColor(getResources().getColor(R.color.cardsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.cardsSecondary));
                break;
            case "Atlanta Falcons":
                im.setImageResource(R.drawable.atlanta_falcons);
                teamOneQB.setText(getResources().getString(R.string.atlanta_falcons));
                textView.setTextColor(getResources().getColor(R.color.falconsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.falconsSecondary));
                break;
            case "Baltimore Ravens":
                im.setImageResource(R.drawable.baltimore_ravens);
                teamOneQB.setText(getResources().getString(R.string.baltimore_ravens));
                textView.setTextColor(getResources().getColor(R.color.ravensPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.ravensSecondary));
                break;
            case "Buffalo Bills":
                im.setImageResource(R.drawable.buffalo_bills);
                teamOneQB.setText(getResources().getString(R.string.buffalo_bills));
                textView.setTextColor(getResources().getColor(R.color.billsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.billsSecondary));
                break;
            case "Carolina Panthers":
                im.setImageResource(R.drawable.carolina_panthers);
                teamOneQB.setText(getResources().getString(R.string.carolina_panthers));
                textView.setTextColor(getResources().getColor(R.color.panthersPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.panthersSecondary));
                break;
            case "Chicago Bears":
                im.setImageResource(R.drawable.chicago_bears);
                teamOneQB.setText(getResources().getString(R.string.chicago_bears));
                textView.setTextColor(getResources().getColor(R.color.bearsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.bearsSecondary));
                break;
            case "Cincinnati Bengals":
                im.setImageResource(R.drawable.cincinnati_bengals);
                teamOneQB.setText(getResources().getString(R.string.cincinnati_bengals));
                textView.setTextColor(getResources().getColor(R.color.bengalsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.bengalsSecondary));
                break;
            case "Cleveland Browns":
                im.setImageResource(R.drawable.cleveland_browns);
                teamOneQB.setText(getResources().getString(R.string.cleveland_browns));
                textView.setTextColor(getResources().getColor(R.color.brownsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.brownsSecondary));
                break;
            case "Dallas Cowboys":
                im.setImageResource(R.drawable.dallas_cowboys);
                teamOneQB.setText(getResources().getString(R.string.dallas_cowboys));
                textView.setTextColor(getResources().getColor(R.color.cowboysPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.cowboysSecondary));
                break;
            case "Denver Broncos":
                im.setImageResource(R.drawable.denver_broncos);
                teamOneQB.setText(getResources().getString(R.string.denver_broncos));
                textView.setTextColor(getResources().getColor(R.color.broncosPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.broncosSecondary));
                break;
            case "Detroit Lions":
                im.setImageResource(R.drawable.detroit_lions);
                teamOneQB.setText(getResources().getString(R.string.detroit_lions));
                textView.setTextColor(getResources().getColor(R.color.lionsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.lionsSecondary));
                break;
            case "Green Bay Packers":
                im.setImageResource(R.drawable.green_bay_packers);
                teamOneQB.setText(getResources().getString(R.string.green_bay_packers));
                textView.setTextColor(getResources().getColor(R.color.packersPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.packersSecondary));
                break;
            case "Houston Texans":
                im.setImageResource(R.drawable.houston_texans);
                teamOneQB.setText(getResources().getString(R.string.houston_texans));
                textView.setTextColor(getResources().getColor(R.color.texansPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.texansSecondary));
                break;
            case "Indianapolis Colts":
                im.setImageResource(R.drawable.indianapolis_colts);
                teamOneQB.setText(getResources().getString(R.string.indianapolis_colts));
                textView.setTextColor(getResources().getColor(R.color.coltsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.coltsSecondary));
                break;
            case "Jacksonville Jaguars":
                im.setImageResource(R.drawable.jacksonville_jaguars);
                teamOneQB.setText(getResources().getString(R.string.jacksonville_jaguars));
                textView.setTextColor(getResources().getColor(R.color.jagsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.jagsSecondary));
                break;
            case "Kansas City Chiefs":
                im.setImageResource(R.drawable.kansas_city_chiefs);
                teamOneQB.setText(getResources().getString(R.string.kansas_city_chiefs));
                textView.setTextColor(getResources().getColor(R.color.chiefsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.chiefsSecondary));
                break;
            case "Los Angeles Chargers":
                im.setImageResource(R.drawable.los_angeles_chargers);
                teamOneQB.setText(getResources().getString(R.string.los_angeles_chargers));
                textView.setTextColor(getResources().getColor(R.color.chargersPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.chargersSecondary));
                break;
            case "Los Angeles Rams":
                im.setImageResource(R.drawable.los_angeles_rams);
                teamOneQB.setText(getResources().getString(R.string.los_angeles_rams));
                textView.setTextColor(getResources().getColor(R.color.ramsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.ramsSecondary));
                break;
            case "Miami Dolphins":
                im.setImageResource(R.drawable.miami_dolphins);
                teamOneQB.setText(getResources().getString(R.string.miami_dolphins));
                textView.setTextColor(getResources().getColor(R.color.dolphinsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.dolphinsSecondary));
                break;
            case "Minnesota Vikings":
                im.setImageResource(R.drawable.minnesota_vikings);
                teamOneQB.setText(getResources().getString(R.string.minnesota_vikings));
                textView.setTextColor(getResources().getColor(R.color.vikingsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.vikingsSecondary));
                break;
            case "New England Patriots":
                im.setImageResource(R.drawable.new_england_patriots);
                teamOneQB.setText(getResources().getString(R.string.new_england_patriots));
                textView.setTextColor(getResources().getColor(R.color.patsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.patsSecondary));
                break;
            case "New Orleans Saints":
                im.setImageResource(R.drawable.new_orleans_saints);
                teamOneQB.setText(getResources().getString(R.string.new_orleans_saints));
                textView.setTextColor(getResources().getColor(R.color.saintsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.saintsSecondary));
                break;
            case "New York Giants":
                im.setImageResource(R.drawable.new_york_giants);
                teamOneQB.setText(getResources().getString(R.string.new_york_giants));
                textView.setTextColor(getResources().getColor(R.color.giantsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.giantsSecondary));
                break;
            case "New York Jets":
                im.setImageResource(R.drawable.new_york_jets);
                teamOneQB.setText(getResources().getString(R.string.new_york_jets));
                textView.setTextColor(getResources().getColor(R.color.jetsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.jetsSecondary));
                break;
            case "Oakland Raiders":
                im.setImageResource(R.drawable.oakland_raiders);
                teamOneQB.setText(getResources().getString(R.string.oakland_raiders));
                textView.setTextColor(getResources().getColor(R.color.raidersPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.raidersSecondary));
                break;
            case "Philadelphia Eagles":
                im.setImageResource(R.drawable.philadelphia_eagles);
                teamOneQB.setText(getResources().getString(R.string.philadelphia_eagles));
                textView.setTextColor(getResources().getColor(R.color.eaglesPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.eaglesSecondary));
                break;
            case "Pittsburgh Steelers":
                im.setImageResource(R.drawable.pittsburgh_steelers);
                teamOneQB.setText(getResources().getString(R.string.pittsburgh_steelers));
                textView.setTextColor(getResources().getColor(R.color.steelersPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.steelersSecondary));
                break;
            case "San Francisco 49ers":
                im.setImageResource(R.drawable.san_francisco_49ers);
                teamOneQB.setText(getResources().getString(R.string.san_francisco_49ers));
                textView.setTextColor(getResources().getColor(R.color.sanfranPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.sanfranSecondary));
                break;
            case "Seattle Seahawks":
                im.setImageResource(R.drawable.seattle_seahawks);
                teamOneQB.setText(getResources().getString(R.string.seattle_seahawks));
                textView.setTextColor(getResources().getColor(R.color.seahawksPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.seahawksSecondary));
                break;
            case "Tampa Bay Buccaneers":
                im.setImageResource(R.drawable.tampa_bay_buccaneers);
                teamOneQB.setText(getResources().getString(R.string.tampa_bay_bucanneers));
                textView.setTextColor(getResources().getColor(R.color.bucanPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.bucanSecondary));
                break;
            case "Tennessee Titans":
                im.setImageResource(R.drawable.tennessee_titans);
                teamOneQB.setText(getResources().getString(R.string.tennessee_titans));
                textView.setTextColor(getResources().getColor(R.color.titansPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.titansSecondary));
                break;
            case "Washington Redskins":
                im.setImageResource(R.drawable.washington_redskins);
                teamOneQB.setText(getResources().getString(R.string.washington_redskins));
                textView.setTextColor(getResources().getColor(R.color.redskinsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.redskinsSecondary));
                break;
            case "Choose Your Team":
                im.setImageResource(R.drawable.blank_helmet);
                break;
        }

        switch (teamTwoName) {
            case "Arizona Cardinals":
                im2.setImageResource(R.drawable.arizona_cardinals);
                teamTwoQB.setText(getResources().getString(R.string.arizona_cardinals));
                textView2.setTextColor(getResources().getColor(R.color.cardsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.cardsSecondary));
                break;
            case "Atlanta Falcons":
                im2.setImageResource(R.drawable.atlanta_falcons);
                teamTwoQB.setText(getResources().getString(R.string.atlanta_falcons));
                textView2.setTextColor(getResources().getColor(R.color.falconsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.falconsSecondary));
                break;
            case "Baltimore Ravens":
                im2.setImageResource(R.drawable.baltimore_ravens);
                teamTwoQB.setText(getResources().getString(R.string.baltimore_ravens));
                textView2.setTextColor(getResources().getColor(R.color.ravensPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.ravensSecondary));
                break;
            case "Buffalo Bills":
                im2.setImageResource(R.drawable.buffalo_bills);
                teamTwoQB.setText(getResources().getString(R.string.buffalo_bills));
                textView2.setTextColor(getResources().getColor(R.color.billsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.billsSecondary));
                break;
            case "Carolina Panthers":
                im2.setImageResource(R.drawable.carolina_panthers);
                teamTwoQB.setText(getResources().getString(R.string.carolina_panthers));
                textView2.setTextColor(getResources().getColor(R.color.panthersPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.panthersSecondary));
                break;
            case "Chicago Bears":
                im2.setImageResource(R.drawable.chicago_bears);
                teamTwoQB.setText(getResources().getString(R.string.chicago_bears));
                textView2.setTextColor(getResources().getColor(R.color.bearsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.bearsSecondary));
                break;
            case "Cincinnati Bengals":
                im2.setImageResource(R.drawable.cincinnati_bengals);
                teamTwoQB.setText(getResources().getString(R.string.cincinnati_bengals));
                textView2.setTextColor(getResources().getColor(R.color.bengalsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.bengalsSecondary));
                break;
            case "Cleveland Browns":
                im2.setImageResource(R.drawable.cleveland_browns);
                teamTwoQB.setText(getResources().getString(R.string.cleveland_browns));
                textView2.setTextColor(getResources().getColor(R.color.brownsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.brownsSecondary));
                break;
            case "Dallas Cowboys":
                im2.setImageResource(R.drawable.dallas_cowboys);
                teamTwoQB.setText(getResources().getString(R.string.dallas_cowboys));
                textView2.setTextColor(getResources().getColor(R.color.cowboysPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.cowboysSecondary));
                break;
            case "Denver Broncos":
                im2.setImageResource(R.drawable.denver_broncos);
                teamTwoQB.setText(getResources().getString(R.string.denver_broncos));
                textView2.setTextColor(getResources().getColor(R.color.broncosPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.broncosSecondary));
                break;
            case "Detroit Lions":
                im2.setImageResource(R.drawable.detroit_lions);
                teamTwoQB.setText(getResources().getString(R.string.detroit_lions));
                textView2.setTextColor(getResources().getColor(R.color.lionsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.lionsSecondary));
                break;
            case "Green Bay Packers":
                im2.setImageResource(R.drawable.green_bay_packers);
                teamTwoQB.setText(getResources().getString(R.string.green_bay_packers));
                textView2.setTextColor(getResources().getColor(R.color.packersPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.packersSecondary));
                break;
            case "Houston Texans":
                im2.setImageResource(R.drawable.houston_texans);
                teamTwoQB.setText(getResources().getString(R.string.houston_texans));
                textView2.setTextColor(getResources().getColor(R.color.texansPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.texansSecondary));
                break;
            case "Indianapolis Colts":
                im2.setImageResource(R.drawable.indianapolis_colts);
                teamTwoQB.setText(getResources().getString(R.string.indianapolis_colts));
                textView2.setTextColor(getResources().getColor(R.color.coltsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.coltsSecondary));
                break;
            case "Jacksonville Jaguars":
                im2.setImageResource(R.drawable.jacksonville_jaguars);
                teamTwoQB.setText(getResources().getString(R.string.jacksonville_jaguars));
                textView2.setTextColor(getResources().getColor(R.color.jagsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.jagsSecondary));
                break;
            case "Kansas City Chiefs":
                im2.setImageResource(R.drawable.kansas_city_chiefs);
                teamTwoQB.setText(getResources().getString(R.string.kansas_city_chiefs));
                textView2.setTextColor(getResources().getColor(R.color.chiefsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.chiefsSecondary));
                break;
            case "Los Angeles Chargers":
                im2.setImageResource(R.drawable.los_angeles_chargers);
                teamTwoQB.setText(getResources().getString(R.string.los_angeles_chargers));
                textView2.setTextColor(getResources().getColor(R.color.chargersPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.chargersSecondary));
                break;
            case "Los Angeles Rams":
                im2.setImageResource(R.drawable.los_angeles_rams);
                teamTwoQB.setText(getResources().getString(R.string.los_angeles_rams));
                textView2.setTextColor(getResources().getColor(R.color.ramsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.ramsSecondary));
                break;
            case "Miami Dolphins":
                im2.setImageResource(R.drawable.miami_dolphins);
                teamTwoQB.setText(getResources().getString(R.string.miami_dolphins));
                textView2.setTextColor(getResources().getColor(R.color.dolphinsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.dolphinsSecondary));
                break;
            case "Minnesota Vikings":
                im2.setImageResource(R.drawable.minnesota_vikings);
                teamTwoQB.setText(getResources().getString(R.string.minnesota_vikings));
                textView2.setTextColor(getResources().getColor(R.color.vikingsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.vikingsSecondary));
                break;
            case "New England Patriots":
                im2.setImageResource(R.drawable.new_england_patriots);
                teamTwoQB.setText(getResources().getString(R.string.new_england_patriots));
                textView2.setTextColor(getResources().getColor(R.color.patsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.patsSecondary));
                break;
            case "New Orleans Saints":
                im2.setImageResource(R.drawable.new_orleans_saints);
                teamTwoQB.setText(getResources().getString(R.string.new_orleans_saints));
                textView2.setTextColor(getResources().getColor(R.color.saintsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.saintsSecondary));
                break;
            case "New York Giants":
                im2.setImageResource(R.drawable.new_york_giants);
                teamTwoQB.setText(getResources().getString(R.string.new_york_giants));
                textView2.setTextColor(getResources().getColor(R.color.giantsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.giantsSecondary));
                break;
            case "New York Jets":
                im2.setImageResource(R.drawable.new_york_jets);
                teamTwoQB.setText(getResources().getString(R.string.new_york_jets));
                textView2.setTextColor(getResources().getColor(R.color.jetsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.jetsSecondary));
                break;
            case "Oakland Raiders":
                im2.setImageResource(R.drawable.oakland_raiders);
                teamTwoQB.setText(getResources().getString(R.string.oakland_raiders));
                textView2.setTextColor(getResources().getColor(R.color.raidersPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.raidersSecondary));
                break;
            case "Philadelphia Eagles":
                im2.setImageResource(R.drawable.philadelphia_eagles);
                teamTwoQB.setText(getResources().getString(R.string.philadelphia_eagles));
                textView2.setTextColor(getResources().getColor(R.color.eaglesPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.eaglesSecondary));
                break;
            case "Pittsburgh Steelers":
                im2.setImageResource(R.drawable.pittsburgh_steelers);
                teamTwoQB.setText(getResources().getString(R.string.pittsburgh_steelers));
                textView2.setTextColor(getResources().getColor(R.color.steelersPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.steelersSecondary));
                break;
            case "San Francisco 49ers":
                im2.setImageResource(R.drawable.san_francisco_49ers);
                teamTwoQB.setText(getResources().getString(R.string.san_francisco_49ers));
                textView2.setTextColor(getResources().getColor(R.color.sanfranPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.sanfranSecondary));
                break;
            case "Seattle Seahawks":
                im2.setImageResource(R.drawable.seattle_seahawks);
                teamTwoQB.setText(getResources().getString(R.string.seattle_seahawks));
                textView2.setTextColor(getResources().getColor(R.color.seahawksPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.seahawksSecondary));
                break;
            case "Tampa Bay Buccaneers":
                im2.setImageResource(R.drawable.tampa_bay_buccaneers);
                teamTwoQB.setText(getResources().getString(R.string.tampa_bay_bucanneers));
                textView2.setTextColor(getResources().getColor(R.color.bucanPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.bucanSecondary));
                break;
            case "Tennessee Titans":
                im2.setImageResource(R.drawable.tennessee_titans);
                teamTwoQB.setText(getResources().getString(R.string.tennessee_titans));
                textView2.setTextColor(getResources().getColor(R.color.titansPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.titansSecondary));
                break;
            case "Washington Redskins":
                im2.setImageResource(R.drawable.washington_redskins);
                teamTwoQB.setText(getResources().getString(R.string.washington_redskins));
                textView2.setTextColor(getResources().getColor(R.color.redskinsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.redskinsSecondary));
                break;
            case "Choose Your Team":
                im.setImageResource(R.drawable.blank_helmet);
                break;
        }









    }


    public void returnToTeamSelection(View view) {
        Intent goToTeamSelect = new Intent(this,TeamSelection.class);
        startActivity(goToTeamSelect);
    }

    public void onClickStartHalf(View view) {
        Intent startHalf = new Intent(this, GameHasStarted.class);
        startHalf.putExtra("team_one", teamOneName);
        startHalf.putExtra("team_two", teamTwoName);
        startActivity(startHalf);
    }
}
