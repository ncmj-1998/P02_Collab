package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Module> modules;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModule);
        tvYear = (TextView) findViewById(R.id.tvYear);
        modules = new ArrayList<Module>();

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        if (year.equalsIgnoreCase("Year 1")){
            Module m1 = new Module("C105",true);
            Module m2 = new Module("A113",false);
            Module m3 = new Module("G101",false);
            modules.add(m1);
            modules.add(m2);
            modules.add(m3);

        }else if(year.equalsIgnoreCase("Year 2")){
            Module m1 = new Module("C200",false);
            Module m2 = new Module("C208",true);
            Module m3 = new Module("C346",true);
            modules.add(m1);
            modules.add(m2);
            modules.add(m3);
        }else{
            Module m1 = new Module("C347",true);
            Module m2 = new Module("C313",true);
            Module m3 = new Module("C111",true);
            modules.add(m1);
            modules.add(m2);
            modules.add(m3);
        }

        ArrayAdapter aa = new ModuleAdapter(this,R.layout.row,modules);
        lv.setAdapter(aa);


    }



}
