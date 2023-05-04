package com.example.alap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {
    CardView medreminderCard;

    CardView checkCard;
    CardView reminderCard;
    CardView testmriCard;
    CardView imageclassifyCard;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        checkCard = findViewById(R.id.checkCard);
        checkCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CheckyourselfActivity.class);
                startActivity(intent);
            }
        });

        medreminderCard=findViewById(R.id.medreminderCard);
        medreminderCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MedMainActivity.class);
                startActivity(intent);
            }
        });

        reminderCard=findViewById(R.id.reminderCard);
        reminderCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NoteEditorActivity.class);
                startActivity(intent);
            }
        });

        testmriCard=findViewById(R.id.testmriCard);
        testmriCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TestMri.class);
                startActivity(intent);
            }
        });
        imageclassifyCard=findViewById(R.id.imageclassifyCard);
        imageclassifyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MedMainActivity.class);
                startActivity(intent);
            }
        });







    }
}