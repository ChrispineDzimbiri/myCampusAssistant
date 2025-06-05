package com.example.mycampusassistant;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.btnSchedule).setOnClickListener(v ->
                startActivity(new Intent(this, ClassScheduleActivity.class)));

        findViewById(R.id.btnAssignments).setOnClickListener(v ->
          startActivity(new Intent(this, AssignmentsExamsActivity.class)));

        findViewById(R.id.btnMap).setOnClickListener(v ->
                startActivity(new Intent(this, CampusMapActivity.class)));

        findViewById(R.id.btnProfile).setOnClickListener(v ->
                startActivity(new Intent(this, ProfileSettingsActivity.class)));
    }
}
