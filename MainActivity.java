package myapplicationishello.com.example.hsport.qtp;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void button(View v) {
        EditText et1 = (EditText) findViewById(R.id.et1);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText(tv1.getText()+et1.getText().toString()+"\n")
    }
}