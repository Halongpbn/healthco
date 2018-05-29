package com.hc.healthco;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class SurveyActivity extends AppCompatActivity {
    private TextInputEditText age, height, weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

    }

    private double calcBMR(int age, String height, double weight, String gender) {

        String feet = height.substring(0, height.indexOf("\""));
        String inches = height.substring(height.indexOf("\"") + 1, height.indexOf(height.length() - 1));
        double cmHeight = 2.54 * (Integer.parseInt(feet) + Double.parseDouble(inches) / 12);
        double kg = weight * 0.453592;
        double bmr;

        if(gender.equals("male"))
            bmr = cmHeight * 6.25 + kg * 9.9 - age * 4.92 + 5;
        else
            bmr = cmHeight * 6.25 + kg * 9.9 - age * 4.92 - 161;

        return bmr;
    }
}
