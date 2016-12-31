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
public class Donar extends AppCompatActivity {
    EditText et1, et2, et3, et4;
    SQLiteDatabase dBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donar_main);
        dBase = openOrCreateDatabase("emp_db", Context.MODE_PRIVATE, null);
        dBase.execSQL("create table if not exists emp(id number,name varchar(100),desig varchar(100),dept varchar(100))");
        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);
        et4 = (EditText) findViewById(R.id.editText4);
    }

    public void submit(View v) {
        ContentValues values = new ContentValues();
        values.put("Enter donated person Name", et1.getText().toString());
        values.put("Foundation Name", et2.getText().toString());
        values.put("Enter How much fee you donate", Integer.parseInt(et3.getText().toString()));
        values.put("Enter Mail", et4.getText().toString());
        long count = dBase.insert("emp", null, values);
        if (count > 0) {
            et1.setText("");
            et2.setText("");
            et3.setText("");
            et4.setText("");
            Toast.makeText(getApplicationContext(), " details is successfully submitted", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "details is  successfully submitted", Toast.LENGTH_LONG).show();
        }
    }
    public  void next(View v){
        Intent i=new Intent();
        i.setComponent(new ComponentName(getApplicationContext(),Four.class));
        startActivity(i);
    }
}