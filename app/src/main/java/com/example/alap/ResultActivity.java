package com.example.alap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView tv, tv2, tv3,tv4;
    Button btnRestart,goHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv = (TextView)findViewById(R.id.tvres);
        tv2 = (TextView)findViewById(R.id.tvres2);
        tv3 = (TextView)findViewById(R.id.tvres3);

        tv4=(TextView)findViewById(R.id.tvdecision);

        btnRestart = (Button) findViewById(R.id.btnRestart);
        goHome = (Button) findViewById(R.id.goHome);

        StringBuffer sb = new StringBuffer();
        sb.append("Correct answers: " + QuestionsActivity.correct + "\n");
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Wrong Answers: " + QuestionsActivity.wrong + "\n");
        StringBuffer sb3 = new StringBuffer();
        sb3.append("Final Score: " + QuestionsActivity.correct + "\n");

        StringBuffer sb4=new StringBuffer();
        if(QuestionsActivity.correct<4 && QuestionsActivity.correct>2)
        {
            sb4.append("Don't worry may be it was a slip of mind. Try again"+"\n");
        }
        if (QuestionsActivity.correct<2) {
            sb4.append("Don't Be afraid. You are strong enough to consult with a doctor. Best of Luck"+"\n");

        }
        else {
            sb4.append("Good Job ! Your memory is good!"+"\n");
        }

        tv.setText(sb);
        tv2.setText(sb2);
        tv3.setText(sb3);
        tv4.setText(sb4);




        QuestionsActivity.correct=0;
        QuestionsActivity.wrong=0;

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),ScreeningTestActivity.class);
                startActivity(in);
            }
        });

        goHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}