package com.claudechrist.claudedevspace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyMenuScreenActivity extends AppCompatActivity {

    public void toMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toCalculationActivity(View view) {
        Intent intent = new Intent(this, CalculationActivity.class);
        startActivity(intent);
    }

    public void toMyDetailsActivity(View view) {
        Intent intent = new Intent(this, MyDetailsActivity.class);
        startActivity(intent);
    }

    public void toMyProfileActivity(View view) {
        Intent intent = new Intent(this, MyProfileActivity.class);
        startActivity(intent);
    }

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
