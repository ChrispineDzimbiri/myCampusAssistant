package com.example.mycampusassistant;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ClassScheduleActivity extends AppCompatActivity {

    RecyclerView recyclerSchedule;
    ArrayList<ClassSchedule> scheduleList;
    ClassScheduleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_schedule);

        recyclerSchedule = findViewById(R.id.recyclerSchedule);
        scheduleList = new ArrayList<>();

        // Sample data
        scheduleList.add(new ClassSchedule("Monday", "8:00 AM", "Mathematics"));
        scheduleList.add(new ClassSchedule("Tuesday", "10:00 AM", "Java Programming"));
        scheduleList.add(new ClassSchedule("Wednesday", "9:00 AM", "Data Structures"));
        scheduleList.add(new ClassSchedule("Thursday", "11:00 AM", "Operating Systems"));
        scheduleList.add(new ClassSchedule("Friday", "1:00 PM", "Database Systems"));

        adapter = new ClassScheduleAdapter(scheduleList);
        recyclerSchedule.setLayoutManager(new LinearLayoutManager(this));
        recyclerSchedule.setAdapter(adapter);
    }
}
