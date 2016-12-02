package com.example.sharmy.taskr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class JobsActivity extends AppCompatActivity {
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);


        lv = (ListView) findViewById(R.id.listView);

        // Instantiating an array list
        List<String> jobs_array_list = new ArrayList<>();
        jobs_array_list.add("Sajjan's Driveway");
        jobs_array_list.add("Allie's Garden");
        jobs_array_list.add("Sartaj's Car Wash");
        jobs_array_list.add("Omar's Tiles");
        jobs_array_list.add("Jessie's Plumbing");
        jobs_array_list.add("Leanne's Tire Change");

        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                jobs_array_list);
    }
}
