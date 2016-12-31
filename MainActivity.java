package myapplicationishello.com.example.hsport.imagesandgallerytest;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
      String path=("/storage/sdcard0/obb.jpg");
      File f;
      public  void camera(View v){
          Intent i=new Intent("android.media.action.IMAGE_CAPTURE");
          f=new File(path);
          i.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(f));
          startActivityForResult(i,1);
      }

      public  void gallery(View v){
          Intent i=new Intent();
          i.setAction(Intent.ACTION_PICK);
          i.setType("image/*");
          startActivityForResult(i,2);
      }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ImageView iView=(ImageView)findViewById(R.id.imageView);
        if(requestCode==1){
            iView.setImageURI(Uri.fromFile(f));
        }
        else if(requestCode==2){
            iView.setImageURI(data.getData());
        }
    }
}




















