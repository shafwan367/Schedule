package com.example.scheduleapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    private Context context;

    private final static String DATABASES_NAME = "Schedule_App";
    private final static int DATABASES_VERSION = 1;

    private final static String MY_TABLE = "Schedule";
    private final static String COLUMN_ID = "id";
    private final static String COLUMN_TITLE = "title";
    private final static String COLUMN_DESC = "desc";


    public MyDatabaseHelper(@Nullable Context context) {
        super(context, DATABASES_NAME, null, DATABASES_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE " + MY_TABLE + " ( " + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_TITLE + "TEXT, " + COLUMN_DESC + "TEXT)";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
