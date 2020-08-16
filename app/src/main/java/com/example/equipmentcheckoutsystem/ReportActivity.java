package com.example.equipmentcheckoutsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReportActivity extends AppCompatActivity
{
    DatabaseHelper2 myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        ListView listView = (ListView) findViewById(R.id.listView);

        myDB = new DatabaseHelper2(this);

        ArrayList<String> theList = new ArrayList<>();
        Cursor data = myDB.getListContents();

        if (data.getCount() == 0)
        {
            Toast.makeText(ReportActivity.this, "The Database was empty", Toast.LENGTH_SHORT).show();
        }
        else
        {
            while (data.moveToNext())
            {
               theList.add(data.getString(1));
                ListAdapter listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, theList);
                listView.setAdapter(listAdapter);
            }
        }
    }
}