package com.group3.hackadam;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;

public class PianoActivity extends AppCompatActivity implements View.OnClickListener   {
    Button note1;
    Button note2;
    Button note3;
    Button note4;
    Button note5;
    Button note6;
    Button note7;
    MediaPlayer Do = MediaPlayer.create(getApplicationContext(), R.raw.Do);
    MediaPlayer Re = MediaPlayer.create(getApplicationContext(), R.raw.Re);
    MediaPlayer Mi = MediaPlayer.create(getApplicationContext(), R.raw.Mi);
    MediaPlayer Fa = MediaPlayer.create(getApplicationContext(), R.raw.Fa);
    MediaPlayer Sol = MediaPlayer.create(getApplicationContext(), R.raw.Sol);
    MediaPlayer La = MediaPlayer.create(getApplicationContext(), R.raw.La);
    MediaPlayer Si = MediaPlayer.create(getApplicationContext(), R.raw.Si);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);

        Button note1 =  (Button)findViewById(R.id.btnNote1);
        Button note2 =  (Button)findViewById(R.id.btnNote2);
        Button note3 =  (Button)findViewById(R.id.btnNote3);
        Button note4 =  (Button)findViewById(R.id.btnNote4);
        Button note5 =  (Button)findViewById(R.id.btnNote5);
        Button note6 =  (Button)findViewById(R.id.btnNote6);
        Button note7 =  (Button)findViewById(R.id.btnNote7);
        note1.setOnClickListener(this);
        note2.setOnClickListener(this);
        note3.setOnClickListener(this);
        note4.setOnClickListener(this);
        note5.setOnClickListener(this);
        note6.setOnClickListener(this);
        note7.setOnClickListener(this);

    }

    @Override
            public void onClick(View v) {
            if(v.getId()==note1.getId()) {
                Do.start();
            }
            else{
                if(v.getId()==note2.getId()) {
                Re.start();
            }
            else{
                    if(v.getId()==note3.getId()) {
                    Mi.start();
                }
                else{
                        if(v.getId()==note4.getId()) {
                        Fa.start();
                        }
                        else{    if(v.getId()==note5.getId()) {
                                 Sol.start();
                        }
                        else{    if(v.getId()==note6.getId()) {
                                 La.start();
                        }
                        else{
                        Si.start();
                        }

                        }

                        }

                }

            }

            }
            }
}
