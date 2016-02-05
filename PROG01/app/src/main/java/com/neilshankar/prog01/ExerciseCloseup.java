package com.neilshankar.prog01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class ExerciseCloseup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_closeup);

        Intent it = getIntent();
        String type = it.getStringExtra("type");

        TextView title = (TextView)findViewById(R.id.closeupTitle);
        title.setText("How many " + type + " did you do?");
    }
}
