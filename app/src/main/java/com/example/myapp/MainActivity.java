package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText taskEditText;
    private Button addTask;
    private ImageView red,green,yellow;
    private TextView currentSelection;

    private int currentPriority=0;

    public static ArrayList<Task> taskArrayList;


    // 1 -red, 2- yellow, 3-green

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taskArrayList=new ArrayList<>();


        addTask=findViewById(R.id.add_task_button);


        ListView list=findViewById(R.id.task_list);
        final TaskAdapter taskAdapter=new TaskAdapter(this,R.id.task_list,taskArrayList);
        list.setAdapter(taskAdapter);

       /* ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.country_list_item
        ,R.id.text,country);
*/
        // list.setAdapter();

      /*  taskEditText=findViewById(R.id.enter_task_edit_text);


        red=findViewById(R.id.red_selection);
        yellow=findViewById(R.id.yellow_selection);
        green=findViewById(R.id.green_selection);

        currentSelection=findViewById(R.id.current_selection);

       // final String country[]={"India","US","UK"};



        final TaskAdapter taskAdapter=new TaskAdapter(this,R.id.country_list,taskArrayList);


        ListView list=findViewById(R.id.country_list);
        list.setAdapter(taskAdapter);*/

       /* ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.country_list_item
        ,R.id.text,country);
*/
       // list.setAdapter();

       /* list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,country[i],Toast.LENGTH_SHORT).show();
            }
        });*/


      /* red.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               currentPriority=1;
               currentSelection.setText("Red");
           }
       });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentPriority=2;
                currentSelection.setText("Yellow");
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentPriority=3;
                currentSelection.setText("Green");
            }
        });*/

        addTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AddTask.class);
                startActivity(intent);
            }
        });

    }
}
