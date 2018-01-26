package com.example.android.footballgamerecorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

/**
 * Created by grumnb on 1/26/2018.
 */

public class GameHasStarted extends AppCompatActivity {
    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.started_game);

        String teamOneName = getIntent().getStringExtra("team_one");
        String teamTwoName = getIntent().getStringExtra("team_two");

        TabHost host = (TabHost)findViewById(R.id.tabhost);
        host.setup();

        //Team One - Tab One
        TabHost.TabSpec spec = host.newTabSpec("Team One");
        spec.setContent(R.id.team_one);
        spec.setIndicator(teamOneName);
        host.addTab(spec);

        //Team Two - Tab Two
        spec = host.newTabSpec("Team One");
        spec.setContent(R.id.team_two);
        spec.setIndicator(teamTwoName);
        host.addTab(spec);





    }




}
