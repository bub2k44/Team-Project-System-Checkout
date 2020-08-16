package com.example.equipmentcheckoutsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity
{
    Button mButtonEquipment;
    Button mButtonMaterials;
    Button mButtonCheckIn;
    Button mButtonReceipt;
    Button mButtonLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        mButtonEquipment = findViewById(R.id.button_equipment);
        mButtonMaterials = findViewById(R.id.button_materials);
        mButtonCheckIn = findViewById(R.id.button_check_in);
        mButtonReceipt = findViewById(R.id.button_print_receipt);
        mButtonLogOut = findViewById(R.id.button_log_out);

        mButtonEquipment.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent equipment = new Intent(MainMenuActivity.this, EquipmentDepartmentActivity.class);
                startActivity(equipment);
            }
        });

        mButtonMaterials.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent materials = new Intent(MainMenuActivity.this, MaterialsDepartmentActivity.class);
                startActivity(materials);
            }
        });

//        mButtonReceipt.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                Intent receipt = new Intent(MainMenuActivity.this, PrintReceiptActivity.class);
//                startActivity(receipt);
//            }
//        });

        mButtonLogOut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent logOut = new Intent(MainMenuActivity.this, LoginActivity.class);
                startActivity(logOut);
            }
        });
    }
}
