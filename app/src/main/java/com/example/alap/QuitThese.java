package com.example.alap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class QuitThese extends AppCompatActivity {
    ListView lvquit;
    String[] listName={"Quit smoking","Quit alcohol","Never take unhealthy food","Don't stop working out","Never stop socializing"};
    int[] listImage={R.drawable.nosmoking,R.drawable.noalcohol,R.drawable.junkfood,
    R.drawable.exercise,R.drawable.gossip};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quit_these);
        getSupportActionBar().setTitle("Help Yourself");

    }
}