package com.claudechrist.claudedevspace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String  userName;

    public void toMyMenuScreen(View view) {
        Log.i("Info", "Next button clicked");
        Intent i = new Intent(this, MyMenuScreenActivity.class);
        startActivity(i);
        EditText visitorNameEditText = findViewById(R.id.visitorNameEditText);

        userName = visitorNameEditText.getText().toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
