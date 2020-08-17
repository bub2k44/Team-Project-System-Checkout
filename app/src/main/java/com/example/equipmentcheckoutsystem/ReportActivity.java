package com.example.equipmentcheckoutsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReportActivity extends AppCompatActivity
{
    DatabaseHelper2 myDB;
    ArrayList<Item> itemsList;
    ListView listView;
    Item item;
    Button mMainMenu;
    Button mDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        myDB = new DatabaseHelper2(this);

//        mMainMenu = findViewById(R.id.btn_main_menu);
//        mDelete = findViewById(R.id.delete);
//
//        mMainMenu.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                Intent mainMenu = new Intent(ReportActivity.this, MainMenuActivity.class);
//                startActivity(mainMenu);
//            }
//        });

        itemsList = new ArrayList<>();
        Cursor data = myDB.getListContents();
        int numRows = data.getCount();

        if (numRows == 0)
        {
            Toast.makeText(ReportActivity.this, "Database is empty!", Toast.LENGTH_LONG).show();
        }
        else
        {
            while (data.moveToNext())
            {
                item = new Item(data.getString(1), data.getString(2), data.getString(3));
                itemsList.add(item);
            }
            ThreeColumn_ListAdapter adapter = new ThreeColumn_ListAdapter(this, R.layout.adapter_view_layout, itemsList);
            listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(adapter);
        }
    }
}