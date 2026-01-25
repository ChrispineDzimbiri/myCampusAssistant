package com.example.mycampusassistant;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import android.widget.TextView;


public class AssignmentsExamsActivity extends AppCompatActivity {

    RecyclerView recyclerTasks;
    Button btnAddTask;
    ArrayList<Task> taskList = new ArrayList<>();
    TaskAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignments_exams);

        recyclerTasks = findViewById(R.id.recyclerTasks);
        btnAddTask = findViewById(R.id.btnAddTask);

        taskList.add(new Task("Math Homework", "5 June"));
        taskList.add(new Task("CS Exam", "10 June"));

        adapter = new TaskAdapter(taskList);
        recyclerTasks.setLayoutManager(new LinearLayoutManager(this));
        recyclerTasks.setAdapter(adapter);

        btnAddTask.setOnClickListener(v -> showAddTaskDialog());
    }

    private void showAddTaskDialog() {
        View view = getLayoutInflater().inflate(R.layout.dialog_add_task, null);
        final TextView inputTitle = view.findViewById(R.id.inputTitle);
        final TextView inputDate = view.findViewById(R.id.inputDate);

        new AlertDialog.Builder(this)
                .setTitle("Add Task")
                .setView(view)
                .setPositiveButton("Add", (dialog, which) -> {
                    String title = inputTitle.getText().toString();
                    String date = inputDate.getText().toString();
                    taskList.add(new Task(title, date));
                    adapter.notifyItemInserted(taskList.size() - 1);
                    Toast.makeText(this, "Task Added", Toast.LENGTH_SHORT).show();
                })
                .setNegativeButton("Cancel", null)
                .show();
    }
}
