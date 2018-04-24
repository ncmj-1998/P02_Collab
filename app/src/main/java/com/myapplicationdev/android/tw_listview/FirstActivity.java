package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView listViev;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViev = (ListView) findViewById(R.id.lv);


        al = new ArrayList<String>();
        al.add("Year 1");
        al.add("Year 2");
        al.add("Year 3");

        //bind data source to ListView
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, al);

        //complete the binding
        listViev.setAdapter(adapter);

        listViev.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedYear = al.get(position);

                Intent intentNewAct = new Intent(getBaseContext(), SecondActivity.class);
                intentNewAct.putExtra("year",selectedYear);
                startActivity(intentNewAct);


            }
        });






    }
}
