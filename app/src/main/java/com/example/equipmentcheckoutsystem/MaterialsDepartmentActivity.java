package com.example.equipmentcheckoutsystem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
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

public class MaterialsDepartmentActivity extends AppCompatActivity
{
    DatabaseHelper2 myDB;

    private String pineWoodQty = "";
    private String nailsQty = "";
    private String screwsQty = "";
    private String sheetRockQty = "";
    private String paintQty = "";
    private String nutsAndBoltsQty = "";
    private String plywoodQty = "";
    private String cementBricksQty = "";

    private ArrayList<String> data_0 = new ArrayList<String>();
    private ArrayList<String> data_1 = new ArrayList<String>();
    private ArrayList<String> data_2 = new ArrayList<String>();
    private ArrayList<String> data_3 = new ArrayList<String>();

    TableLayout table;

    EditText ed_1, ed_2;

    CheckBox ch_1, ch_2, ch_3, ch_4, ch_5, ch_6, ch_7, ch_8;

    Button b_1, b_2;
    Button main;

    public void AddData(String newEntry1, String newEntry2, String newEntry3)
    {
        boolean insertData = myDB.addData(newEntry1, newEntry2, newEntry3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materials_department);

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
        main = findViewById(R.id.btn_main_menu);

        b_1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                checkOut();
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

        main.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent main = new Intent(MaterialsDepartmentActivity.this, MainMenuActivity.class);
                startActivity(main);
            }
        });
    }

    public void checkOut()
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
                    String pineWood = ch_1.getText().toString();
                    int pineWoodPrice = 20;
                    pineWoodQty = input.getText().toString();
                    int tot = pineWoodPrice * Integer.parseInt(pineWoodQty);
                    data_0.add(pineWood);
                    data_1.add(String.valueOf(pineWoodPrice));
                    data_2.add(String.valueOf(pineWoodQty));
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

                        //AddData(pName, prc, qty);
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
                    String nails = ch_2.getText().toString();
                    int nailsPrice = 5;
                    nailsQty = input.getText().toString();
                    int tot = nailsPrice * Integer.parseInt(nailsQty);
                    data_0.add(nails);
                    data_1.add(String.valueOf(nailsPrice));
                    data_2.add(String.valueOf(nailsQty));
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

                        //AddData(pName, prc, qty);
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
                    String screws = ch_3.getText().toString();
                    int screwsPrice = 6;
                    screwsQty = input.getText().toString();
                    int tot = screwsPrice * Integer.parseInt(screwsQty);
                    data_0.add(screws);
                    data_1.add(String.valueOf(screwsPrice));
                    data_2.add(String.valueOf(screwsQty));
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

                        //AddData(pName, prc, qty);
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

        else if (ch_4.isChecked())
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
                    String sheetRock = ch_4.getText().toString();
                    int sheetRockPrice = 50;
                    sheetRockQty = input.getText().toString();
                    int tot = sheetRockPrice * Integer.parseInt(sheetRockQty);
                    data_0.add(sheetRock);
                    data_1.add(String.valueOf(sheetRockPrice));
                    data_2.add(String.valueOf(sheetRockQty));
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

                        //AddData(pName, prc, qty);
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

        else if (ch_5.isChecked())
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
                    String paint = ch_5.getText().toString();
                    int paintPrice = 8;
                    paintQty = input.getText().toString();
                    int tot = paintPrice * Integer.parseInt(paintQty);
                    data_0.add(paint);
                    data_1.add(String.valueOf(paintPrice));
                    data_2.add(String.valueOf(paintQty));
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

                        //AddData(pName, prc, qty);
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

        else if (ch_6.isChecked())
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
                    String nutsAndBolts = ch_6.getText().toString();
                    int nutsAndBoltsPrice = 3;
                    nutsAndBoltsQty = input.getText().toString();
                    int tot = nutsAndBoltsPrice * Integer.parseInt(nutsAndBoltsQty);
                    data_0.add(nutsAndBolts);
                    data_1.add(String.valueOf(nutsAndBoltsPrice));
                    data_2.add(String.valueOf(nutsAndBoltsQty));
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

                        //AddData(pName, prc, qty);
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

        else if (ch_7.isChecked())
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
                    String plywood = ch_7.getText().toString();
                    int plywoodPrice = 25;
                    plywoodQty = input.getText().toString();
                    int tot = plywoodPrice * Integer.parseInt(plywoodQty);
                    data_0.add(plywood);
                    data_1.add(String.valueOf(plywoodPrice));
                    data_2.add(String.valueOf(plywoodQty));
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

                        //AddData(pName, prc, qty);
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

        else if (ch_8.isChecked())
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
                    String cementBricks = ch_8.getText().toString();
                    int cementBricksPrice = 25;
                    cementBricksQty = input.getText().toString();
                    int tot = cementBricksPrice * Integer.parseInt(cementBricksQty);
                    data_0.add(cementBricks);
                    data_1.add(String.valueOf(cementBricksPrice));
                    data_2.add(String.valueOf(cementBricksQty));
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

                        //AddData(pName, prc, qty);
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