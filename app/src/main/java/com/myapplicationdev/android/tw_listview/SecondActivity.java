package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModule);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        if (year.equalsIgnoreCase("Year 1")){

        }else if(year.equalsIgnoreCase("Year 2")){
            Module m1 = new Module("C200",false);
            Module m2 = new Module("C208",true);
            Module m3 = new Module("C346",true);
        }else{

        }


    }



}
