package com.seosuz.heaven.videogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{

            VideoView vidView = (VideoView)findViewById(R.id.myVideo);
            String vidAddress = "http://seosuz.com/alideneme/123.mp4"; //mp4,3gp,webm
            Uri vidUri = Uri.parse(vidAddress);
            vidView.setVideoURI(vidUri);
            vidView.start();
            MediaController vidControl = new MediaController(this);
            vidControl.setAnchorView(vidView);
            vidView.setMediaController(vidControl);
        }catch (Exception e){

        }
    }
}
