package com.example.equipmentcheckoutsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ReportActivity extends AppCompatActivity
{
    private String powerDrillQty = "";
    private String skillSawQty = "";
    private String tapeMeasureQty = "";
    private String hammerQty = "";
    private String socketWrenchQty = "";
    private String jackHammerQty = "";
    private String toolBeltQty = "";
    private String laserSightQty = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
    }
}