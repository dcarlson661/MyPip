package com.dcarl661.mypip;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //https://javapapers.com/android/android-studio-git-tutorial/

    public void GoPIP(View v){
            enterPictureInPictureMode();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);

        TextView textView=findViewById(R.id.textView);
        Button button=findViewById(R.id.button);

        if(isInPictureInPictureMode){
            //going into
            button.setVisibility(View.INVISIBLE);
            getSupportActionBar().hide();
            textView.setText("Harry");
        }
        else{
            //going out
            getSupportActionBar().show();
            button.setVisibility(View.VISIBLE);
            textView.setText("Sally");
        }
    }

}
