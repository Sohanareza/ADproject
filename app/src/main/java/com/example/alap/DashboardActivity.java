package com.example.alap;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.firebase.auth.FirebaseAuth;

public class DashboardActivity extends AppCompatActivity {
    CardView medreminderCard;
CardView hadviseCard;
    CardView checkCard;
    CardView reminderCard;
    CardView testmriCard;
    CardView imageclassifyCard;
    private FirebaseAuth firebaseAuth;


    ActionBar actionBar;


    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        checkCard = findViewById(R.id.checkCard);
        firebaseAuth=firebaseAuth.getInstance();
        //((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Profile");
        getSupportActionBar().setTitle("Help Yourself");
        //ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        //getSupportActionBar().setTitle("Alzheimer App");
        checkCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CheckyourselfActivity.class);
                startActivity(intent);
            }
        });

        reminderCard = findViewById(R.id.reminderCard);
        reminderCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), notesactivity.class);
                startActivity(intent);
            }
        });

        testmriCard = findViewById(R.id.testmriCard);
        testmriCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TestMri.class);
                startActivity(intent);
            }
        });

        hadviseCard = findViewById(R.id.hadviseCard);
        hadviseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HealthMaintainMain.class);
                startActivity(intent);
            }
        });
        imageclassifyCard = findViewById(R.id.imageclassifyCard);
        imageclassifyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ImageClassify.class);
                startActivity(intent);
            }
        });
    }




    @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu,menu);
            return true;
        }
        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            switch(item.getItemId()){
                case R.id.logout:
                    firebaseAuth.signOut();
                    finish();
                    startActivity(new Intent(DashboardActivity.this,NewLoginActivity.class));
            }
            return super.onOptionsItemSelected(item);
        }




}