package myapplicationishello.com.example.hsport.audiorecordingtest;

import android.media.MediaRecorder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
   MediaRecorder recorder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recorder=new MediaRecorder();
        recorder=new MediaRecorder();
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        recorder.setOutputFormat(MediaRecorder.OutputFormat.AMR_NB);
        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
        recorder.setOutputFile("/storage/sdcard0/obb.amr");
    }
      public void start(View v){
      try {
          recorder.prepare();
          recorder.start();
      }catch (Exception e){
      }
      }
     public void stop(View v){

         recorder.stop();
     }
}
