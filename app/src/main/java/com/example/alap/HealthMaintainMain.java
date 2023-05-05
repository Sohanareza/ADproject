package com.example.alap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.alap.databinding.ActivityHealthMaintainMainBinding;
import com.example.alap.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class HealthMaintainMain extends AppCompatActivity {
    CardView dietCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_maintain_main);

        dietCard = findViewById(R.id.dietCard);
        dietCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DietDetailedActivity.class);
                startActivity(intent);
            }
        });
    }
}