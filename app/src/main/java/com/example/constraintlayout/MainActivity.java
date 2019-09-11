package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txvR,txvG,txvB;
    View colorblock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvR= (TextView) findViewById(R.id.txvR);
        txvG= (TextView) findViewById(R.id.txvG);
        txvB= (TextView) findViewById(R.id.txvB);

        colorblock =findViewById(R.id.colorblock);
    }



    public  void changecolor(View v){

        Random x = new Random();
        int red =x.nextInt(256);
        txvR.setText("red : "+red);
        txvR.setTextColor(Color.rgb(red,0,0));

        int green =x.nextInt(256);
        txvG.setText("green : "+green);
        txvG.setTextColor(Color.rgb(0,green,0));

        int blue =x.nextInt(256);
        txvB.setText("blue : "+blue);
        txvB.setTextColor(Color.rgb(0,0,blue));




        colorblock.setBackgroundColor(Color.rgb(red,green,blue));
    }
}
