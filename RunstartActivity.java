package com.lborocoursework.outrun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RunstartActivity extends AppCompatActivity {

    private TextView countdownText;
    private Button cancelButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);

        countdownText = (TextView) findViewById(R.id.runstart_secondsLeftText);
        cancelButton = (Button) findViewById(R.id.runstart_cancelButton);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelRun();
            }
        });

    }

    private void cancelRun(){
        Intent homeActivity = new Intent(this,HomeActivity.class);
        startActivity(homeActivity);

    }
}
