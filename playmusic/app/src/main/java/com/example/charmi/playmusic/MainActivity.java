package com.example.charmi.playmusic;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer Music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Music= MediaPlayer.create(this, R.raw.ale);
        Switch switch_looping =(Switch) findViewById(R.id.switch_looping);
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Music.setLooping(isChecked);
            }
        });

    }
    public void playmusic(View v)
    {
        Music.start();
    }
    public void pausemusic(View v)
    {
        if(Music.isPlaying())
        Music.pause();
    }
}
