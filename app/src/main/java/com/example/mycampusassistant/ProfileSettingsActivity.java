package com.example.mycampusassistant;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileSettingsActivity extends AppCompatActivity {

    EditText inputName, inputID, inputCourse;
    Button btnEdit, btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_settings);

        inputName = findViewById(R.id.inputName);
        inputID = findViewById(R.id.inputID);
        inputCourse = findViewById(R.id.inputCourse);
        btnEdit = findViewById(R.id.btnEdit);
        btnSave = findViewById(R.id.btnSave);

        // Disable editing by default
        inputName.setEnabled(false);
        inputID.setEnabled(false);
        inputCourse.setEnabled(false);

        btnEdit.setOnClickListener(v -> {
            inputName.setEnabled(true);
            inputID.setEnabled(true);
            inputCourse.setEnabled(true);
        });

        btnSave.setOnClickListener(v -> {
            inputName.setEnabled(false);
            inputID.setEnabled(false);
            inputCourse.setEnabled(false);
            Toast.makeText(this, "Profile saved!", Toast.LENGTH_SHORT).show();
        });
    }
}
