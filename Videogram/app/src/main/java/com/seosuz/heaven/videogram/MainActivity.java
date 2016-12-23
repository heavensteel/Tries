package com.seosuz.heaven.videogram;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            final Context c = MainActivity.this;
            final VideoView vidView = (VideoView)findViewById(R.id.myVideo);
            String vidAddress = "http://seosuz.com/alideneme/123.mp4"; //mp4,3gp,webm

            Uri vidUri = Uri.parse(vidAddress);
            vidView.setVideoURI(vidUri);
            vidView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    Toast.makeText(getApplicationContext(),"Videoya tıkladın",Toast.LENGTH_SHORT).toString();
                    try{
                            vidView.start();
                            MediaController vidControl = new MediaController(c);
                            vidControl.setAnchorView(vidView);
                            vidView.setMediaController(vidControl);

                    }catch (Exception e){
                        e.toString();
                        Log.d("asd",e.getMessage());
                    }
                    return false;
                }
            });


        }catch (Exception e){

        }
    }
}
