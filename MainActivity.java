package myapplicationishello.com.example.hsport.bttest;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch sw1;
    BluetoothAdapter bAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw1=(Switch)findViewById(R.id.switch1);
        bAdapter=BluetoothAdapter.getDefaultAdapter();
        sw1.setChecked(bAdapter.isEnabled());
        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    bAdapter.enable();
                 }
                else{
                    bAdapter.disable();
                 }
             }
        });
      }

       public void getbtdevices(View v){
           bAdapter.startDiscovery();
       }
}
