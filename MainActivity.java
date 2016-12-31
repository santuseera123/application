package myapplicationishello.com.example.hsport.contents;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dial(View v){
        Intent i=new Intent();
        i.setAction(Intent.ACTION_DIAL);
        EditText et1=(EditText) findViewById(R.id.et1);
        i.setData(Uri.parse("tel:"+et1.getText()));
        startActivity(i);
    }
    public void next(View v){
        Intent i=new Intent();
        i.setComponent(new ComponentName(getApplicationContext(),Welcome.class));
        startActivity(i);
    }
}
