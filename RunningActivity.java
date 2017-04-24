package com.lborocoursework.outrun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RunningActivity extends AppCompatActivity {

    private TextView timerText;
    private Button stopRunButton;
    private TextView currentlyRunningText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currentlyrunning_layout);


        timerText = (TextView) findViewById(R.id.currentlyrunning_timeText);
        stopRunButton = (Button) findViewById(R.id.currentlyrunning_stopRunButton);
        currentlyRunningText = (TextView) findViewById(R.id.currentlyrunning_currentlyRunningText);

        stopRunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopRun();
            }
        });
    }

    private void stopRun(){
        Intent homeActivity = new Intent(this,HomeActivity.class);
        startActivity(homeActivity);

    }
}
