package com.neilshankar.prog01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Goal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);

        Button enter = (Button)findViewById(R.id.enter);
        enter.setClickable(true);
        enter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View clicked) {
                Intent it = new Intent(Goal.this, GoalResults.class);
                it.putExtra("goal", "" + ((EditText) findViewById(R.id.goal)).getText());
                Goal.this.startActivity(it);
            }
        });
    }
}
