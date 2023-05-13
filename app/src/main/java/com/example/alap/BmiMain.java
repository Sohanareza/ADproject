package com.example.alap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiMain extends AppCompatActivity {
    private EditText editTextWeight, editTextHeight;
    private Button buttonCalculate,meal;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_main);
        getSupportActionBar().setTitle("Help Yourself");
        editTextWeight = findViewById(R.id.editTextWeight);
        editTextHeight = findViewById(R.id.editTextHeight);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {
        String weightString = editTextWeight.getText().toString();
        String heightString = editTextHeight.getText().toString();

        if (weightString.isEmpty() || heightString.isEmpty()) {
            textViewResult.setText("Please enter weight and height.");
            return;
        }

        float weight = Float.parseFloat(weightString);
        float height = Float.parseFloat(heightString);

        float bmi = weight / (height * height);

        String result;

        if (bmi < 18.5) {
            result = "Underweight";
            meal = findViewById(R.id.meal);
            meal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),MaintainMain.class);
                    startActivity(intent);
                }
            });
        } else if (bmi < 24.9) {
            result = "Normal weight";
        } else if (bmi < 29.9) {
            result = "Overweight";
        } else {
            result = "Obese";
        }

        String bmiString = String.format("%.2f", bmi);

        textViewResult.setText("BMI: " + bmiString + " (" + result + ")");
    }
}