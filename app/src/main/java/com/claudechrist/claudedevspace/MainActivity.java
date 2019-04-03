package com.claudechrist.claudedevspace;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String userName;

    // Next activity toMyMenuScreen
    public void toMyMenuScreen(View view) {
        EditText visitorNameEditText = findViewById(R.id.visitorNameEditText);

        if (TextUtils.isEmpty(visitorNameEditText.getText())) {
            visitorNameEditText.setError("Visitor name is required");
        } else {
            Intent i = new Intent(this, MyMenuScreenActivity.class);
            startActivity(i);
            visitorNameEditText = findViewById(R.id.visitorNameEditText);

            userName = visitorNameEditText.getText().toString();
        }
    }

    // Exiting the app
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Closing Activity")
                .setMessage("Are you sure you want to exit")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
