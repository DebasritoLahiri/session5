package com.android.debasrito.session5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class newageplayer extends AppCompatActivity {
    TextView timestart,timeend;
    SeekBar seekbar;
    Button prevsong,seekback,play,seeknext,nextsong;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newageplayer);
        timestart = (TextView) findViewById(R.id.timestart);
        timeend = (TextView) findViewById(R.id.timeend);
        seekbar = (SeekBar) findViewById(R.id.seekbar);
        prevsong = (Button) findViewById(R.id.prevsong);
        seekback = (Button) findViewById(R.id.seekback);
        play = (Button) findViewById(R.id.play);
        seeknext = (Button) findViewById(R.id.seeknext);
        nextsong = (Button) findViewById(R.id.nextsong);
        mp = MediaPlayer.create(this, R.raw.song1);
        seekbar.setMax(mp.getDuration());
        timeend.setText(mp.getDuration());
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mp.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
        public void play (View view){
            if (mp != null)
                mp.start();
            else {
                mp = MediaPlayer.create(this, R.raw.song1);
                mp.start();
            }

        }
        public void stop(View view) {
            if(mp==null)
            {}
            else
            {
                mp.stop();
            }

        }
        public void prevsong(View view) {
            if(mp==null)
            {}
            else
            {
                mp.pause();
            }

        }
    public void nextsong(View view) {
        if(mp==null)
        {}
        else
        {
            mp.pause();
        }

    }
    public void seekback(View view) {
        if(mp==null)
        {}
        else
        {
            mp.pause();
        }

    }
    public void seeknext(View view) {
        if(mp==null)
        {}
        else
        {
            mp.pause();
        }

    }
    }