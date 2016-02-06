package com.neilshankar.prog01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class ExerciseCloseup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_closeup);

        Intent it = getIntent();
        final String type = it.getStringExtra("type");
        TextView title = (TextView)findViewById(R.id.closeupTitle);
        TextView minutes = (TextView)findViewById(R.id.minutes);
        minutes.setText("minutes");

        if (type.equals("push-ups") || type.equals("sit-ups") || type.equals("squats")
                || type.equals("jumping jacks") || type.equals("pull-ups")) {
            title.setText("How many " + type + " did you do?");
            minutes.setText("");
        } else if (type.equals("leg lifts")) {
            title.setText("For how long did you do leg lifts?");
        } else if (type.equals("planks")) {
            title.setText("For how long did you plank?");
        } else if (type.equals("cycling")) {
            title.setText("For how long did you cycle?");
        } else if (type.equals("walking")) {
            title.setText("For how long did you walk?");
        } else if (type.equals("jogging")) {
            title.setText("For how long did you jog?");
        } else if (type.equals("swimming")) {
            title.setText("For how long did you swim?");
        } else if (type.equals("stair climbing")) {
            title.setText("For how long did you climb stairs?");
        }

        Button enter = (Button)findViewById(R.id.convert);
        enter.setClickable(true);
        enter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View clicked) {
                Intent it = new Intent(ExerciseCloseup.this, CaloriesBurned.class);
                it.putExtra("type", type);
                it.putExtra("num", "" + ((EditText)findViewById(R.id.value)).getText());
                ExerciseCloseup.this.startActivity(it);
            }
        });
    }
}
