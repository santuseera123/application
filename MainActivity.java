package myapplicationishello.com.example.hsport.videorecordingtest;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    SurfaceView sView;
    SurfaceHolder sHolder;
    MediaRecorder recorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recorder=new MediaRecorder();
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        recorder.setVideoSource(MediaRecorder.VideoSource.CAMERA);
        CamcorderProfile profile=CamcorderProfile.get(CamcorderProfile.QUALITY_HIGH);
        recorder.setProfile(profile);
        recorder.setOutputFile("/storage/sdcard0/obb.mp4");
        sView=(SurfaceView)findViewById(R.id.surfaceView);
        sHolder=sView.getHolder();
        sHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                recorder.setPreviewDisplay(surfaceHolder.getSurface());
                try {
                    recorder.prepare();
                }catch (Exception e){

                }
            }
            @Override
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {
            }
            @Override
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

            }
        });
    }

        public void start(View v){
           recorder.start();
        }
       public void stop(View v){
        recorder.stop();
    }
}
