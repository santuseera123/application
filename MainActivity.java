package myapplicationishello.com.example.hsport.sch_app;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void donar(View v){
        Intent i=new Intent();
        i.setComponent(new ComponentName(getApplicationContext(),Donar.class));
        startActivity(i);
    }
    public void student(View v){
        Intent i=new Intent();
        i.setComponent(new ComponentName(getApplicationContext(),Student.class));
        startActivity(i);
    }
}
