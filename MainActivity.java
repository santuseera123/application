package myapplicationishello.com.example.hsport.wifitest;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    WifiManager wmanager;
    Switch sw1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wmanager=(WifiManager)getSystemService(Context.WIFI_SERVICE);
        sw1=(Switch)findViewById(R.id.switch1);
        int i=wmanager.getWifiState();

        if(i==0){
            sw1.setChecked(false);
        }else  if(i==3){
            sw1.setChecked(true);
        }

        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    wmanager.setWifiEnabled(true);
                }else{
                    wmanager.setWifiEnabled(false);
                }
            }
        });
    }
        public void getscanresults(View v){
            List<ScanResult>results=wmanager.getScanResults();
            for(int i=0;i<results.size();i++){

                ScanResult result=results.get(i);
                Toast.makeText(getApplicationContext(),result.SSID+"/n"+result.frequency,2000).show();
            }
        }
       public void  getconfigurednetworks(View v){
           List<WifiConfiguration>configs=wmanager.getConfiguredNetworks();
           for(int i=0;i<configs.size();i++){
               WifiConfiguration result=configs.get(i);
               Toast.makeText(getApplicationContext(),result.SSID+"/n"+result.status,2000).show();
           }
       }
}
