package myapplicationishello.com.example.hsport.sch_app;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Surendra on 12/05/16.
 */
public class Student extends AppCompatActivity {
    EditText et6, et7, et8, et9, et10, et11, et12;
    SQLiteDatabase dBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_main);
        dBase = openOrCreateDatabase("emp_db", Context.MODE_PRIVATE, null);
        dBase.execSQL("create table if not exists emp(id number,name varchar(100),desig varchar(100),dept varchar(100))");
        et6  = (EditText)findViewById(R.id.editText6);
        et7  = (EditText)findViewById(R.id.editText7);
        et8  = (EditText)findViewById(R.id.editText8);
        et9  = (EditText)findViewById(R.id.editText9);
        et10 = (EditText)findViewById(R.id.editText10);
        et11 = (EditText)findViewById(R.id.editText11);
        et12 = (EditText)findViewById(R.id.editText12);
    }
    public void submit(View v) {
        ContentValues values = new ContentValues();
        values.put("Enter Sur Name", et6.getText().toString());
        values.put("Enter  Name", et7.getText().toString());
        values.put("SSC School Name", et8.getText().toString());
        values.put("Intermediate College Name", et9.getText().toString());
        values.put("X class percentage", Integer.parseInt(et10.getText().toString()));
        values.put("XII percentage", Integer.parseInt(et11.getText().toString()));
        values.put("Enter Gender", et12.getText().toString());
        long count = dBase.insert("emp", null, values);
        if (count > 0) {
            Toast.makeText(getApplicationContext(), " details is successfully submitted", Toast.LENGTH_LONG).show();
            et6.setText("");
            et7.setText("");
            et8.setText("");
            et9.setText("");
            et10.setText("");
            et11.setText("");
            et12.setText("");
        } else {
            Toast.makeText(getApplicationContext(), "details is  successfully submitted", Toast.LENGTH_LONG).show();
        }
    }
    public  void next(View v){
        Intent i=new Intent();
        i.setComponent(new ComponentName(getApplicationContext(),Second.class));
        startActivity(i);
    }
}

