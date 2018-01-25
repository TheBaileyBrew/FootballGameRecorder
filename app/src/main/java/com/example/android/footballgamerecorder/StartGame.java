package com.example.android.footballgamerecorder;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by grumnb on 1/24/2018.
 */

public class StartGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);

        String teamOneName = getIntent().getStringExtra("team_one");
        TextView textView = (TextView) findViewById(R.id.team_one_game_start_name_display);

        textView.setText(teamOneName);




    }


}
