package io.github.kosmologist.a8minutes;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import io.github.kosmologist.a8minutes.ClassicExercise.ClassicInstructionsActivity;
import io.github.kosmologist.a8minutes.ClassicExercise.ListOfExerciseActivity;
import io.github.kosmologist.a8minutes.abs.AbsExerciseActivity;
import io.github.kosmologist.a8minutes.abs.AbsInstructionsActivity;
import io.github.kosmologist.a8minutes.abs.ListOfAbsExercisesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.widget.Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("8 MINUTES");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
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
        Button btnAbsInstructions = findViewById(R.id.btnAbsInstructions);
        btnAbsInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AbsInstructionsActivity.class);
                startActivity(intent);
            }
        });
        Button btnAbsStart = findViewById(R.id.btnAbsStart);
        btnAbsStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListOfAbsExercisesActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menus,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
