package com.example.android.footballgamerecorder;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by grumnb on 1/24/2018.
 */

public class StartGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);

        String teamOneName = getIntent().getStringExtra("team_one_name");
        TextView teamOneText = (TextView) findViewById(R.id.team_one_game_start_name_display);
        teamOneText.setText(teamOneName);



    }
}
