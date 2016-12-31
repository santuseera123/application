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
public class Third extends AppCompatActivity {
    EditText et21, et22, et23, et24;
    SQLiteDatabase dBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_main);
        dBase = openOrCreateDatabase("emp_db", Context.MODE_PRIVATE, null);
        dBase.execSQL("create table if not exists emp(id number,name varchar(100),desig varchar(100),dept varchar(100))");
        et21 = (EditText)findViewById(R.id.editText21);
        et22 = (EditText)findViewById(R.id.editText22);
        et23 = (EditText)findViewById(R.id.editText23);
        et24 = (EditText)findViewById(R.id.editText24);
    }
      public void submit(View v) {
        ContentValues values = new ContentValues();
        values.put("Annual Income", Integer.parseInt(et21.getText().toString()));
        values.put("Parent/Garden Occupation", et22.getText().toString());
        values.put("Any Income From Other Sources", et23.getText().toString());
        values.put("parents live or Not ", et24.getText().toString());
        long count = dBase.insert("emp", null, values);
        if (count > 0) {
            Toast.makeText(getApplicationContext(), " details is successfully submitted", Toast.LENGTH_LONG).show();
            et21.setText("");
            et22.setText("");
            et23.setText("");
            et24.setText("");
        } else {
            Toast.makeText(getApplicationContext(), "details is  successfully submitted", Toast.LENGTH_LONG).show();
        }
    }
}