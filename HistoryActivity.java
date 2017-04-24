package com.lborocoursework.outrun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {

    private TextView historyText;
    private Button startRunButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_layout);

        historyText = (TextView) findViewById(R.id.history_historyText);
        startRunButton = (Button) findViewById(R.id.history_startRunButton);


        startRunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRun();
            }
        });

    }


    private void startRun(){
        Intent runStartActivity = new Intent(this, RunstartActivity.class);
        startActivity(runStartActivity);

    }
}