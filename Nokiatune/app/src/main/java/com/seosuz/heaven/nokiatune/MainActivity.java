package com.seosuz.heaven.nokiatune;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // #87b703
        try{
        }catch (Exception e){
            e.toString();
            Log.d("Hata : ", e.getMessage());

        }

    }
}
