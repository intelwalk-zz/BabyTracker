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
    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
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
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void addEvent(Event event){
        ContentValues values = new ContentValues();
        values.put(COLUMN_EVENTNAME, event.get_eventname());
        values.put(COLUMN_EVENTDATE, event.get_eventdate());
        values.put(COLUMN_EVENTTIME, event.get_eventtime());
        values.put(COLUMN_EVENTCOMMENTS, event.get_eventcomments());
        values.put(COLUMN_CRYINGTYPE, event.get_cryingtype());
        values.put(COLUMN_WETDIRTYDIAPER, event.get_wetdirtydiaper());
        values.put(COLUMN_DIAPERRASH, event.get_diaperrash());
        values.put(COLUMN_NURSINGORFOOD, event.get_nursingorfood());
        values.put(COLUMN_NURSINGLORR, event.get_nursinglorr());
        values.put(COLUMN_TABLEORBABYFOOD, event.get_tableorbabyfood());
        values.put(COLUMN_TEMPERATURETYPE, event.get_temperaturetype());
        values.put(COLUMN_TEMPERATURENUMBER, event.get_temperaturenumber());
        values.put(COLUMN_NAPORNIGHTSSLEEP, event.get_napornightssleep());
        values.put(COLUMN_NAPSLEEPDURATION, event.get_napsleepduration());
        values.put(COLUMN_HAIRWASH, event.get_hairwash());

        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_NAME,null,values);
        db.close();
    }

    public void deleteEvent(Event event){

    }

    public String databaseToString(){
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME + " WHERE 1";

        //Cursor points to a location in your results
        Cursor c = db.rawQuery(query, null);
        //Move to the first row in your results
        c.moveToFirst();

        //Position after the last row means the end of the results
        while (!c.isAfterLast()) {
            if (c.getString(c.getColumnIndex("eventname")) != null) {
                dbString += c.getString(c.getColumnIndex("eventname"));
                dbString += "\n";
            }
            c.moveToNext();
        }
        db.close();
        return dbString;
    }
}
