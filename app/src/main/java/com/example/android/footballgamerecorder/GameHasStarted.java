package com.example.android.footballgamerecorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by grumnb on 1/26/2018.
 */

public class GameHasStarted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.started_game);

        String teamOneName = getIntent().getStringExtra("team_one");
        String teamTwoName = getIntent().getStringExtra("team_two");

        TextView textView = (TextView) findViewById(R.id.team_one_name);
        textView.setText(teamOneName);
        textView.setText(teamTwoName);


    }


}
