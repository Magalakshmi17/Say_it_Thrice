package com.example.magalakshmi.say_it_thrice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Give_Details extends AppCompatActivity {
    ListView e1;
    EditText t3, t4;
    Button b2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    ListView lv;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
public int itempos;
    public String itemvalues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give__details);
        b2 = (Button) findViewById(R.id.button);
        t3 = (EditText) findViewById(R.id.editText3);
        t4 = (EditText) findViewById(R.id.editText4);
        e1=(ListView)findViewById(R.id.listView);
        ArrayList<String> your_array_list = new ArrayList<String>();
        your_array_list.add("TARUS");
        your_array_list.add("SCORPIO");
        your_array_list.add("LEO");
        your_array_list.add("CANCER");
        your_array_list.add("CAPRICORN");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
               android.R.layout.simple_list_item_1,
                your_array_list);

        e1.setAdapter(arrayAdapter);
        e1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              itempos=position;
                itemvalues=(String)e1.getItemAtPosition(itempos);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Name_list.class);
                intent.putExtra("star",itemvalues);
                startActivity(intent);


            }


        });
    }
}
