package com.example.magalakshmi.say_it_thrice;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;

/**
 * Created by MAGA LAKSHMI on 3/7/2016.
 */
public class BabyDB1 extends SQLiteOpenHelper {
    public BabyDB1(Context context) {
        super(context,"BabyDB",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table babyname(s1 text,n1 text,n2 text,n3 text,n4 text,n5 text,n6 text,n7 text,n8 text,n9 text,n10 text");
        db.execSQL("insert into babyname values('TARUS','ANITHA','AFIA','ALIA','AMBIKA','AKILA','ANAND','ADAMS','ANDREW','ANEESH','ARIHANT'");
        db.execSQL("insert into babyname values('SCORPIO','SUNANDA','SAFIA','SITA','SAINDHAVI','SARIKA','SARAN','SANDEEP','SARAVAN','SABREESH','SAKTHI'");
        db.execSQL("insert into babyname values('LEO','TINA','TANU','TANVIKA','THIVYA','THARIKA','TARUN','TRILOK','TOM','TEJ',''TARIK");
        db.execSQL("insert into babyname values('CANCER','KATRINA','KARISHMA','KANNIKA','KUSH','KAMINI','KARAN','KARTHIK','KIRAN','KANNAN','KABALI'");
        db.execSQL("insert into babyname values('CAPRICORN','DIYA','DISHA','DANYA','DITHA','DHARINI','DEVAN','DAYANT',''DINESH','DMAODHAR','DARAN'");
        db.execSQL("create table login(pn text,pid text");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists babyname");
    }




       public Cursor Retrive(String star)
    {
       SQLiteDatabase db= getWritableDatabase();
        Cursor rs=db.rawQuery("select * from babyname where s1='"+star+"'",null);
        return rs;
    }
    public void Store(EditText pan, EditText paid)
    {
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL("insert into login values('"+pan+"','"+paid+"')",null);
    }
    public Cursor Retrive2(EditText pname)
    {
        SQLiteDatabase db= getWritableDatabase();
        Cursor rs1=db.rawQuery("select * from login where pn='"+pname+"'",null);
        return rs1;
    }
}
