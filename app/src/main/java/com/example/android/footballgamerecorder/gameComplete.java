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
    TextView teamOneScore = findViewById(R.id.team_one_score);
    TextView teamTwoScore = findViewById(R.id.team_two_score);
    TextView teamOneName = findViewById(R.id.team_one_name);
    TextView teamTwoName = findViewById(R.id.team_two_name);
    String TeamOneName = getIntent().getStringExtra("Team_One_Name");
    String TeamTwoName = getIntent().getStringExtra("Team_Two_Name");
    String TeamOneScore = getIntent().getStringExtra("Team_One_Score");
    String TeamTwoScore = getIntent().getStringExtra("Team_Two_Score");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.completed_game_popup);

        teamOneScore.setText(TeamOneScore);
        teamTwoScore.setText(TeamTwoScore);
        teamOneName.setText(TeamOneName);
        teamTwoName.setText(TeamTwoName);
    }


    public void onClickGoToTeamSelection(View view) {
        Intent goToTeamSelect = new Intent(this, TeamSelection.class);
        startActivity(goToTeamSelect);
    }

    public void onClickReturnToHalf(View view) {
        Intent goToOvertime = new Intent(this,GameHasStarted.class);
        startActivity(goToOvertime);
    }
}
