package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module> {

    private ArrayList<Module> module;
    private Context context;
    private TextView tvCode;
    private ImageView ivProj;

    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
       module = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvCode = (TextView) rowView.findViewById(R.id.tvCode);
        // Get the ImageView object
        ivProj = (ImageView) rowView.findViewById(R.id.ivProg);

        Module currentFood = module.get(position);

        // Set the image to star or nostar accordingly
        if(currentFood.isProj()) {
            ivProj.setImageResource(R.drawable.prog);
        }
        else {
            ivProj.setImageResource(R.drawable.nonprog);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }

}
