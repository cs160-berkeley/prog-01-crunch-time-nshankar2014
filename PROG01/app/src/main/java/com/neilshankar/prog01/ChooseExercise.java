package com.neilshankar.prog01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ImageButton;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.util.Log;

public class ChooseExercise extends AppCompatActivity {

    private final static String TAG = "ChooseExercise";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_exercise);

        LinearLayout fullGrid = (LinearLayout)findViewById(R.id.fullGrid);

        // attach a click listener to each ImageButton
        for (int i = 0; i < fullGrid.getChildCount(); i += 1) {
            View v = fullGrid.getChildAt(i);
            if (v instanceof LinearLayout) {
                LinearLayout c = (LinearLayout) v;
                for (int j = 0; j < c.getChildCount(); j += 1) {
                    ImageButton ib = (ImageButton) c.getChildAt(j);
                    ib.setClickable(true);
                    Log.d(TAG, "" + ib.getTag());
                    ib.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View clicked) {
                            ChooseExercise.this.startActivity(new Intent(ChooseExercise.this, Pushups.class));
                        }
                    });
                }
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_exercise, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void gotoPushups(View v) {
        ChooseExercise.this.startActivity(new Intent(this, Pushups.class));
    }
    public void gotoSitups(View v) {
        ChooseExercise.this.startActivity(new Intent(this, Situps.class));
    }
    public void gotoSquats(View v) {
        ChooseExercise.this.startActivity(new Intent(this, Squats.class));
    }
    public void gotoLegLifts(View v) {
        ChooseExercise.this.startActivity(new Intent(this, LegLifts.class));
    }
}
