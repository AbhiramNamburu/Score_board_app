package com.example.score_board_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button a1,a2,a3,b1,b2,b3,res;
    TextView tv1,tv2;
    int a=0;
    int b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1=findViewById(R.id.teama1);
        a2=findViewById(R.id.teama2);
        a3=findViewById(R.id.teama3);
        b1=findViewById(R.id.teamb1);
        b2=findViewById(R.id.teamb2);
        b3=findViewById(R.id.teamb3);
        tv1=findViewById(R.id.teama);
        tv2=findViewById(R.id.teamb);
        res=findViewById(R.id.reset);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                tv1.setText(""+a);
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=a+2;
                tv1.setText(""+a);
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=a+3;
                tv1.setText(""+a);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b++;
                tv2.setText(""+b);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=b+2;
                tv2.setText(""+b);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=b+3;
                tv2.setText(""+b);
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=0;
                a=0;
                tv2.setText(""+b);
                tv1.setText(""+a);
            }
        });

    }
}