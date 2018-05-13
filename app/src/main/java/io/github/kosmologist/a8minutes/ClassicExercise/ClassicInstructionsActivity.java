package io.github.kosmologist.a8minutes.ClassicExercise;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.github.kosmologist.a8minutes.MainActivity;
import io.github.kosmologist.a8minutes.R;

public class ClassicInstructionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_instructions);
        android.support.v7.widget.Toolbar toolbar =findViewById(R.id.classicInstructionToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Instructions");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassicInstructionsActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
