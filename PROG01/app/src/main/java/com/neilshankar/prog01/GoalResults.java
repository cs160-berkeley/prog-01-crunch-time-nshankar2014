package com.neilshankar.prog01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GoalResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_results);

        Intent it = getIntent();
        final int goal = Integer.parseInt(it.getStringExtra("goal"));

        int numPushups =         (int) (goal/(100.0/350.0));
        int numSitups =          (int) (goal/0.5);
        int numSquats =          (int) (goal/(100.0/225.0));
        int numLegLifts =        (int) (goal/4.0);
        int numPlanks =          (int) (goal/4.0);
        int numJumpingJacks =    (int) (goal/10.0);
        int numPullups =         (int) (goal);
        int numCycling =         (int) (goal/(100.0/12.0));
        int numWalking =         (int) (goal/5.0);
        int numJogging =         (int) (goal/(100.0/12.0));
        int numSwimming =        (int) (goal/(100.0/13.0));
        int numStairClimbing =   (int) (goal/(100.0/15.0));

        ((TextView)findViewById(R.id.title)).setText("How to burn " + goal + " calories");

        ((TextView)findViewById(R.id.numPushups)).setText("" + numPushups + " reps");
        ((TextView)findViewById(R.id.numSitups)).setText("" + numSitups + " reps");
        ((TextView)findViewById(R.id.numSquats)).setText("" + numSquats + " reps");
        ((TextView)findViewById(R.id.numLeglifts)).setText("" + numLegLifts + " minutes");
        ((TextView)findViewById(R.id.numPlanks)).setText("" + numPlanks + " minutes");
        ((TextView)findViewById(R.id.numJumpingJacks)).setText("" + numJumpingJacks + " minutes");
        ((TextView)findViewById(R.id.numPullups)).setText("" + numPullups + " reps");
        ((TextView)findViewById(R.id.numCycling)).setText("" + numCycling + " minutes");
        ((TextView)findViewById(R.id.numWalking)).setText("" + numWalking + " minutes");
        ((TextView)findViewById(R.id.numJogging)).setText("" + numJogging + " minutes");
        ((TextView)findViewById(R.id.numSwimming)).setText("" + numSwimming + " minutes");
        ((TextView)findViewById(R.id.numStairClimbing)).setText("" + numStairClimbing + " minutes");

    }
}
