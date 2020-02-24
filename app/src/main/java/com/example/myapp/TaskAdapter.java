package com.example.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TaskAdapter extends ArrayAdapter<Task> {

    private Context mContext;
    private ArrayList<Task> taskArrayList;

    public TaskAdapter(@NonNull Context context, int resource,ArrayList<Task> tasks) {
        super(context, resource);
        mContext=context;
        taskArrayList=tasks;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitem=convertView;

        listitem= LayoutInflater.from(mContext).inflate(R.layout.country_list_item,parent,false);

        Task currentTask = taskArrayList.get(position);

        ImageView priority=listitem.findViewById(R.id.priority_image);

        if(currentTask.priority==1)
        {
            priority.setImageResource(R.drawable.red_circle);
        }
        else if(currentTask.priority==2)
        {
            priority.setImageResource(R.drawable.yellow_circle);
        }
        else {
            priority.setImageResource(R.drawable.green_circle);
        }


        TextView taskText=listitem.findViewById(R.id.task_text);
        taskText.setText(currentTask.taskName);


        return listitem;
    }


    @Override
    public int getCount() {
        return  taskArrayList.size();
    }
}
