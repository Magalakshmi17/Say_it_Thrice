package com.example.magalakshmi.say_it_thrice;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Name_list extends AppCompatActivity {
    Button b5;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

EditText t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i=getIntent();
        String star=i.getStringExtra("star");
        BabyDB1 a=new BabyDB1(this);
        Cursor rs=a.Retrive(star);
        String girlname1="",girlname2="",girlname3="",girlname4="",girlname5="";
        String boyname1="",boyname2="",boyname3="",boyname4="",boyname5="";
        while(rs.moveToNext())
        {
         girlname1=rs.getString(1);
            girlname2=rs.getString(2);
            girlname3=rs.getString(3);
            girlname4=rs.getString(4);
            girlname5=rs.getString(5);
            boyname1=rs.getString(6);
            boyname2=rs.getString(7);
            boyname3=rs.getString(8);
            boyname4=rs.getString(9);
            boyname5=rs.getString(10);
        }
        t1=(EditText)findViewById(R.id.editText5);
        t1.setText(girlname1+"\t"+girlname2+"\t"+girlname3+"\n"+girlname4+"\t"+girlname5+"\n\n"+boyname1+"\t"+boyname2+"\t"+boyname3+"\n"+boyname4+"\t"+boyname5);
        b5 = (Button) findViewById(R.id.button);
        b5.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v){
                                      Intent intent = new Intent(Name_list.this, Lst_page.class);
                                      startActivity(intent);
                                  }
                              });
                setContentView(R.layout.activity_name_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

}
