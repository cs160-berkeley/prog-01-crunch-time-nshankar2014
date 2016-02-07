package com.neilshankar.prog01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CaloriesBurned extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories_burned);

        Intent it = getIntent();
        final int num = Integer.parseInt(it.getStringExtra("num"));
        final String type = it.getStringExtra("type");

        double burned = 0.0;

        if (type.equals("push-ups")) {
            burned = (100.0/350.0) * num;
        } else if (type.equals("sit-ups")) {
            burned = 0.5 * num;
        } else if (type.equals("squats")) {
            burned = (100.0/225.0) * num;
        } else if (type.equals("leg lifts")) {
            burned = 4.0 * num;
        } else if (type.equals("planks")) {
            burned = 4.0 * num;
        } else if (type.equals("jumping jacks")) {
            burned = 10.0 * num;
        } else if (type.equals("pull-ups")) {
            burned = num;
        } else if (type.equals("cycling")) {
            burned = (100.0/12.0) * num;
        } else if (type.equals("walking")) {
            burned = 5.0 * num;
        } else if (type.equals("jogging")) {
            burned = (100.0/12.0) * num;
        } else if (type.equals("swimming")) {
            burned = (100.0/13.0) * num;
        } else if (type.equals("stair climbing")) {
            burned = (100.0/15.0) * num;
        }

        TextView numCalories = (TextView)findViewById(R.id.numCalories);
        numCalories.setText("" + (int)burned);
    }
}
