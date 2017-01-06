package myapplicationishello.com.example.hsport.collegeapplicationform;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.health.PackageHealthStats;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends Activity {
    private  static int DATE_PICKER_DIALOG=1;
    private static int TIME_PICKER_DIALOG=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView actv=(AutoCompleteTextView)findViewById(R.id.actv);
        String[] str=new String[]{"Apj institute of engineering","Baba Engineering college","JNTU Kakinada",
                "JNTUH","JNTUANATHAPURAM","NEWTONS","SRIVASAVI","GODAVARI INSTITUTE OF ENGINEERING",
                "GAYATHRI COLLEGE","GITAM COLLEGE","NITWARANGAL","MVR ENGINEERING CLOOEGE",
                "RVRJC ENGINEERING COLLEGR","UNIVERSAL INSTITUTE OF ENGINERRING",
                "VITHAM INSTITUTE OF ENGINEERING","VIGANS INSTITUTE OF ENGINEERING",
                "SARASWTHI INSTITUTE OF ENGINEERING","SIDDRDA INSTITUTE OF ENGINEERING",
                "NAKKIREDDY BALAREDDY INSTITUTE OF ENGINEERING"};
        ArrayAdapter<String>aa=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_dropdown_item_1line,str);
        actv.setThreshold(1);
        actv.setAdapter(aa);
        Spinner sp1=(Spinner)findViewById(R.id.sp1);
       // String[] str1=getResources().getStringArray(R.array.myarray);
        ArrayAdapter<String>aa1=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_dropdown_item_1line,str);
        sp1.setAdapter(aa1);
    }
     public  void CheckBox(View view){
         CheckBox cb1,cb2;
         cb1=(CheckBox)findViewById(R.id.cb1);
         cb2=(CheckBox)findViewById(R.id.cb2);
         if(cb1.isChecked()){
             Toast.makeText(getApplicationContext(),"MCA is Selected",Toast.LENGTH_LONG).show();
         }else if(cb2.isChecked()){

             Toast.makeText(getApplicationContext(),"BTech is Selected",Toast.LENGTH_LONG).show();
         }
     }
     public  void RadioBox(View view){

         RadioButton rb1,rb2;
         rb1=(RadioButton)findViewById(R.id.rb1);
         rb2=(RadioButton)findViewById(R.id.rb2);
         if(rb1.isChecked()){
             Toast.makeText(getApplicationContext(),"Male is Selected",Toast.LENGTH_LONG).show();
         }else  if(rb2.isChecked()){
             Toast.makeText(getApplicationContext(),"Female is Selected",Toast.LENGTH_LONG).show();
         }
     }
    public Dialog onCreateDialog(int index){


        if(index==DATE_PICKER_DIALOG)
        {
            DatePickerDialog.OnDateSetListener dl=new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int Year, int MonthOfYear, int dayOfMonth) {
                    Button b1=(Button)findViewById(R.id.dp);
                    b1.setText(dayOfMonth+"-"+(MonthOfYear+1)+"-"+Year);
                }
            };
            DatePickerDialog dpd=new DatePickerDialog(this,dl,2016,8,22);
            return dpd;
        }
        else if(index==TIME_PICKER_DIALOG)
        {
            TimePickerDialog.OnTimeSetListener t1=new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int hourOfDay, int Minute) {
                    Button b1=(Button)findViewById(R.id.tp);
                    b1.setText(hourOfDay+"-"+Minute);
                }
            };
            TimePickerDialog tpd=new TimePickerDialog(this,t1,10,12,false);
            return tpd;
        }

        return null;
     }
      public  void startdialog(View view){

          showDialog(DATE_PICKER_DIALOG);
      }
      public  void timedialog(View view){
          showDialog(TIME_PICKER_DIALOG);
      }
        public  void submit(View v){
            Button btn=(Button)findViewById(R.id.tp);
            if(btn.isClickable())
            {
                Toast.makeText(getApplicationContext(),"you have successfully submitted",Toast.LENGTH_LONG).show();
            }

        }
}
