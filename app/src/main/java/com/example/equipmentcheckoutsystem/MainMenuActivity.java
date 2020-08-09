package com.example.equipmentcheckoutsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity
{
    Button mButtonCheckOut;
    Button mButtonCheckIn;
    Button mButtonReceipt;
    Button mButtonLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        mButtonCheckOut = findViewById(R.id.button_checkOut);
        mButtonCheckIn = findViewById(R.id.button_checkIn);
        mButtonReceipt = findViewById(R.id.button_print_receipt);
        mButtonLogOut = findViewById(R.id.button_log_out);

        mButtonCheckOut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent checkOut = new Intent(MainMenuActivity.this, CheckOutActivity.class);
                startActivity(checkOut);
            }
        });

        mButtonCheckIn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent checkIn = new Intent(MainMenuActivity.this, CheckInActivity.class);
                startActivity(checkIn);
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
