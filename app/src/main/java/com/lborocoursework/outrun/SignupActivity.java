package com.lborocoursework.outrun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    private EditText mUsernameField;
    private EditText mPasswordField;
    private EditText mEmailField;
    private EditText averageMilesField;
    private Button registerButton;
    private TextView loginLink;
    private TextView gotAccountText;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);

        //Set layout of variables

        ImageView logoImage = (ImageView) findViewById(R.id.signup_logoImageView);
        mUsernameField = (EditText) findViewById(R.id.signup_usernameField);
        mPasswordField = (EditText) findViewById(R.id.signup_passwordField);
        mEmailField = (EditText) findViewById(R.id.signup_emailField);
        averageMilesField = (EditText) findViewById(R.id.signup_avgMilesField);
        registerButton = (Button) findViewById(R.id.signup_registerButton);
        loginLink = (TextView) findViewById(R.id.signup_linkText);
        gotAccountText = (TextView) findViewById(R.id.signup_gotAnAccountText);



        registerButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Register();
            }
        });



        loginLink.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                goToLogin();
            }
        }
        );

    }


    private void Register(){

        Intent homeActivity = new Intent(this, HomeActivity.class);
        startActivity(homeActivity);

    }

    private void goToLogin(){

        Intent loginActivity = new Intent(this, LoginActivity.class);
        startActivity(loginActivity);
    }

}
