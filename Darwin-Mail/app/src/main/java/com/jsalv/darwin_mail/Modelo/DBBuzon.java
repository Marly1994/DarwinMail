package com.jsalv.darwin_mail.Modelo;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Marly on 11/03/2017.
 */

public class DBBuzon extends SQLiteOpenHelper
{
    public static final String DB_NAME = "MyDBDarwin";
    private final String SCRIPT_TABLE_QUEJA= "create table Queja (" +
            "_id integer primary key autoincrement," +
            "descripcion text not null" +
            ")";
    private final String SCRIPT_TABLE_AREA= "create table Area (" +
            "_id integer primary key autoincrement," +
            "tipo text not null,"+
            "descripcion text not null" +
            ")";
    private final String SCRIPT_TABLE_ADMIN= "create table Admin (" +
            "_id integer primary key autoincrement," +
            "nombre text not null," +
            "correo text not null," +
            "telefono text not null" +
            ")";
    private final String SCRIPT_TABLE_ALUMNO= "create table Alumno (" +
            "_id integer primary key autoincrement," +
            "nombre text not null," +
            "noCtrl text not null," +
            "correo text not null," +
            "telefono text not null," +
            "carrera text not null," +
            "semestre integer not null," +
            "grupo text not null," +
            "turno text not null," +
            "aula text not null" +
            ")";
    private final String SCRIPT_TABLE_RESPUESTA= "create table Respuesta (" +
            "_id integer primary key autoincrement," +
            "_idQueja integer not null," +
            "_idArea integer not null," +
            "_idAlumno integer not null," +
            "_idAdmin integer  not null,"+
            "descripcion text not null,"+
            "Foreign Key (_idQueja) References Queja (_id),"+
            "Foreign Key (_idArea) References Area (_id),"+
            "Foreign Key (_idAlumno) References Alumno (_id),"+
            "Foreign Key (_idAdmin) References Admin (_id)"+
            ")";

    public static final String[] COLUMNAS_TABLE_QUEJA=
            new String[]{"_id", "descripcion"};
    public static final String TABLE_NAME_QUEJA = "Queja";

    public static final String[] COLUMNAS_TABLE_AREA=
            new String[]{"_id","tipo","descripcion"};
    public static final String TABLE_NAME_AREA = "Area";

    public static final String[] COLUMNAS_TABLE_ADMIN=
            new String[]{"_id", "nombre","correo","telefono"};
    public static final String TABLE_NAME_ADMIN = "Admin";

    public static final String[] COLUMNAS_TABLE_ALUMNO=
             new String[]{"_id", "nombre","noCtrl","correo","telefono","carrera","semestre","grupo","turno","aula"};
    public static final String TABLE_NAME_ALUMNO = "Alumno";

    public static final String[] COLUMNAS_TABLE_RESPUESTA=
            new String[]{"_id", "_idQueja","_idArea","_idAlumno","idAdmin","descripcion"};
    public static final String TABLE_NAME_RESPUESTA = "Respuesta";

    public DBBuzon(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DBBuzon(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
