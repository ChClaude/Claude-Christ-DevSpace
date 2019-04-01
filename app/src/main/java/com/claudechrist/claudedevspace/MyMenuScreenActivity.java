package com.claudechrist.claudedevspace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyMenuScreenActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_menu_sreen);

        TextView welcomeTextView = findViewById(R.id.welcomeTextView);

        // setting the welcomeTextView to a text welcoming the user by its name
        String greetings = String.format("\tDear %s%nWelcome to my Code Space", MainActivity.userName);
        welcomeTextView.setText(greetings);
    }
}
