package com.lborocoursework.outrun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText mUsernameField;
    private EditText mPasswordField;
    private Button mLoginButton;
    private TextView mRegisterLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        //Set layout variables
        mUsernameField = (EditText) findViewById(R.id.signup_usernameField);
        mPasswordField = (EditText) findViewById(R.id.signup_avgMilesField);
        mLoginButton = (Button) findViewById(R.id.login_loginButton);
        mRegisterLink = (TextView) findViewById(R.id.signup_linkText);


        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
    }

    private void Login() {
        //Login functionality code goes here (can be used via class interface to follow OOP standards)

        //Transition to home screen
        Intent homeActivity = new Intent(this, HomeActivity.class);
        startActivity(homeActivity);
    }
}