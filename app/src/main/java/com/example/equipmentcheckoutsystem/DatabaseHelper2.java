package com.example.equipmentcheckoutsystem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper2 extends SQLiteOpenHelper
{
    public static final String DATABASE_EQUIPMENT ="myList.db";
    public static final String TABLE_EQUIPMENT_LIST ="myList_data";
    public static final String COL_1_LIST ="ID";
    public static final String COL_2_LIST ="ITEM1";

    public DatabaseHelper2(Context context)
    {
        super(context, DATABASE_EQUIPMENT, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String createTable = "CREATE TABLE " + TABLE_EQUIPMENT_LIST + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "ITEM1 TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EQUIPMENT_LIST);
    }

    public boolean addData(String item1)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2_LIST, item1);

        long result = db.insert(TABLE_EQUIPMENT_LIST, null, contentValues);

        if (result == -1)
        {
            return false;
        }
        else {
            return true;
        }
    }

    public Cursor getListContents()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_EQUIPMENT_LIST, null);
        return data;
    }
}
