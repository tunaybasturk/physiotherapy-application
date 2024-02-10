package com.tunay.physiotheraphyapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonToken;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {



    public DBHelper(Context context) {
        super(context,"Physiotheraphy.db",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE menu(id INTEGER primary key, area VARCHAR, image BLOB)");
        db.execSQL("CREATE TABLE boyun(id INTEGER primary key,menuId INTEGER,comment VARCHAR, image BLOB)");
        db.execSQL("CREATE TABLE omuz(id INTEGER primary key,menuId INTEGER,comment VARCHAR, image BLOB)");
        db.execSQL("CREATE TABLE bel(id INTEGER primary key,menuId INTEGER,comment VARCHAR, image BLOB)");
        db.execSQL("CREATE TABLE kalca(id INTEGER primary key,menuId INTEGER,comment VARCHAR, image BLOB)");
        db.execSQL("CREATE TABLE diz(id INTEGER primary key,menuId INTEGER,comment VARCHAR, image BLOB)");
        db.execSQL("CREATE TABLE ayak(id INTEGER primary key,menuId INTEGER,comment VARCHAR, image BLOB)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS menu");
        db.execSQL("DROP TABLE IF EXISTS boyun");
        db.execSQL("DROP TABLE IF EXISTS omuz");
        db.execSQL("DROP TABLE IF EXISTS bel");
        db.execSQL("DROP TABLE IF EXISTS kalca");
        db.execSQL("DROP TABLE IF EXISTS diz");
        db.execSQL("DROP TABLE IF EXISTS ayak");
        onCreate(db);
    }



    public ArrayList<Exercise> get_data_exercise(String Tablename,int position){
        ArrayList<Exercise> exercises = new ArrayList<Exercise>();

        try{
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor cursor = db.rawQuery("SELECT * FROM "+Tablename+" WHERE id=?",new String[]{String.valueOf(position)});
            int commentIx = cursor.getColumnIndex("comment");
            int imageIx = cursor.getColumnIndex("image");


            while(cursor.moveToNext()){

                String comment = cursor.getString(commentIx);
                byte[] bytes = cursor.getBlob(imageIx);
                System.out.println("comment");
                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes,0,bytes.length);
                Exercise exercise = new Exercise(comment,bitmap);
                exercises.add(exercise);

            }

            cursor.close();


        }

        catch (Exception e){
            e.printStackTrace();
        }
        return exercises;



    }




    public ArrayList<Menu> get_data_menu(){

        ArrayList<Menu> menu = new ArrayList<Menu>();

        try{
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor cursor = db.rawQuery("SELECT * FROM menu",null);
            int areaNameIx = cursor.getColumnIndex("area");
            int imageIx = cursor.getColumnIndex("image");


            while(cursor.moveToNext()){

                String areaname = cursor.getString(areaNameIx);
                byte[] bytes = cursor.getBlob(imageIx);
                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes,0,bytes.length);
                Menu menuholder = new Menu(areaname,bitmap);
                menu.add(menuholder);

            }

            cursor.close();


        }

        catch (Exception e){
            e.printStackTrace();
        }
        return menu;
    }

    public void add_data_boyun(int menuID , String comment, Bitmap imagename){
        SQLiteDatabase db = this.getWritableDatabase();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        imagename.compress(Bitmap.CompressFormat.PNG,50,outputStream);
        byte[] byteArray = outputStream.toByteArray();


        try{
            String sqlString = "INSERT INTO boyun(menuId,comment,image) VALUES(?, ?, ?)";
            SQLiteStatement sqLiteStatement = db.compileStatement(sqlString);
            sqLiteStatement.bindString(1, String.valueOf(menuID));
            sqLiteStatement.bindString(2,comment);
            sqLiteStatement.bindBlob(3,byteArray);
            sqLiteStatement.execute();
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void add_data_omuz(int menuID , String comment, Bitmap imagename){
        SQLiteDatabase db = this.getWritableDatabase();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        imagename.compress(Bitmap.CompressFormat.PNG,50,outputStream);
        byte[] byteArray = outputStream.toByteArray();


        try{
            String sqlString = "INSERT INTO omuz(menuId,comment,image) VALUES(?, ?, ?)";
            SQLiteStatement sqLiteStatement = db.compileStatement(sqlString);
            sqLiteStatement.bindString(1, String.valueOf(menuID));
            sqLiteStatement.bindString(2,comment);
            sqLiteStatement.bindBlob(3,byteArray);
            sqLiteStatement.execute();
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void add_data_bel(int menuID , String comment, Bitmap imagename){
        SQLiteDatabase db = this.getWritableDatabase();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        imagename.compress(Bitmap.CompressFormat.PNG,50,outputStream);
        byte[] byteArray = outputStream.toByteArray();


        try{
            String sqlString = "INSERT INTO bel(menuId,comment,image) VALUES(?, ?, ?)";
            SQLiteStatement sqLiteStatement = db.compileStatement(sqlString);
            sqLiteStatement.bindString(1, String.valueOf(menuID));
            sqLiteStatement.bindString(2,comment);
            sqLiteStatement.bindBlob(3,byteArray);
            sqLiteStatement.execute();
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void add_data_kalca(int menuID , String comment, Bitmap imagename){
        SQLiteDatabase db = this.getWritableDatabase();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        imagename.compress(Bitmap.CompressFormat.PNG,50,outputStream);
        byte[] byteArray = outputStream.toByteArray();


        try{
            String sqlString = "INSERT INTO kalca(menuId,comment,image) VALUES(?, ?, ?)";
            SQLiteStatement sqLiteStatement = db.compileStatement(sqlString);
            sqLiteStatement.bindString(1, String.valueOf(menuID));
            sqLiteStatement.bindString(2,comment);
            sqLiteStatement.bindBlob(3,byteArray);
            sqLiteStatement.execute();
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void add_data_diz(int menuID , String comment, Bitmap imagename){
        SQLiteDatabase db = this.getWritableDatabase();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        imagename.compress(Bitmap.CompressFormat.PNG,50,outputStream);
        byte[] byteArray = outputStream.toByteArray();


        try{
            String sqlString = "INSERT INTO diz(menuId,comment,image) VALUES(?, ?, ?)";
            SQLiteStatement sqLiteStatement = db.compileStatement(sqlString);
            sqLiteStatement.bindString(1, String.valueOf(menuID));
            sqLiteStatement.bindString(2,comment);
            sqLiteStatement.bindBlob(3,byteArray);
            sqLiteStatement.execute();
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void add_data_ayak(int menuID , String comment, Bitmap imagename){
        SQLiteDatabase db = this.getWritableDatabase();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        imagename.compress(Bitmap.CompressFormat.PNG,50,outputStream);
        byte[] byteArray = outputStream.toByteArray();


        try{
            String sqlString = "INSERT INTO ayak(menuId,comment,image) VALUES(?, ?, ?)";
            SQLiteStatement sqLiteStatement = db.compileStatement(sqlString);
            sqLiteStatement.bindString(1, String.valueOf(menuID));
            sqLiteStatement.bindString(2,comment);
            sqLiteStatement.bindBlob(3,byteArray);
            sqLiteStatement.execute();
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }


    public void add_data_menu(String areaname, Bitmap imagename){

        SQLiteDatabase db = this.getWritableDatabase();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        imagename.compress(Bitmap.CompressFormat.PNG,50,outputStream);
        byte[] byteArray = outputStream.toByteArray();


        try{
            String sqlString = "INSERT INTO menu(area,image) VALUES(?, ?)";
            SQLiteStatement sqLiteStatement = db.compileStatement(sqlString);
            sqLiteStatement.bindString(1,areaname);
            sqLiteStatement.bindBlob(2,byteArray);
            sqLiteStatement.execute();
        }

        catch (Exception e){
            e.printStackTrace();
        }

    }

    public void delete_table_menu(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("menu",null,null);
    }

    public void delete_table_boyun(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("boyun",null,null);
    }

    public  void delete_table_row_kalca(int idrow){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("kalca",  "id=?", new String[]{String.valueOf(idrow)});

    }

    public  void delete_table_row_omuz(int idrow){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("omuz",  "id=?", new String[]{String.valueOf(idrow)});

    }
    public  void delete_table_row_diz(int idrow){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("diz",  "id=?", new String[]{String.valueOf(idrow)});

    }

    public  void delete_table_row_ayak(int idrow){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("ayak",  "id=?", new String[]{String.valueOf(idrow)});

    }

    public void update_table_menu(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE menu SET area='Kalça Egzersizleri' WHERE id=4 ");
    }





}

