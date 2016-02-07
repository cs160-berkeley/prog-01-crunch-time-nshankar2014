package com.neilshankar.prog01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChooseFeature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_feature);

        Button option1 = (Button)findViewById(R.id.option1);
        option1.setClickable(true);
        option1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View clicked) {
                Intent it = new Intent(ChooseFeature.this, Goal.class);
                ChooseFeature.this.startActivity(it);
            }
        });
        Button option2 = (Button)findViewById(R.id.option2);
        option2.setClickable(true);
        option2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View clicked) {
                Intent it = new Intent(ChooseFeature.this, ChooseExercise.class);
                ChooseFeature.this.startActivity(it);
            }
        });
    }
}
