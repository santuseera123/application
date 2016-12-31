package myapplicationishello.com.example.hsport.newton_nist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3,et4,et5,et6,et7,et8;
    SQLiteDatabase dBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dBase=openOrCreateDatabase("emp_db", Context.MODE_PRIVATE,null);
        dBase.execSQL("create table if not exists emp(homeno name,street varchar(100),village varchar(100),post varchar(100),mandal varchar(100),pin Name,district varchar(100),state varchar(100))");
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);
        et4=(EditText)findViewById(R.id.editText4);
        et5=(EditText)findViewById(R.id.editText5);
        et6=(EditText)findViewById(R.id.editText6);
        et7=(EditText)findViewById(R.id.editText7);
        et8=(EditText)findViewById(R.id.editText8);
    }

    public void insert(View v){
        ContentValues values=new ContentValues();
        values.put("homeno",Integer.parseInt(et1.getText().toString()));
        values.put("street",et2.getText().toString());
        values.put("village",et3.getText().toString());
        values.put("post",et4.getText().toString());
        values.put("mandal",et5.getText().toString());
        values.put("pin",et6.getText().toString());
        values.put("district",et7.getText().toString());
        values.put("state",et8.getText().toString());
        long count=dBase.insert("emp",null,values);
        if(count>0){
            Toast.makeText(getApplicationContext(),"data is inserted",Toast.LENGTH_LONG).show();
            et1.setText("");
            et2.setText("");
            et3.setText("");
            et4.setText("");
            et5.setText("");
            et6.setText("");
            et7.setText("");
            et8.setText("");
        }
        else {
            Toast.makeText(getApplicationContext(),"data is not  inserted",Toast.LENGTH_LONG).show();
        }
    }
       public  void read(View v) {
        Cursor c = dBase.query("emp", new String[]{"homeno", "street", "village", "post","mandal","pin","district","state"}, null, null, null, null, null);
        while (c.moveToNext()) {
            String record = c.getInt(0) + "\n" + c.getString(1) + "\n" + c.getString(2) + "\n" + c.getString(3) + "\n" + c.getString(4)
                    + "\n" + c.getInt(5) + "\n" + c.getString(6) + "\n" + c.getString(7);
            Toast.makeText(getApplicationContext(), record, Toast.LENGTH_LONG).show();
        }
    }
}