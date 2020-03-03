package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class AddTask extends AppCompatActivity {
    private static final String TAG = "AddTask";

    private EditText taskName;
    private Button add;
    private Spinner prioritySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        taskName=findViewById(R.id.task_name);
        add=findViewById(R.id.add_task_button);
        prioritySpinner=findViewById(R.id.priority_spinner);

        ArrayList<String> prioritiesList=new ArrayList<>();
        prioritiesList.add("1");
        prioritiesList.add("2");
        prioritiesList.add("3");

        ArrayAdapter<String> adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,prioritiesList);
        prioritySpinner.setAdapter(adapter);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int priority = prioritySpinner.getSelectedItemPosition() + 1;
                String taskString=taskName.getText().toString();

                Task t=new Task(priority,taskString);

                MainActivity.taskArrayList.add(t);

                Log.d(TAG,"Selected Priority:"+priority);
                finish();
            }
        });

    }
}
