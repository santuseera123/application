 package myapplicationishello.com.example.hsport.xmltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

 public class MainActivity extends AppCompatActivity {
     EditText et1,et2,et3,et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        et4=(EditText)findViewById(R.id.et4);
    }

      public void insert(View v) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document d = builder.newDocument();
            Element e1 = d.createElement("employees");
            Element e2 = d.createElement("employee");
            Element e3 = d.createElement("id");
            Element e4 = d.createElement("name");
            Element e5 = d.createElement("desig");
            Element e6 = d.createElement("dept");

            Node n1 = d.createTextNode(et1.getText().toString());
            Node n2 = d.createTextNode(et2.getText().toString());
            Node n3 = d.createTextNode(et3.getText().toString());
            Node n4 = d.createTextNode(et4.getText().toString());

            e3.appendChild(n1);
            e4.appendChild(n2);
            e5.appendChild(n3);
            e6.appendChild(n4);

            e2.appendChild(e3);
            e2.appendChild(e4);
            e2.appendChild(e5);
            e2.appendChild(e6);

            e1.appendChild(e2);
            d.appendChild(e1);
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer t = tFactory.newTransformer();
            Source source = new DOMSource(d);
            FileOutputStream fos = new FileOutputStream("/storage/SdCard0/obb/emp930.xml");
            Result result = new StreamResult(fos);
            t.transform(source, result);
        }catch (Exception e){
            e.printStackTrace();
        }
      }
     public void read(View v){

     }
     public  void update(View v){

     }
     public  void delete(View v){

     }
}
