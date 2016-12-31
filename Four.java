package myapplicationishello.com.example.hsport.sch_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Surendra on 12/08/16.
 */
public class Four extends AppCompatActivity {
    EditText et6, et7, et8, et9, et10, et11, et12,et13, et14, et15, et16, et17, et18, et19, et20,et21, et22, et23, et24;
    SQLiteDatabase dBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four_main);
        setContentView(R.layout.first_main);
        setContentView(R.layout.second_main);
        setContentView(R.layout.third_main);
        dBase = openOrCreateDatabase("emp_db", Context.MODE_PRIVATE, null);
        dBase.execSQL("create table if not exists emp(id number,name varchar(100),desig varchar(100),dept varchar(100))");
        et6   = (EditText)findViewById(R.id.editText6);
        et7   = (EditText)findViewById(R.id.editText7);
        et8   = (EditText)findViewById(R.id.editText8);
        et9   = (EditText)findViewById(R.id.editText9);
        et10  = (EditText)findViewById(R.id.editText10);
        et11  = (EditText)findViewById(R.id.editText11);
        et12  = (EditText)findViewById(R.id.editText12);
        et13  = (EditText)findViewById(R.id.editText13);
        et14  = (EditText)findViewById(R.id.editText14);
        et15  = (EditText)findViewById(R.id.editText15);
        et16  = (EditText)findViewById(R.id.editText16);
        et17  = (EditText)findViewById(R.id.editText17);
        et18  = (EditText)findViewById(R.id.editText18);
        et19  = (EditText)findViewById(R.id.editText19);
        et20  = (EditText)findViewById(R.id.editText20);
        et21  = (EditText)findViewById(R.id.editText21);
        et22  = (EditText)findViewById(R.id.editText22);
        et23  = (EditText)findViewById(R.id.editText23);
        et24  = (EditText)findViewById(R.id.editText24);
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
        values.put("Home No",Integer.parseInt( et13.getText().toString()));
        values.put("Enter Street", et14.getText().toString());
        values.put("Enetr Village Name", et15.getText().toString());
        values.put("Enter post", et16.getText().toString());
        values.put("Enter Mandal", et17.getText().toString());
        values.put("Enter District Name",et18.getText().toString());
        values.put("Enter State Name", et19.getText().toString());
        values.put("Enter PIN",Integer.parseInt(et20.getText().toString()));
        values.put("Annual Income", Integer.parseInt(et21.getText().toString()));
        values.put("Parent/Garden Occupation", et22.getText().toString());
        values.put("Any Income From Other Sources", et23.getText().toString());
        values.put("parents live or Not ", et24.getText().toString());
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
            et13.setText("");
            et14.setText("");
            et15.setText("");
            et16.setText("");
            et17.setText("");
            et18.setText("");
            et19.setText("");
            et20.setText("");
            et21.setText("");
            et22.setText("");
            et23.setText("");
            et24.setText("");
        } else {
            Toast.makeText(getApplicationContext(), "details is  successfully submitted", Toast.LENGTH_LONG).show();
        }
    }
    public  void read(View v){
        Cursor c=dBase.query("emp",new String[]{"id","name","desig","dept"},null,null,null,null,null);
        while (c.moveToNext()){
            String record=c.getString(0)+"\n"+c.getString(1)+"\n"+c.getString(2)+"\n"+c.getString(3)
                    +c.getString(4)+"\n"+c.getInt(5)+"\n"+c.getInt(6)
                    +c.getString(7)+"\n"+c.getString(8)+"\n"+c.getString(9)
                    +c.getString(10)+"\n"+c.getString(11)+"\n"+c.getString(12)
                    +c.getString(13)+"\n"+c.getString(14)+"\n"+c.getInt(15)
                    +c.getInt(16)+"\n"+c.getString(17)+"\n"+c.getString(19)
                    +c.getString(19);
            Toast.makeText(getApplicationContext(),record,Toast.LENGTH_LONG).show();
        }
    }
}
