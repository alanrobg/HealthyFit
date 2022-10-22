package com.alanrobg.healthyfit_v1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;





public class Database extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Registro.db";
    public static final String TABLE_NAME="usuario_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "email";
    public static final String COL_4 = "contraseña";
    public static final String COL_5 = "edad";
    public static final String COL_6 = "sexo";
    public static final String COL_7 = "objetivo";

    public Database(Context context) {
        super(context, DATABASE_NAME, null,1);
        SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL("CREATE TABLE " +TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT,email TEXT, contraseña TEXT, edad TEXT, objetivo INTEGER)");
    db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
