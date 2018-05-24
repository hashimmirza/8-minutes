package io.github.kosmologist.a8minutes.ClassicWorkout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.github.kosmologist.a8minutes.R;

public class ListOfExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_exercise);

        Button btnGo = findViewById(R.id.btnGO);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListOfExerciseActivity.this,ClassicExerciseActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
