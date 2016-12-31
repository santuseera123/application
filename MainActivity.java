package myapplicationishello.com.example.hsport.toaccess;

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
    public  void twitter(View v){
        Intent i=getPackageManager().getLaunchIntentForPackage("com.twitter.android");
        startActivity(i);
    }
    public  void whatsapp(View v){
        Intent i=getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        startActivity(i);
    }
    public  void mxplayer(View v){
        Intent i=getPackageManager().getLaunchIntentForPackage("com.mxtech.videoplayer.ad");
        startActivity(i);
    }
    public  void shareit(View v){
        Intent i=getPackageManager().getLaunchIntentForPackage("com.lenovo.anyshare.gps");
        startActivity(i);
    }
    public  void youtube(View v){
        Intent i=getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
        startActivity(i);
    }
    public  void facebook(View v){
        Intent i=getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
        startActivity(i);
    }
    public  void ucbrowser(View v){
        Intent i=getPackageManager().getLaunchIntentForPackage("com.UCMobile.intl");
        startActivity(i);
    }
}
