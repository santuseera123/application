package myapplicationishello.com.example.hsport.countryselectedapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
    AutoCompleteTextView actv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actv=(AutoCompleteTextView)findViewById(R.id.actv);
        String[] values=getResources().getStringArray(R.array.country_name);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,
                values);
        actv.setAdapter(adapter);
        actv.setThreshold(1);
    }
}
