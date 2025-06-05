package com.example.mycampusassistant;

public class ClassSchedule {
    String day;
    String time;
    String subject;

    public ClassSchedule(String day, String time, String subject) {
        this.day = day;
        this.time = time;
        this.subject = subject;
    }

    public String getDay() { return day; }
    public String getTime() { return time; }
    public String getSubject() { return subject; }
}
