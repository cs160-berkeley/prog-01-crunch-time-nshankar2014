package com.neilshankar.prog01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ImageButton;
import android.content.Intent;
import android.util.Log;

public class ChooseExercise extends AppCompatActivity {

    private final static String TAG = "ChooseExercise";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_exercise);

        LinearLayout fullGrid = (LinearLayout) findViewById(R.id.fullGrid);

        // attach a click listener to each ImageButton
        for (int i = 0; i < fullGrid.getChildCount(); i += 1) {
            View v = fullGrid.getChildAt(i);
            if (v instanceof LinearLayout) {
                LinearLayout c = (LinearLayout) v;
                for (int j = 0; j < c.getChildCount(); j += 1) {
                    final ImageButton ib = (ImageButton) c.getChildAt(j);
                    ib.setClickable(true);
                    ib.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View clicked) {
                            Intent it = new Intent(ChooseExercise.this, ExerciseCloseup.class);
                            it.putExtra("type", "" + ib.getTag());
                            ChooseExercise.this.startActivity(it);
                        }
                    });
                }
            }
        }

    }
}
