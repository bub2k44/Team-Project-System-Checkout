package com.example.equipmentcheckoutsystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ThreeColumn_ListAdapter extends ArrayAdapter<Item>
{
    private LayoutInflater mInflator;
    private ArrayList<Item> items;
    private int mViewResourceId;

    public ThreeColumn_ListAdapter(Context _context, int _textViewResourceId, ArrayList<Item> _items)
    {
        super(_context, _textViewResourceId, _items);
        this.items = _items;
        mInflator = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = _textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parents)
    {
        convertView = mInflator.inflate(mViewResourceId, null);

        Item item = items.get(position);

        if (item != null)
        {
            TextView name = (TextView) convertView.findViewById(R.id.textName);
            TextView price = (TextView) convertView.findViewById(R.id.textPrice);
            TextView quantity = (TextView) convertView.findViewById(R.id.textQuantity);

            if (name != null)
            {
                name.setText(item.getName());
            }
            if (price != null)
            {
                price.setText(item.getPrice());
            }
            if (quantity != null)
            {
                quantity.setText(item.getQuantity());
            }
        }

        return  convertView;
    }
}
