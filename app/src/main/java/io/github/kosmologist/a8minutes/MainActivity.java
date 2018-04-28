package io.github.kosmologist.a8minutes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.github.kosmologist.a8minutes.ClassicExercise.ClassicInstructionsActivity;
import io.github.kosmologist.a8minutes.ClassicExercise.ListOfExerciseActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.widget.Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("8 MINUTES");
        toolbar.setLogo(R.drawable.newlogo);
        Button btnClassicInstructions =findViewById(R.id.btnInstructions);
        btnClassicInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ClassicInstructionsActivity.class);
                startActivity(intent);

            }
        });

        Button btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListOfExerciseActivity.class);
                startActivity(intent);
            }
        });


    }
}
