package com.claudechrist.claudedevspace;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.InputMismatchException;

public class CalculationActivity extends AppCompatActivity {

    public void volumeOfSphere(View view) {
        //TODO: Code here the algorithm to compute the volume of sphere
        // - sphere: (4/3) * PI * radius * radius * radius

        EditText radiusEditText = findViewById(R.id.radiusEditText);
        TextView calculationOutputTextView = findViewById(R.id.calculationOutputTextView);
        int radius = 1;


        try {
                radius = Integer.parseInt(radiusEditText.getText().toString());
        } catch (Exception e) {
                Toast.makeText(this, "Enter an integer as radius", Toast.LENGTH_LONG).show();
        }

        // computing the volume of the sphere
        double volume = (4 / 3) * Math.PI * Math.pow(radius, 3);

        calculationOutputTextView.setText(String.format("%s %.2f", "The volume of the sphere is ", volume));
        calculationOutputTextView.animate().alpha(1).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);
    }
}
