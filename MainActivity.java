package myapplicationishello.com.example.hsport.buttonexample;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public  class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickMeButton=(Button)findViewById(R.id.button_clickMe);
        clickMeButton.setOnClickListener(this);
    }
    @Override

    public void OnClick(View v) {
        Toast.makeText(this, "button is now working", Toast.LENGTH_LONG).show();

    }
}
