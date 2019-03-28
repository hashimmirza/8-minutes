package io.github.kosmologist.workoutTrainer.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.github.kosmologist.workoutTrainer.AbsWorkout.AbsInstructionsActivity;
import io.github.kosmologist.workoutTrainer.ArmWorkout.ArmInstructionsActivity;
import io.github.kosmologist.workoutTrainer.ButtWorkout.ButtInstructionsActivity;
import io.github.kosmologist.workoutTrainer.ClassicWorkout.ClassicInstructionsActivity;
import io.github.kosmologist.workoutTrainer.LegWorkout.LegInstructionsActivity;
import io.github.kosmologist.workoutTrainer.R;

public class AllInstructionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_instructions);
        android.support.v7.widget.Toolbar toolbar =findViewById(R.id.allInstToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Instructions");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            finish();
            }
        });

        Button btnClassicInst = findViewById(R.id.btnClassicIconInstructions);
        btnClassicInst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllInstructionsActivity.this, ClassicInstructionsActivity.class);
                startActivity(intent);
            }
        });

        Button btnAbsInst = findViewById(R.id.btnAbsIconInstructions);
        btnAbsInst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllInstructionsActivity.this, AbsInstructionsActivity.class);
                startActivity(intent);
            }
        });

       Button btnArmsInst = findViewById(R.id.btnArmIconInstructions);
       btnArmsInst.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(AllInstructionsActivity.this ,ArmInstructionsActivity.class );
               startActivity(intent);
           }
       });

       Button btnButtInst = findViewById(R.id.btnButtIconInstructions);
       btnButtInst.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(AllInstructionsActivity.this, ButtInstructionsActivity.class);
               startActivity(intent);
           }
       });

        Button btnLegInst = findViewById(R.id.btnLegIconInstructions);
        btnLegInst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllInstructionsActivity.this, LegInstructionsActivity.class);
                startActivity(intent);
            }
        });
    }
}
