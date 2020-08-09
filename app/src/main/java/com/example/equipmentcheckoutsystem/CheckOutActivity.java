package com.example.equipmentcheckoutsystem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class CheckOutActivity extends AppCompatActivity
{

    private String powerDrillQty = "";
    private String skillSawQty = "";
    private String tapeMeasureQty = "";
    private String hammerQty = "";
    private String socketWrenchQty = "";
    private String jackHammerQty = "";
    private String toolBeltQty = "";
    private String laserSightQty = "";

    private ArrayList<String> data_0 = new ArrayList<String>();
    private ArrayList<String> data_1 = new ArrayList<String>();
    private ArrayList<String> data_2 = new ArrayList<String>();
    private ArrayList<String> data_3 = new ArrayList<String>();

    TableLayout table;

    EditText ed_1, ed_2;

    CheckBox ch_1, ch_2, ch_3, ch_4, ch_5, ch_6, ch_7, ch_8;

    Button b_1, b_2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);

        ch_1 = findViewById(R.id.chk1);
        ch_2 = findViewById(R.id.chk2);
        ch_3 = findViewById(R.id.chk3);
        ch_4 = findViewById(R.id.chk4);
        ch_5 = findViewById(R.id.chk5);
        ch_6 = findViewById(R.id.chk6);
        ch_7 = findViewById(R.id.chk7);
        ch_8 = findViewById(R.id.chk8);

        ed_1 = findViewById(R.id.txtSub);

        b_1 = findViewById(R.id.btn1);
        b_2 = findViewById(R.id.btn2);

        b_1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Sales();
            }
        });

        b_2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int sum = 0;

                for (int a = 0; a < data_3.size(); a++)
                {
                    sum = sum + Integer.parseInt(data_3.get(a).toString());
                }

                ed_1.setText(String.valueOf(sum));
            }
        });
    }

    public void Sales()
    {
        if (ch_1.isChecked())
        {
            final TableRow row = new TableRow(this);
            final TextView t1 = new TextView(this);
            final TextView t2 = new TextView(this);
            final TextView t3 = new TextView(this);
            final TextView t4 = new TextView(this);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Enter Quantity");
            final EditText input = new EditText(this);
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            builder.setView(input);

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    String powerDrill = ch_1.getText().toString();
                    int powerDrillPrice = 20;
                    powerDrillQty = input.getText().toString();
                    int tot = powerDrillPrice * Integer.parseInt(powerDrillQty);
                    data_0.add(powerDrill);
                    data_1.add(String.valueOf(powerDrillPrice));
                    data_2.add(String.valueOf(powerDrillQty));
                    data_3.add(String.valueOf(tot));
                    TableLayout table = findViewById(R.id.tb1);
                    String total;

                    for (int i = 0; i < data_0.size(); i++)
                    {
                        String pName = data_0.get(i);
                        String prc = data_1.get(i);
                        String qty = data_2.get(i);
                        total = data_3.get(i);

                        t1.setText(pName);
                        t2.setText(prc);
                        t3.setText(qty);
                        t4.setText(total);
                    }

                    row.addView(t1);
                    row.addView(t2);
                    row.addView(t3);
                    row.addView(t4);
                    table.addView(row);
                }
            });

            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    dialog.cancel();
                }
            });

            builder.show();
        }

        else if (ch_2.isChecked())
        {
            final TableRow row = new TableRow(this);
            final TextView t1 = new TextView(this);
            final TextView t2 = new TextView(this);
            final TextView t3 = new TextView(this);
            final TextView t4 = new TextView(this);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Enter Quantity");
            final EditText input = new EditText(this);
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            builder.setView(input);

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    String skillSaw = ch_2.getText().toString();
                    int skillSawPrice = 20;
                    skillSawQty = input.getText().toString();
                    int tot = skillSawPrice * Integer.parseInt(skillSawQty);
                    data_0.add(skillSaw);
                    data_1.add(String.valueOf(skillSawPrice));
                    data_2.add(String.valueOf(skillSawQty));
                    data_3.add(String.valueOf(tot));
                    TableLayout table = findViewById(R.id.tb1);
                    String total;

                    for (int i = 0; i < data_0.size(); i++)
                    {
                        String pName = data_0.get(i);
                        String prc = data_1.get(i);
                        String qty = data_2.get(i);
                        total = data_3.get(i);
                        t1.setText(pName);
                        t2.setText(prc);
                        t3.setText(qty);
                        t4.setText(total);
                    }

                    row.addView(t1);
                    row.addView(t2);
                    row.addView(t3);
                    row.addView(t4);
                    table.addView(row);
                }
            });

            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    dialog.cancel();
                }
            });

            builder.show();
        }

        else if (ch_3.isChecked())
        {
            final TableRow row = new TableRow(this);
            final TextView t1 = new TextView(this);
            final TextView t2 = new TextView(this);
            final TextView t3 = new TextView(this);
            final TextView t4 = new TextView(this);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Enter Quantity");
            final EditText input = new EditText(this);
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            builder.setView(input);

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    String tapeMeasure = ch_3.getText().toString();
                    int tapeMeasurePrice = 20;
                    tapeMeasureQty = input.getText().toString();
                    int tot = tapeMeasurePrice * Integer.parseInt(tapeMeasureQty);
                    data_0.add(tapeMeasure);
                    data_1.add(String.valueOf(tapeMeasurePrice));
                    data_2.add(String.valueOf(tapeMeasureQty));
                    data_3.add(String.valueOf(tot));
                    TableLayout table = findViewById(R.id.tb1);
                    String total;

                    for (int i = 0; i < data_0.size(); i++)
                    {
                        String pName = data_0.get(i);
                        String prc = data_1.get(i);
                        String qty = data_2.get(i);
                        total = data_3.get(i);
                        t1.setText(pName);
                        t2.setText(prc);
                        t3.setText(qty);
                        t4.setText(total);
                    }

                    row.addView(t1);
                    row.addView(t2);
                    row.addView(t3);
                    row.addView(t4);
                    table.addView(row);
                }
            });

            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    dialog.cancel();
                }
            });

            builder.show();
        }
    }
}
