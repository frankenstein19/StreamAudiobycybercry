package com.example.cybercry.livestreamaudio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.streamaudiobycybercry.AudioPlayer;


public class Sample extends AppCompatActivity {
    AudioPlayer audioPlayer;
    Button play,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        play= findViewById(R.id.playpause_btn);
        stop=findViewById(R.id.stop_btn);
        audioPlayer= new AudioPlayer(this);
        audioPlayer.playAudio("https://pagalworld3.org/14657/Mere Gully Mein - Gully Boy.mp3",play);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                audioPlayer.stopAudio();
               // audioPlayer.mediaPlayer=null;
            }
        });

    }

}
