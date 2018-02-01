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

        teamTwoName = getIntent().getStringExtra("team_two");
        teamOneName = getIntent().getStringExtra("team_one");
        TextView textView = findViewById(R.id.team_one_game_start_name_display);
        TextView textView2 = findViewById(R.id.team_two_game_start_name_display);
        TextView scoreTeamOne = findViewById(R.id.team_one_score_display);
        TextView scoreTeamTwo = findViewById(R.id.team_two_score_display);
        textView.setText(teamOneName);
        textView2.setText(teamTwoName);
        TextView teamOneQB = findViewById(R.id.team_one_passing_player_name);
        TextView teamTwoQB = findViewById(R.id.team_two_passing_player_name);
        TextView teamOneRB = findViewById(R.id.team_one_rushing_player_name);
        TextView teamTwoRB = findViewById(R.id.team_two_rushing_player_name);
        TextView teamOneWR = findViewById(R.id.team_one_receiving_player_name);
        TextView teamTwoWR = findViewById(R.id.team_two_receiving_player_name);
        TextView teamOneWR2 = findViewById(R.id.team_one_receiving2_player_name);
        TextView teamTwoWR2 = findViewById(R.id.team_two_receiving2_player_name);
        TextView teamOneStats = findViewById(R.id.team_one_previous_record);
        TextView teamTwoStats = findViewById(R.id.team_two_previous_record);
        final ImageView im = findViewById(R.id.team_one_game_start_logo);
        final ImageView im2 = findViewById(R.id.team_two_game_start_logo);

        switch (teamOneName) {
            case "Arizona Cardinals":
                im.setImageResource(R.drawable.arizona_cardinals);
                teamOneQB.setText(getResources().getString(R.string.arizona_cardinals));
                teamOneWR.setText(getResources().getString(R.string.wide1_arizona_cardinals));
                teamOneWR2.setText(getResources().getString(R.string.wide2_arizona_cardinals));
                teamOneRB.setText(getResources().getString(R.string.rb_arizona_cardinals));
                teamOneStats.setText(getResources().getString(R.string.arizona_stats));
                textView.setTextColor(getResources().getColor(R.color.cardsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.cardsSecondary));
                break;
            case "Atlanta Falcons":
                im.setImageResource(R.drawable.atlanta_falcons);
                teamOneQB.setText(getResources().getString(R.string.atlanta_falcons));
                teamOneWR.setText(getResources().getString(R.string.wide1_atlanta_falcons));
                teamOneWR2.setText(getResources().getString(R.string.wide2_atlanta_falcons));
                teamOneRB.setText(getResources().getString(R.string.rb_atlanta_falcons));
                teamOneStats.setText(getResources().getString(R.string.atlanta_stats));
                textView.setTextColor(getResources().getColor(R.color.falconsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.falconsSecondary));
                break;
            case "Baltimore Ravens":
                im.setImageResource(R.drawable.baltimore_ravens);
                teamOneQB.setText(getResources().getString(R.string.baltimore_ravens));
                teamOneWR.setText(getResources().getString(R.string.wide1_baltimore_ravens));
                teamOneWR2.setText(getResources().getString(R.string.wide2_baltimore_ravens));
                teamOneRB.setText(getResources().getString(R.string.rb_baltimore_ravens));
                teamOneStats.setText(getResources().getString(R.string.baltimore_stats));
                textView.setTextColor(getResources().getColor(R.color.ravensPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.ravensSecondary));
                break;
            case "Buffalo Bills":
                im.setImageResource(R.drawable.buffalo_bills);
                teamOneQB.setText(getResources().getString(R.string.buffalo_bills));
                teamOneWR.setText(getResources().getString(R.string.wide1_buffalo_bills));
                teamOneWR2.setText(getResources().getString(R.string.wide2_buffalo_bills));
                teamOneRB.setText(getResources().getString(R.string.rb_buffalo_bills));
                teamOneStats.setText(getResources().getString(R.string.buffalo_stats));
                textView.setTextColor(getResources().getColor(R.color.billsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.billsSecondary));
                break;
            case "Carolina Panthers":
                im.setImageResource(R.drawable.carolina_panthers);
                teamOneQB.setText(getResources().getString(R.string.carolina_panthers));
                teamOneWR.setText(getResources().getString(R.string.wide1_carolina_panthers));
                teamOneWR2.setText(getResources().getString(R.string.wide2_carolina_panthers));
                teamOneRB.setText(getResources().getString(R.string.rb_carolina_panthers));
                teamOneStats.setText(getResources().getString(R.string.carolina_stats));
                textView.setTextColor(getResources().getColor(R.color.panthersPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.panthersSecondary));
                break;
            case "Chicago Bears":
                im.setImageResource(R.drawable.chicago_bears);
                teamOneQB.setText(getResources().getString(R.string.chicago_bears));
                teamOneWR.setText(getResources().getString(R.string.wide1_chicago_bears));
                teamOneWR2.setText(getResources().getString(R.string.wide2_chicago_bears));
                teamOneRB.setText(getResources().getString(R.string.rb_chicago_bears));
                teamOneStats.setText(getResources().getString(R.string.chicago_stats));
                textView.setTextColor(getResources().getColor(R.color.bearsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.bearsSecondary));
                break;
            case "Cincinnati Bengals":
                im.setImageResource(R.drawable.cincinnati_bengals);
                teamOneQB.setText(getResources().getString(R.string.cincinnati_bengals));
                teamOneWR.setText(getResources().getString(R.string.wide1_cincinnati_bengals));
                teamOneWR2.setText(getResources().getString(R.string.wide2_cincinnati_bengals));
                teamOneRB.setText(getResources().getString(R.string.rb_cincinnati_bengals));
                teamOneStats.setText(getResources().getString(R.string.cincinnati_stats));
                textView.setTextColor(getResources().getColor(R.color.bengalsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.bengalsSecondary));
                break;
            case "Cleveland Browns":
                im.setImageResource(R.drawable.cleveland_browns);
                teamOneQB.setText(getResources().getString(R.string.cleveland_browns));
                teamOneWR.setText(getResources().getString(R.string.wide1_cleveland_browns));
                teamOneWR2.setText(getResources().getString(R.string.wide2_cleveland_browns));
                teamOneRB.setText(getResources().getString(R.string.rb_cleveland_browns));
                teamOneStats.setText(getResources().getString(R.string.cleveland_stats));
                textView.setTextColor(getResources().getColor(R.color.brownsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.brownsSecondary));
                break;
            case "Dallas Cowboys":
                im.setImageResource(R.drawable.dallas_cowboys);
                teamOneQB.setText(getResources().getString(R.string.dallas_cowboys));
                teamOneWR.setText(getResources().getString(R.string.wide1_dallas_cowboys));
                teamOneWR2.setText(getResources().getString(R.string.wide2_dallas_cowboys));
                teamOneRB.setText(getResources().getString(R.string.rb_dallas_cowboys));
                teamOneStats.setText(getResources().getString(R.string.dallas_stats));
                textView.setTextColor(getResources().getColor(R.color.cowboysPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.cowboysSecondary));
                break;
            case "Denver Broncos":
                im.setImageResource(R.drawable.denver_broncos);
                teamOneQB.setText(getResources().getString(R.string.denver_broncos));
                teamOneWR.setText(getResources().getString(R.string.wide1_denver_broncos));
                teamOneWR2.setText(getResources().getString(R.string.wide2_denver_broncos));
                teamOneRB.setText(getResources().getString(R.string.rb_denver_broncos));
                teamOneStats.setText(getResources().getString(R.string.denver_stats));
                textView.setTextColor(getResources().getColor(R.color.broncosPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.broncosSecondary));
                break;
            case "Detroit Lions":
                im.setImageResource(R.drawable.detroit_lions);
                teamOneQB.setText(getResources().getString(R.string.detroit_lions));
                teamOneWR.setText(getResources().getString(R.string.wide1_detroit_lions));
                teamOneWR2.setText(getResources().getString(R.string.wide2_detroit_lions));
                teamOneRB.setText(getResources().getString(R.string.rb_detroit_lions));
                teamOneStats.setText(getResources().getString(R.string.detroit_stats));
                textView.setTextColor(getResources().getColor(R.color.lionsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.lionsSecondary));
                break;
            case "Green Bay Packers":
                im.setImageResource(R.drawable.green_bay_packers);
                teamOneQB.setText(getResources().getString(R.string.green_bay_packers));
                teamOneWR.setText(getResources().getString(R.string.wide1_green_bay_packers));
                teamOneWR2.setText(getResources().getString(R.string.wide2_green_bay_packers));
                teamOneRB.setText(getResources().getString(R.string.rb_green_bay_packers));
                teamOneStats.setText(getResources().getString(R.string.green_bay_stats));
                textView.setTextColor(getResources().getColor(R.color.packersPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.packersSecondary));
                break;
            case "Houston Texans":
                im.setImageResource(R.drawable.houston_texans);
                teamOneQB.setText(getResources().getString(R.string.houston_texans));
                teamOneWR.setText(getResources().getString(R.string.wide1_houston_texans));
                teamOneWR2.setText(getResources().getString(R.string.wide2_houston_texans));
                teamOneRB.setText(getResources().getString(R.string.rb_houston_texans));
                teamOneStats.setText(getResources().getString(R.string.houston_stats));
                textView.setTextColor(getResources().getColor(R.color.texansPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.texansSecondary));
                break;
            case "Indianapolis Colts":
                im.setImageResource(R.drawable.indianapolis_colts);
                teamOneQB.setText(getResources().getString(R.string.indianapolis_colts));
                teamOneWR.setText(getResources().getString(R.string.wide1_indianapolis_colts));
                teamOneWR2.setText(getResources().getString(R.string.wide2_indianapolis_colts));
                teamOneRB.setText(getResources().getString(R.string.rb_indianapolis_colts));
                teamOneStats.setText(getResources().getString(R.string.indianapolis_stats));
                textView.setTextColor(getResources().getColor(R.color.coltsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.coltsSecondary));
                break;
            case "Jacksonville Jaguars":
                im.setImageResource(R.drawable.jacksonville_jaguars);
                teamOneQB.setText(getResources().getString(R.string.jacksonville_jaguars));
                teamOneWR.setText(getResources().getString(R.string.wide1_jacksonville_jaguars));
                teamOneWR2.setText(getResources().getString(R.string.wide2_jacksonville_jaguars));
                teamOneRB.setText(getResources().getString(R.string.rb_jacksonville_jaguars));
                teamOneStats.setText(getResources().getString(R.string.jacksonville_stats));
                textView.setTextColor(getResources().getColor(R.color.jagsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.jagsSecondary));
                break;
            case "Kansas City Chiefs":
                im.setImageResource(R.drawable.kansas_city_chiefs);
                teamOneQB.setText(getResources().getString(R.string.kansas_city_chiefs));
                teamOneWR.setText(getResources().getString(R.string.wide1_kansas_city_chiefs));
                teamOneWR2.setText(getResources().getString(R.string.wide2_kansas_city_chiefs));
                teamOneRB.setText(getResources().getString(R.string.rb_kansas_city_chiefs));
                teamOneStats.setText(getResources().getString(R.string.kansas_city_stats));
                textView.setTextColor(getResources().getColor(R.color.chiefsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.chiefsSecondary));
                break;
            case "Los Angeles Chargers":
                im.setImageResource(R.drawable.los_angeles_chargers);
                teamOneQB.setText(getResources().getString(R.string.los_angeles_chargers));
                teamOneWR.setText(getResources().getString(R.string.wide1_los_angeles_chargers));
                teamOneWR2.setText(getResources().getString(R.string.wide2_los_angeles_chargers));
                teamOneRB.setText(getResources().getString(R.string.rb_los_angeles_chargers));
                teamOneStats.setText(getResources().getString(R.string.los_angeles_chargers_stats));
                textView.setTextColor(getResources().getColor(R.color.chargersPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.chargersSecondary));
                break;
            case "Los Angeles Rams":
                im.setImageResource(R.drawable.los_angeles_rams);
                teamOneQB.setText(getResources().getString(R.string.los_angeles_rams));
                teamOneWR.setText(getResources().getString(R.string.wide1_los_angeles_rams));
                teamOneWR2.setText(getResources().getString(R.string.wide2_los_angeles_rams));
                teamOneRB.setText(getResources().getString(R.string.rb_los_angeles_rams));
                teamOneStats.setText(getResources().getString(R.string.los_angeles_rams_stats));
                textView.setTextColor(getResources().getColor(R.color.ramsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.ramsSecondary));
                break;
            case "Miami Dolphins":
                im.setImageResource(R.drawable.miami_dolphins);
                teamOneQB.setText(getResources().getString(R.string.miami_dolphins));
                teamOneWR.setText(getResources().getString(R.string.wide1_miami_dolphins));
                teamOneWR2.setText(getResources().getString(R.string.wide2_miami_dolphins));
                teamOneRB.setText(getResources().getString(R.string.rb_miami_dolphins));
                teamOneStats.setText(getResources().getString(R.string.miami_stats));
                textView.setTextColor(getResources().getColor(R.color.dolphinsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.dolphinsSecondary));
                break;
            case "Minnesota Vikings":
                im.setImageResource(R.drawable.minnesota_vikings);
                teamOneQB.setText(getResources().getString(R.string.minnesota_vikings));
                teamOneWR.setText(getResources().getString(R.string.wide1_minnesota_vikings));
                teamOneWR2.setText(getResources().getString(R.string.wide2_minnesota_vikings));
                teamOneRB.setText(getResources().getString(R.string.rb_minnesota_vikings));
                teamOneStats.setText(getResources().getString(R.string.minnesota_stats));
                textView.setTextColor(getResources().getColor(R.color.vikingsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.vikingsSecondary));
                break;
            case "New England Patriots":
                im.setImageResource(R.drawable.new_england_patriots);
                teamOneQB.setText(getResources().getString(R.string.new_england_patriots));
                teamOneWR.setText(getResources().getString(R.string.wide1_new_england_patriots));
                teamOneWR2.setText(getResources().getString(R.string.wide2_new_england_patriots));
                teamOneRB.setText(getResources().getString(R.string.rb_new_england_patriots));
                teamOneStats.setText(getResources().getString(R.string.new_england_stats));
                textView.setTextColor(getResources().getColor(R.color.patsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.patsSecondary));
                break;
            case "New Orleans Saints":
                im.setImageResource(R.drawable.new_orleans_saints);
                teamOneQB.setText(getResources().getString(R.string.new_orleans_saints));
                teamOneWR.setText(getResources().getString(R.string.wide1_new_orleans_saints));
                teamOneWR2.setText(getResources().getString(R.string.wide2_new_orleans_saints));
                teamOneRB.setText(getResources().getString(R.string.rb_new_orleans_saints));
                teamOneStats.setText(getResources().getString(R.string.new_orleans_stats));
                textView.setTextColor(getResources().getColor(R.color.saintsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.saintsSecondary));
                break;
            case "New York Giants":
                im.setImageResource(R.drawable.new_york_giants);
                teamOneQB.setText(getResources().getString(R.string.new_york_giants));
                teamOneWR.setText(getResources().getString(R.string.wide1_new_york_giants));
                teamOneWR2.setText(getResources().getString(R.string.wide2_new_york_giants));
                teamOneRB.setText(getResources().getString(R.string.rb_new_york_giants));
                teamOneStats.setText(getResources().getString(R.string.new_york_giants_stats));
                textView.setTextColor(getResources().getColor(R.color.giantsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.giantsSecondary));
                break;
            case "New York Jets":
                im.setImageResource(R.drawable.new_york_jets);
                teamOneQB.setText(getResources().getString(R.string.new_york_jets));
                teamOneWR.setText(getResources().getString(R.string.wide1_new_york_jets));
                teamOneWR2.setText(getResources().getString(R.string.wide2_new_york_jets));
                teamOneRB.setText(getResources().getString(R.string.rb_new_york_jets));
                teamOneStats.setText(getResources().getString(R.string.new_york_jets_stats));
                textView.setTextColor(getResources().getColor(R.color.jetsPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.jetsSecondary));
                break;
            case "Oakland Raiders":
                im.setImageResource(R.drawable.oakland_raiders);
                teamOneQB.setText(getResources().getString(R.string.oakland_raiders));
                teamOneWR.setText(getResources().getString(R.string.wide1_oakland_raiders));
                teamOneWR2.setText(getResources().getString(R.string.wide2_oakland_raiders));
                teamOneRB.setText(getResources().getString(R.string.rb_oakland_raiders));
                teamOneStats.setText(getResources().getString(R.string.oakland_stats));
                textView.setTextColor(getResources().getColor(R.color.raidersPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.raidersSecondary));
                break;
            case "Philadelphia Eagles":
                im.setImageResource(R.drawable.philadelphia_eagles);
                teamOneQB.setText(getResources().getString(R.string.philadelphia_eagles));
                teamOneWR.setText(getResources().getString(R.string.wide1_philadelphia_eagles));
                teamOneWR2.setText(getResources().getString(R.string.wide2_philadelphia_eagles));
                teamOneRB.setText(getResources().getString(R.string.rb_philadelphia_eagles));
                teamOneStats.setText(getResources().getString(R.string.philadelphia_stats));
                textView.setTextColor(getResources().getColor(R.color.eaglesPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.eaglesSecondary));
                break;
            case "Pittsburgh Steelers":
                im.setImageResource(R.drawable.pittsburgh_steelers);
                teamOneQB.setText(getResources().getString(R.string.pittsburgh_steelers));
                teamOneWR.setText(getResources().getString(R.string.wide1_pittsburgh_steelers));
                teamOneWR2.setText(getResources().getString(R.string.wide2_pittsburgh_steelers));
                teamOneRB.setText(getResources().getString(R.string.rb_pittsburgh_steelers));
                teamOneStats.setText(getResources().getString(R.string.pittsburgh_stats));
                textView.setTextColor(getResources().getColor(R.color.steelersPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.steelersSecondary));
                break;
            case "San Francisco 49ers":
                im.setImageResource(R.drawable.san_francisco_49ers);
                teamOneQB.setText(getResources().getString(R.string.san_francisco_49ers));
                teamOneWR.setText(getResources().getString(R.string.wide1_san_francisco_49ers));
                teamOneWR2.setText(getResources().getString(R.string.wide2_san_francisco_49ers));
                teamOneRB.setText(getResources().getString(R.string.rb_san_francisco_49ers));
                teamOneStats.setText(getResources().getString(R.string.san_francisco_stats));
                textView.setTextColor(getResources().getColor(R.color.sanfranPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.sanfranSecondary));
                break;
            case "Seattle Seahawks":
                im.setImageResource(R.drawable.seattle_seahawks);
                teamOneQB.setText(getResources().getString(R.string.seattle_seahawks));
                teamOneWR.setText(getResources().getString(R.string.wide1_seattle_seahawks));
                teamOneWR2.setText(getResources().getString(R.string.wide2_seattle_seahawks));
                teamOneRB.setText(getResources().getString(R.string.rb_seattle_seahawks));
                teamOneStats.setText(getResources().getString(R.string.seattle_stats));
                textView.setTextColor(getResources().getColor(R.color.seahawksPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.seahawksSecondary));
                break;
            case "Tampa Bay Buccaneers":
                im.setImageResource(R.drawable.tampa_bay_buccaneers);
                teamOneQB.setText(getResources().getString(R.string.tampa_bay_bucanneers));
                teamOneWR.setText(getResources().getString(R.string.wide1_tampa_bay_bucanneers));
                teamOneWR2.setText(getResources().getString(R.string.wide2_tampa_bay_bucanneers));
                teamOneRB.setText(getResources().getString(R.string.rb_tampa_bay_bucanneers));
                teamOneStats.setText(getResources().getString(R.string.tampa_bay_stats));
                textView.setTextColor(getResources().getColor(R.color.bucanPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.bucanSecondary));
                break;
            case "Tennessee Titans":
                im.setImageResource(R.drawable.tennessee_titans);
                teamOneQB.setText(getResources().getString(R.string.tennessee_titans));
                teamOneWR.setText(getResources().getString(R.string.wide1_tennessee_titans));
                teamOneWR2.setText(getResources().getString(R.string.wide2_tennessee_titans));
                teamOneRB.setText(getResources().getString(R.string.rb_tennessee_titans));
                teamOneStats.setText(getResources().getString(R.string.tennessee_stats));
                textView.setTextColor(getResources().getColor(R.color.titansPrimary));
                scoreTeamOne.setTextColor(getResources().getColor(R.color.titansSecondary));
                break;
            case "Washington Redskins":
                im.setImageResource(R.drawable.washington_redskins);
                teamOneQB.setText(getResources().getString(R.string.washington_redskins));
                teamOneWR.setText(getResources().getString(R.string.wide1_washington_redskins));
                teamOneWR2.setText(getResources().getString(R.string.wide2_washington_redskins));
                teamOneRB.setText(getResources().getString(R.string.rb_washington_redskins));
                teamOneStats.setText(getResources().getString(R.string.washington_stats));
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
                teamTwoWR.setText(getResources().getString(R.string.wide1_arizona_cardinals));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_arizona_cardinals));
                teamTwoRB.setText(getResources().getString(R.string.rb_arizona_cardinals));
                teamTwoStats.setText(getResources().getString(R.string.arizona_stats));
                textView2.setTextColor(getResources().getColor(R.color.cardsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.cardsSecondary));
                break;
            case "Atlanta Falcons":
                im2.setImageResource(R.drawable.atlanta_falcons);
                teamTwoQB.setText(getResources().getString(R.string.atlanta_falcons));
                teamTwoWR.setText(getResources().getString(R.string.wide1_atlanta_falcons));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_atlanta_falcons));
                teamTwoRB.setText(getResources().getString(R.string.rb_atlanta_falcons));
                teamTwoStats.setText(getResources().getString(R.string.atlanta_stats));
                textView2.setTextColor(getResources().getColor(R.color.falconsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.falconsSecondary));
                break;
            case "Baltimore Ravens":
                im2.setImageResource(R.drawable.baltimore_ravens);
                teamTwoQB.setText(getResources().getString(R.string.baltimore_ravens));
                teamTwoWR.setText(getResources().getString(R.string.wide1_baltimore_ravens));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_baltimore_ravens));
                teamTwoRB.setText(getResources().getString(R.string.rb_baltimore_ravens));
                teamTwoStats.setText(getResources().getString(R.string.baltimore_stats));
                textView2.setTextColor(getResources().getColor(R.color.ravensPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.ravensSecondary));
                break;
            case "Buffalo Bills":
                im2.setImageResource(R.drawable.buffalo_bills);
                teamTwoQB.setText(getResources().getString(R.string.buffalo_bills));
                teamTwoWR.setText(getResources().getString(R.string.wide1_buffalo_bills));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_buffalo_bills));
                teamTwoRB.setText(getResources().getString(R.string.rb_buffalo_bills));
                teamTwoStats.setText(getResources().getString(R.string.buffalo_stats));
                textView2.setTextColor(getResources().getColor(R.color.billsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.billsSecondary));
                break;
            case "Carolina Panthers":
                im2.setImageResource(R.drawable.carolina_panthers);
                teamTwoQB.setText(getResources().getString(R.string.carolina_panthers));
                teamTwoWR.setText(getResources().getString(R.string.wide1_carolina_panthers));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_carolina_panthers));
                teamTwoRB.setText(getResources().getString(R.string.rb_carolina_panthers));
                teamTwoStats.setText(getResources().getString(R.string.carolina_stats));
                textView2.setTextColor(getResources().getColor(R.color.panthersPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.panthersSecondary));
                break;
            case "Chicago Bears":
                im2.setImageResource(R.drawable.chicago_bears);
                teamTwoQB.setText(getResources().getString(R.string.chicago_bears));
                teamTwoWR.setText(getResources().getString(R.string.wide1_chicago_bears));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_chicago_bears));
                teamTwoRB.setText(getResources().getString(R.string.rb_chicago_bears));
                teamTwoStats.setText(getResources().getString(R.string.washington_stats));
                textView2.setTextColor(getResources().getColor(R.color.bearsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.bearsSecondary));
                break;
            case "Cincinnati Bengals":
                im2.setImageResource(R.drawable.cincinnati_bengals);
                teamTwoQB.setText(getResources().getString(R.string.cincinnati_bengals));
                teamTwoWR.setText(getResources().getString(R.string.wide1_cincinnati_bengals));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_cincinnati_bengals));
                teamTwoRB.setText(getResources().getString(R.string.rb_cincinnati_bengals));
                teamTwoStats.setText(getResources().getString(R.string.cincinnati_stats));
                textView2.setTextColor(getResources().getColor(R.color.bengalsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.bengalsSecondary));
                break;
            case "Cleveland Browns":
                im2.setImageResource(R.drawable.cleveland_browns);
                teamTwoQB.setText(getResources().getString(R.string.cleveland_browns));
                teamTwoWR.setText(getResources().getString(R.string.wide1_cleveland_browns));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_cleveland_browns));
                teamTwoRB.setText(getResources().getString(R.string.rb_cleveland_browns));
                teamTwoStats.setText(getResources().getString(R.string.cleveland_stats));
                textView2.setTextColor(getResources().getColor(R.color.brownsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.brownsSecondary));
                break;
            case "Dallas Cowboys":
                im2.setImageResource(R.drawable.dallas_cowboys);
                teamTwoQB.setText(getResources().getString(R.string.dallas_cowboys));
                teamTwoWR.setText(getResources().getString(R.string.wide1_dallas_cowboys));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_dallas_cowboys));
                teamTwoRB.setText(getResources().getString(R.string.rb_dallas_cowboys));
                teamTwoStats.setText(getResources().getString(R.string.dallas_stats));
                textView2.setTextColor(getResources().getColor(R.color.cowboysPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.cowboysSecondary));
                break;
            case "Denver Broncos":
                im2.setImageResource(R.drawable.denver_broncos);
                teamTwoQB.setText(getResources().getString(R.string.denver_broncos));
                teamTwoWR.setText(getResources().getString(R.string.wide1_denver_broncos));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_denver_broncos));
                teamTwoRB.setText(getResources().getString(R.string.rb_denver_broncos));
                teamTwoStats.setText(getResources().getString(R.string.denver_stats));
                textView2.setTextColor(getResources().getColor(R.color.broncosPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.broncosSecondary));
                break;
            case "Detroit Lions":
                im2.setImageResource(R.drawable.detroit_lions);
                teamTwoQB.setText(getResources().getString(R.string.detroit_lions));
                teamTwoWR.setText(getResources().getString(R.string.wide1_detroit_lions));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_detroit_lions));
                teamTwoRB.setText(getResources().getString(R.string.rb_detroit_lions));
                teamTwoStats.setText(getResources().getString(R.string.detroit_stats));
                textView2.setTextColor(getResources().getColor(R.color.lionsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.lionsSecondary));
                break;
            case "Green Bay Packers":
                im2.setImageResource(R.drawable.green_bay_packers);
                teamTwoQB.setText(getResources().getString(R.string.green_bay_packers));
                teamTwoWR.setText(getResources().getString(R.string.wide1_green_bay_packers));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_green_bay_packers));
                teamTwoRB.setText(getResources().getString(R.string.rb_green_bay_packers));
                teamTwoStats.setText(getResources().getString(R.string.green_bay_stats));
                textView2.setTextColor(getResources().getColor(R.color.packersPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.packersSecondary));
                break;
            case "Houston Texans":
                im2.setImageResource(R.drawable.houston_texans);
                teamTwoQB.setText(getResources().getString(R.string.houston_texans));
                teamTwoWR.setText(getResources().getString(R.string.wide1_houston_texans));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_houston_texans));
                teamTwoRB.setText(getResources().getString(R.string.rb_houston_texans));
                teamTwoStats.setText(getResources().getString(R.string.houston_stats));
                textView2.setTextColor(getResources().getColor(R.color.texansPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.texansSecondary));
                break;
            case "Indianapolis Colts":
                im2.setImageResource(R.drawable.indianapolis_colts);
                teamTwoQB.setText(getResources().getString(R.string.indianapolis_colts));
                teamTwoWR.setText(getResources().getString(R.string.wide1_indianapolis_colts));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_indianapolis_colts));
                teamTwoRB.setText(getResources().getString(R.string.rb_indianapolis_colts));
                teamTwoStats.setText(getResources().getString(R.string.indianapolis_stats));
                textView2.setTextColor(getResources().getColor(R.color.coltsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.coltsSecondary));
                break;
            case "Jacksonville Jaguars":
                im2.setImageResource(R.drawable.jacksonville_jaguars);
                teamTwoQB.setText(getResources().getString(R.string.jacksonville_jaguars));
                teamTwoWR.setText(getResources().getString(R.string.wide1_jacksonville_jaguars));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_jacksonville_jaguars));
                teamTwoRB.setText(getResources().getString(R.string.rb_jacksonville_jaguars));
                teamTwoStats.setText(getResources().getString(R.string.jacksonville_stats));
                textView2.setTextColor(getResources().getColor(R.color.jagsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.jagsSecondary));
                break;
            case "Kansas City Chiefs":
                im2.setImageResource(R.drawable.kansas_city_chiefs);
                teamTwoQB.setText(getResources().getString(R.string.kansas_city_chiefs));
                teamTwoWR.setText(getResources().getString(R.string.wide1_kansas_city_chiefs));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_kansas_city_chiefs));
                teamTwoRB.setText(getResources().getString(R.string.rb_kansas_city_chiefs));
                teamTwoStats.setText(getResources().getString(R.string.kansas_city_stats));
                textView2.setTextColor(getResources().getColor(R.color.chiefsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.chiefsSecondary));
                break;
            case "Los Angeles Chargers":
                im2.setImageResource(R.drawable.los_angeles_chargers);
                teamTwoQB.setText(getResources().getString(R.string.los_angeles_chargers));
                teamTwoWR.setText(getResources().getString(R.string.wide1_los_angeles_chargers));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_los_angeles_chargers));
                teamTwoRB.setText(getResources().getString(R.string.rb_los_angeles_chargers));
                teamTwoStats.setText(getResources().getString(R.string.los_angeles_chargers_stats));
                textView2.setTextColor(getResources().getColor(R.color.chargersPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.chargersSecondary));
                break;
            case "Los Angeles Rams":
                im2.setImageResource(R.drawable.los_angeles_rams);
                teamTwoQB.setText(getResources().getString(R.string.los_angeles_rams));
                teamTwoWR.setText(getResources().getString(R.string.wide1_los_angeles_rams));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_los_angeles_rams));
                teamTwoRB.setText(getResources().getString(R.string.rb_los_angeles_rams));
                teamTwoStats.setText(getResources().getString(R.string.rb_los_angeles_rams));
                textView2.setTextColor(getResources().getColor(R.color.ramsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.ramsSecondary));
                break;
            case "Miami Dolphins":
                im2.setImageResource(R.drawable.miami_dolphins);
                teamTwoQB.setText(getResources().getString(R.string.miami_dolphins));
                teamTwoWR.setText(getResources().getString(R.string.wide1_miami_dolphins));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_miami_dolphins));
                teamTwoRB.setText(getResources().getString(R.string.rb_miami_dolphins));
                teamTwoStats.setText(getResources().getString(R.string.miami_stats));
                textView2.setTextColor(getResources().getColor(R.color.dolphinsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.dolphinsSecondary));
                break;
            case "Minnesota Vikings":
                im2.setImageResource(R.drawable.minnesota_vikings);
                teamTwoQB.setText(getResources().getString(R.string.minnesota_vikings));
                teamTwoWR.setText(getResources().getString(R.string.wide1_minnesota_vikings));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_minnesota_vikings));
                teamTwoRB.setText(getResources().getString(R.string.rb_minnesota_vikings));
                teamTwoStats.setText(getResources().getString(R.string.minnesota_stats));
                textView2.setTextColor(getResources().getColor(R.color.vikingsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.vikingsSecondary));
                break;
            case "New England Patriots":
                im2.setImageResource(R.drawable.new_england_patriots);
                teamTwoQB.setText(getResources().getString(R.string.new_england_patriots));
                teamTwoWR.setText(getResources().getString(R.string.wide1_new_england_patriots));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_new_england_patriots));
                teamTwoRB.setText(getResources().getString(R.string.rb_new_england_patriots));
                teamTwoStats.setText(getResources().getString(R.string.new_england_stats));
                textView2.setTextColor(getResources().getColor(R.color.patsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.patsSecondary));
                break;
            case "New Orleans Saints":
                im2.setImageResource(R.drawable.new_orleans_saints);
                teamTwoQB.setText(getResources().getString(R.string.new_orleans_saints));
                teamTwoWR.setText(getResources().getString(R.string.wide1_new_orleans_saints));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_new_orleans_saints));
                teamTwoRB.setText(getResources().getString(R.string.rb_new_orleans_saints));
                teamTwoStats.setText(getResources().getString(R.string.new_orleans_stats));
                textView2.setTextColor(getResources().getColor(R.color.saintsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.saintsSecondary));
                break;
            case "New York Giants":
                im2.setImageResource(R.drawable.new_york_giants);
                teamTwoQB.setText(getResources().getString(R.string.new_york_giants));
                teamTwoWR.setText(getResources().getString(R.string.wide1_new_york_giants));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_new_york_giants));
                teamTwoRB.setText(getResources().getString(R.string.rb_new_york_giants));
                teamTwoStats.setText(getResources().getString(R.string.new_york_giants_stats));
                textView2.setTextColor(getResources().getColor(R.color.giantsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.giantsSecondary));
                break;
            case "New York Jets":
                im2.setImageResource(R.drawable.new_york_jets);
                teamTwoQB.setText(getResources().getString(R.string.new_york_jets));
                teamTwoWR.setText(getResources().getString(R.string.wide1_new_york_jets));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_new_york_jets));
                teamTwoRB.setText(getResources().getString(R.string.rb_new_york_jets));
                teamTwoStats.setText(getResources().getString(R.string.new_york_jets_stats));
                textView2.setTextColor(getResources().getColor(R.color.jetsPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.jetsSecondary));
                break;
            case "Oakland Raiders":
                im2.setImageResource(R.drawable.oakland_raiders);
                teamTwoQB.setText(getResources().getString(R.string.oakland_raiders));
                teamTwoWR.setText(getResources().getString(R.string.wide1_oakland_raiders));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_oakland_raiders));
                teamTwoRB.setText(getResources().getString(R.string.rb_oakland_raiders));
                teamTwoStats.setText(getResources().getString(R.string.oakland_stats));
                textView2.setTextColor(getResources().getColor(R.color.raidersPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.raidersSecondary));
                break;
            case "Philadelphia Eagles":
                im2.setImageResource(R.drawable.philadelphia_eagles);
                teamTwoQB.setText(getResources().getString(R.string.philadelphia_eagles));
                teamTwoWR.setText(getResources().getString(R.string.wide1_philadelphia_eagles));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_philadelphia_eagles));
                teamTwoRB.setText(getResources().getString(R.string.rb_philadelphia_eagles));
                teamTwoStats.setText(getResources().getString(R.string.rb_philadelphia_eagles));
                textView2.setTextColor(getResources().getColor(R.color.eaglesPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.eaglesSecondary));
                break;
            case "Pittsburgh Steelers":
                im2.setImageResource(R.drawable.pittsburgh_steelers);
                teamTwoQB.setText(getResources().getString(R.string.pittsburgh_steelers));
                teamTwoWR.setText(getResources().getString(R.string.wide1_pittsburgh_steelers));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_pittsburgh_steelers));
                teamTwoRB.setText(getResources().getString(R.string.rb_pittsburgh_steelers));
                teamTwoStats.setText(getResources().getString(R.string.pittsburgh_stats));
                textView2.setTextColor(getResources().getColor(R.color.steelersPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.steelersSecondary));
                break;
            case "San Francisco 49ers":
                im2.setImageResource(R.drawable.san_francisco_49ers);
                teamTwoQB.setText(getResources().getString(R.string.san_francisco_49ers));
                teamTwoWR.setText(getResources().getString(R.string.wide1_san_francisco_49ers));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_san_francisco_49ers));
                teamTwoRB.setText(getResources().getString(R.string.rb_san_francisco_49ers));
                teamTwoStats.setText(getResources().getString(R.string.san_francisco_stats));
                textView2.setTextColor(getResources().getColor(R.color.sanfranPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.sanfranSecondary));
                break;
            case "Seattle Seahawks":
                im2.setImageResource(R.drawable.seattle_seahawks);
                teamTwoQB.setText(getResources().getString(R.string.seattle_seahawks));
                teamTwoWR.setText(getResources().getString(R.string.wide1_seattle_seahawks));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_seattle_seahawks));
                teamTwoRB.setText(getResources().getString(R.string.rb_seattle_seahawks));
                teamTwoStats.setText(getResources().getString(R.string.seattle_stats));
                textView2.setTextColor(getResources().getColor(R.color.seahawksPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.seahawksSecondary));
                break;
            case "Tampa Bay Buccaneers":
                im2.setImageResource(R.drawable.tampa_bay_buccaneers);
                teamTwoQB.setText(getResources().getString(R.string.tampa_bay_bucanneers));
                teamTwoWR.setText(getResources().getString(R.string.wide1_tampa_bay_bucanneers));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_tampa_bay_bucanneers));
                teamTwoRB.setText(getResources().getString(R.string.rb_tampa_bay_bucanneers));
                teamTwoStats.setText(getResources().getString(R.string.tampa_bay_stats));
                textView2.setTextColor(getResources().getColor(R.color.bucanPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.bucanSecondary));
                break;
            case "Tennessee Titans":
                im2.setImageResource(R.drawable.tennessee_titans);
                teamTwoQB.setText(getResources().getString(R.string.tennessee_titans));
                teamTwoWR.setText(getResources().getString(R.string.wide1_tennessee_titans));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_tennessee_titans));
                teamTwoRB.setText(getResources().getString(R.string.rb_tennessee_titans));
                teamTwoStats.setText(getResources().getString(R.string.tennessee_stats));
                textView2.setTextColor(getResources().getColor(R.color.titansPrimary));
                scoreTeamTwo.setTextColor(getResources().getColor(R.color.titansSecondary));
                break;
            case "Washington Redskins":
                im2.setImageResource(R.drawable.washington_redskins);
                teamTwoQB.setText(getResources().getString(R.string.washington_redskins));
                teamTwoWR.setText(getResources().getString(R.string.wide1_washington_redskins));
                teamTwoWR2.setText(getResources().getString(R.string.wide2_washington_redskins));
                teamTwoRB.setText(getResources().getString(R.string.rb_washington_redskins));
                teamTwoStats.setText(getResources().getString(R.string.washington_stats));
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

    public void onClickStartFirstHalf(View view) {
        Intent startHalf = new Intent(this, GameHasStarted.class);
        startHalf.putExtra("team_one", teamOneName);
        startHalf.putExtra("team_two", teamTwoName);
        startActivity(startHalf);
    }

    public void onClickStartSecondHalf(View view) {
        Intent startHalf = new Intent (this, GameHasStarted.class);
        startHalf.putExtra("team_one", teamOneName);
        startHalf.putExtra("team_two", teamTwoName);
        startActivity(startHalf);
    }
}
