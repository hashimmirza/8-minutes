package io.github.kosmologist.a8minutes.LegWorkout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import io.github.kosmologist.a8minutes.ClassicWorkout.ClassicExerciseActivity;
import io.github.kosmologist.a8minutes.ClassicWorkout.ListOfExerciseActivity;
import io.github.kosmologist.a8minutes.R;

public class ListOfLegExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_leg_exercise);

        final AdView mAdView = findViewById(R.id.adLegView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mAdView.setVisibility(View.VISIBLE);
            }

        });

        Button btnGo = findViewById(R.id.btnLegGO);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListOfLegExerciseActivity.this,LegExerciseActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
