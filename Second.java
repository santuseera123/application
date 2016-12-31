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
public class Second extends AppCompatActivity {
    EditText et13, et14, et15, et16, et17, et18, et19, et20;
    SQLiteDatabase dBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);
        dBase =openOrCreateDatabase("emp_db", Context.MODE_PRIVATE,null);
        dBase.execSQL("create table if not exists emp(id number,name varchar(100),desig varchar(100),dept varchar(100))");
        et13  = (EditText)findViewById(R.id.editText13);
        et14  = (EditText)findViewById(R.id.editText14);
        et15  = (EditText)findViewById(R.id.editText15);
        et16  = (EditText)findViewById(R.id.editText16);
        et17  = (EditText)findViewById(R.id.editText17);
        et18  = (EditText)findViewById(R.id.editText18);
        et19  = (EditText)findViewById(R.id.editText19);
        et20  = (EditText)findViewById(R.id.editText20);
    }
    public void submit(View v) {
        ContentValues values = new ContentValues();
        values.put("Home No",Integer.parseInt( et13.getText().toString()));
        values.put("Enter Street", et14.getText().toString());
        values.put("Enetr Village Name", et15.getText().toString());
        values.put("Enter post", et16.getText().toString());
        values.put("Enter Mandal", et17.getText().toString());
        values.put("Enter District Name",et18.getText().toString());
        values.put("Enter State Name", et19.getText().toString());
        values.put("Enter PIN",Integer.parseInt(et20.getText().toString()));
        long count = dBase.insert("emp", null, values);
        if (count > 0) {
            Toast.makeText(getApplicationContext(), " details is successfully submitted", Toast.LENGTH_LONG).show();
            et13.setText("");
            et14.setText("");
            et15.setText("");
            et16.setText("");
            et17.setText("");
            et18.setText("");
            et19.setText("");
            et20.setText("");
        } else {
            Toast.makeText(getApplicationContext(), "data is  successfully submitted", Toast.LENGTH_LONG).show();
        }
    }
       public  void next(View v){
        Intent i=new Intent();
        i.setComponent(new ComponentName(getApplicationContext(),Third.class));
        startActivity(i);
    }
}

