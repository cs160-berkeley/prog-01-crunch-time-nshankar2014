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
        final String given = it.getStringExtra("num");

        TextView numCalories = (TextView)findViewById(R.id.numCalories);
        numCalories.setText("" + given);
    }
}
