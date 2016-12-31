package myapplicationishello.com.example.hsport.storage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    SharedPreferences.Editor spe;
    EditText et1,et2,et3,et4,et5,et6;
    SharedPreferences spf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spf=getSharedPreferences("myprefs", Context.MODE_PRIVATE);
        spe=spf.edit();
         et1=(EditText)findViewById(R.id.editText);
         et2=(EditText)findViewById(R.id.editText2);
         et3=(EditText)findViewById(R.id.editText3);
         et4=(EditText)findViewById(R.id.editText4);
         et5=(EditText)findViewById(R.id.editText5);
         et6=(EditText)findViewById(R.id.editText6);
    }

    public void login(View v){
        String name=spf.getString("uname","novalue");
        String pass=spf.getString("pass","novalue");
        if(et1.getText().toString().equalsIgnoreCase(name)&&et2.getText().toString().equalsIgnoreCase(pass)){

            Toast.makeText(getApplicationContext(),"successs",Toast.LENGTH_LONG).show();
        }else {

            Toast.makeText(getApplicationContext(),"INVALID",Toast.LENGTH_LONG).show();
        }
    }
    public  void register(View v){

        SharedPreferences.Editor spe=spf.edit();
        spe.putString("uname",et3.getText().toString());
        spe.putString("pass",et4.getText().toString());
        spe.putString("Mobile No",et5.getText().toString());
        spe.putString("eMail",et6.getText().toString());
        spe.commit();
    }
}
