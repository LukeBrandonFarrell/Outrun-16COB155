package com.lborocoursework.outrun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RuncompleteActivity extends AppCompatActivity {

    private TextView gotCaughtText;
    private TextView bestPlaceText;
    private Button runAgainButton;
    private TextView runCompleteText;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.runcomplete_layout);

        gotCaughtText = (TextView) findViewById(R.id.runcomplete_caughtAtText);
        bestPlaceText = (TextView) findViewById(R.id.runcomplete_bestPlaceText);
        runAgainButton = (Button) findViewById(R.id.runcomplete_runAgainButton);
        runCompleteText = (TextView) findViewById(R.id.runcomplete_runCompleteText);


        runAgainButton.setOnClickListener(new View.OnClickListener() {
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
