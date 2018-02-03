package com.example.android.footballgamerecorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by grumnb on 2/2/2018.
 */

public class gameComplete extends AppCompatActivity {

    Button overtime;
    Button gameOver;

    String TeamOneName;
    String TeamTwoName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.completed_game_popup);

        TeamOneName = getIntent().getStringExtra("Team_One_Name");
        TeamTwoName = getIntent().getStringExtra("Team_Two_Name");
        int TeamOneScore = getIntent().getIntExtra("Team_One_Score", 0);
        int TeamTwoScore = getIntent().getIntExtra("Team_Two_Score", 0);

        TextView teamOneScore = findViewById(R.id.team_one_score);
        TextView teamTwoScore = findViewById(R.id.team_two_score);
        TextView teamOneName = findViewById(R.id.team_one_name);
        TextView teamTwoName = findViewById(R.id.team_two_name);

        teamOneScore.setText(String.valueOf(TeamOneScore));
        teamTwoScore.setText(String.valueOf(TeamTwoScore));
        teamOneName.setText(TeamOneName);
        teamTwoName.setText(TeamTwoName);
    }


    public void onClickGoToTeamSelection(View view) {
        Intent goToTeamSelect = new Intent(this, TeamSelection.class);
        startActivity(goToTeamSelect);
    }

    public void onClickReturnToHalf(View view) {
        Intent goToOvertime = new Intent(this,GameHasStarted.class);
        goToOvertime.putExtra("team_one", TeamOneName);
        goToOvertime.putExtra("team_two", TeamTwoName);
        startActivity(goToOvertime);
    }
}
