package myapplicationishello.com.example.hsport.time_picker;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void time(View v){
        TimePickerDialog.OnTimeSetListener listener=new TimePickerDialog.OnTimeSetListener(){
            @Override
            public void onTimeSet(TimePicker timePicker, int hourOfDay, int Minutes) {
                TextView tv=(TextView)findViewById(R.id.textView);
                tv.setText(hourOfDay+"-"+Minutes);
            }
        };
        TimePickerDialog tpd=new TimePickerDialog(this,listener,10,50,false);
        tpd.show();
    }
}
