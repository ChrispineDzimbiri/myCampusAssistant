package com.example.mycampusassistant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ClassScheduleAdapter extends RecyclerView.Adapter<ClassScheduleAdapter.ViewHolder> {

    private List<ClassSchedule> scheduleList;

    public ClassScheduleAdapter(List<ClassSchedule> scheduleList) {
        this.scheduleList = scheduleList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtDay, txtTime, txtSubject;

        public ViewHolder(View itemView) {
            super(itemView);
            txtDay = itemView.findViewById(R.id.txtDay);
            txtTime = itemView.findViewById(R.id.txtTime);
            txtSubject = itemView.findViewById(R.id.txtSubject);
        }
    }

    @NonNull
    @Override
    public ClassScheduleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.schedule_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClassScheduleAdapter.ViewHolder holder, int position) {
        ClassSchedule schedule = scheduleList.get(position);
        holder.txtDay.setText(schedule.getDay());
        holder.txtTime.setText(schedule.getTime());
        holder.txtSubject.setText(schedule.getSubject());
    }

    @Override
    public int getItemCount() {
        return scheduleList.size();
    }
}
