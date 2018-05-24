package io.github.kosmologist.a8minutes.AbsWorkout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.github.kosmologist.a8minutes.R;

public class ListOfAbsExercisesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_abs_exercises);

        Button btnGo = findViewById(R.id.btnAbsGO);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListOfAbsExercisesActivity.this,AbsExerciseActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
