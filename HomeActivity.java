package com.lborocoursework.outrun;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {

//variables assigned
    private TextView mUsername;
    private TextView TotalMiles;
    private TextView TimesCaught;
    private TextView TimesEvaded;
    private TextView AveragePace;
    private TextView AverageRunTime;
    private Button SettingsButton;
    private Button HistoryButton;
    private Button StartRunButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);


        //Set layout variables
        ImageView mProfileImage = (ImageView) findViewById(R.id.home_profileImageView);

        mUsername = (TextView) findViewById(R.id.home_usernameText);
        TotalMiles = (TextView) findViewById(R.id.home_totalMilesText);
        TimesCaught = (TextView) findViewById(R.id.home_timeCaughtText);
        TimesEvaded = (TextView) findViewById(R.id.home_timesEvadedText);
        AveragePace = (TextView) findViewById(R.id.home_averagePaceText);
        AverageRunTime = (TextView) findViewById(R.id.home_averageRunTimeText);
        SettingsButton = (Button) findViewById(R.id.home_settingsButton);
        HistoryButton = (Button) findViewById(R.id.home_historyButton);
        StartRunButton = (Button) findViewById(R.id.history_startRunButton);

        SettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSettings();
            }
        });

        HistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToHistory();
            }
        });


        StartRunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startRun();
            }
        });
    }


    private void goToSettings(){


        Intent settingsActivity = new Intent(this, SettingsActivity.class);
        startActivity(settingsActivity);

    }


    private void goToHistory(){


        Intent historyActivity = new Intent(this, HistoryActivity.class);
        startActivity(historyActivity);

    }

    private void startRun(){


        Intent runstartActivity = new Intent(this, RunstartActivity.class);
        startActivity(runstartActivity);

    }
}
