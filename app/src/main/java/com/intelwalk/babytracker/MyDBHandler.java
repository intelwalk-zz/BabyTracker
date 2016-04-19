package com.intelwalk.babytracker;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;

public class MyDBHandler extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "eventDB.db";
    public static final String TABLE_NAME = "events";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_EVENTNAME = "eventname";
    public static final String COLUMN_EVENTDATE = "eventdate";
    public static final String COLUMN_EVENTTIME = "eventtime";
    public static final String COLUMN_EVENTCOMMENTS = "eventcomments";
    public static final String COLUMN_CRYINGTYPE = "cryingtype";
    public static final String COLUMN_WETDIRTYDIAPER = "wetdirtydiaper";
    public static final String COLUMN_DIAPERRASH = "diaperrash";
    public static final String COLUMN_NURSINGORFOOD = "nursingorfood";
    public static final String COLUMN_NURSINGLORR = "nursinglorr";
    public static final String COLUMN_TABLEORBABYFOOD = "tableorbabyfood";
    public static final String COLUMN_TEMPERATURETYPE = "temperaturetype";
    public static final String COLUMN_TEMPERATURENUMBER = "temperaturenumber";
    public static final String COLUMN_NAPORNIGHTSSLEEP = "napornightssleep";
    public static final String COLUMN_NAPSLEEPDURATION = "napsleepduration";
    public static final String COLUMN_HAIRWASH = "hairwash";

    //We need to pass database information along to the superclass
    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory, int version){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String query = "CREATE TABLE " + TABLE_NAME + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_EVENTNAME + " TEXT " +
                COLUMN_EVENTDATE + " TEXT " +
                COLUMN_EVENTTIME + " TEXT " +
                COLUMN_EVENTCOMMENTS + " TEXT " +
                COLUMN_CRYINGTYPE + " TEXT " +
                COLUMN_WETDIRTYDIAPER + " INTEGER " +
                COLUMN_DIAPERRASH + " INTEGER " +
                COLUMN_NURSINGORFOOD + " INTEGER " +
                COLUMN_NURSINGLORR + " INTEGER " +
                COLUMN_TABLEORBABYFOOD + " INTEGER " +
                COLUMN_TEMPERATURETYPE + " TEXT " +
                COLUMN_TEMPERATURENUMBER + " REAL " +
                COLUMN_NAPORNIGHTSSLEEP + " INTEGER " +
                COLUMN_NAPSLEEPDURATION + " TEXT " +
                COLUMN_HAIRWASH + " INTEGER " +
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
