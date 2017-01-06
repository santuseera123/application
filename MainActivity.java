package myapplicationishello.com.example.hsport.fragementconcept;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    android.app.FragmentTransaction tx;
    FragmentManager fmanager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void home(View v){
        FragmentManager fmanager=getFragmentManager();
        tx=fmanager.beginTransaction();
        tx.replace(R.id.fragment,new Homefragement());
        tx.commit();
    }
    public  void gallery(View v){
        FragmentManager fmanager=getFragmentManager();
        tx=fmanager.beginTransaction();
        tx.replace(R.id.fragment,new Galleryfragement());
        tx.commit();
    }
    public void contactus(View v){
        FragmentManager fmanager=getFragmentManager();
        tx=fmanager.beginTransaction();
        tx.replace(R.id.fragment,new Contactusfragement());
    }
}
