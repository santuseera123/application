package myapplicationishello.com.example.hsport.sqlitedatabase;

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
    EditText et1,et2,et3,et4;
    SQLiteDatabase dBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dBase=openOrCreateDatabase("emp_db",Context.MODE_PRIVATE,null);
        dBase.execSQL("create table if not exists emp(id name,name varchar(100),desig varchar(100),dept varchar(100))");
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);
        et4=(EditText)findViewById(R.id.editText4);
    }

      public void insert(View v){
          ContentValues values=new ContentValues();
          values.put("id",Integer.parseInt(et1.getText().toString()));
          values.put("name",et2.getText().toString());
          values.put("desig",et3.getText().toString());
          values.put("dept",et4.getText().toString());
          long count=dBase.insert("emp",null,values);
          if(count>0){
              Toast.makeText(getApplicationContext(),"data is inserted",Toast.LENGTH_LONG).show();
              et1.setText("");
              et2.setText("");
              et3.setText("");
              et4.setText("");
          }
          else {
              Toast.makeText(getApplicationContext(),"data is not  inserted",Toast.LENGTH_LONG).show();
          }
      }
      public  void read(View v){

          Cursor c=dBase.query("emp",new String[]{"id","name","desig","dept"},null,null,null,null,null);
          while (c.moveToNext()){
              String record=c.getInt(0)+"\n"+c.getString(1)+"\n"+c.getString(2)+"\n"+c.getString(3);

              Toast.makeText(getApplicationContext(),record,Toast.LENGTH_LONG).show();
          }
      }
       public void update(View v){
           ContentValues values=new ContentValues();
           values.put("name",et2.getText().toString());
           values.put("desig",et3.getText().toString());
           values.put("dept",et4.getText().toString());
           long count=dBase.update("emp",values,"id=?",new String[]{et1.getText().toString()});
           if(count>0){
               Toast.makeText(getApplicationContext(),"data is updated",Toast.LENGTH_LONG).show();
               et1.setText("");
               et2.setText("");
               et3.setText("");
               et4.setText("");
           }
           else{

               Toast.makeText(getApplicationContext(),"data not updated",Toast.LENGTH_LONG).show();
           }
       }
    public  void delete(View v) {
        long count = dBase.delete("emp", "id=?", new String[]{et1.getText().toString()});
        if (count > 0) {

            Toast.makeText(getApplicationContext(), "Record is deleted", Toast.LENGTH_LONG).show();
        } else {

            Toast.makeText(getApplicationContext(), "Record is not deleted", Toast.LENGTH_LONG).show();
        }
    }
}
