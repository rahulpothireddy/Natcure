package com.example.natcure.natcure;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper
{
    SQLiteDatabase db;

    ContentValues contentValues;

    ArrayList<String> str;

    public static final String DATABASE_NAME="natcureremedies.db";

    public DatabaseHelper(Context context)
    {
        super(context,DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        sqLiteDatabase.execSQL("CREATE TABLE parts_table ( ID INTEGER PRIMARY KEY AUTOINCREMENT,PNAME TEXT )");
        sqLiteDatabase.execSQL("CREATE TABLE remedy_table ( ID INTEGER PRIMARY KEY AUTOINCREMENT,PID INTEGER,SYM TEXT,REM TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS parts_table");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS remedy_table");
        onCreate(sqLiteDatabase);
    }

    public void insertPartsData(String part)
    {
        db=this.getWritableDatabase();
        contentValues=new ContentValues();
        contentValues.put("PNAME",part);
        db.insert("parts_table",null,contentValues);
    }

    public void insertRemedyData(long gid,String name,String remedy)
    {
        db=this.getWritableDatabase();
        contentValues=new ContentValues();
        contentValues.put("PID",gid);
        contentValues.put("SYM",name);
        contentValues.put("REM",remedy);
        db.insert("remedy_table",null,contentValues);
    }

    public ArrayList<String> getRemedy(String[] symList)
    {
        db=this.getWritableDatabase();
        str=new ArrayList<>();
        Cursor res=db.rawQuery("SELECT DISTINCT REM FROM remedy_table WHERE PID IN"+
                        "(SELECT ID FROM parts_table WHERE PNAME=\""+symList[0]+
                        "\") AND (SYM=\""+symList[1]+"\" OR SYM=\""+symList[2]+"\" OR SYM=\""+symList[3]+"\")"
                ,null);

        while(res.moveToNext())
        {
            str.add(res.getString(res.getColumnIndex("REM")));
        }
        return str;
    }
}
