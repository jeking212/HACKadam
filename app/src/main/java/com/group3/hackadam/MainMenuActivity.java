package com.group3.hackadam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import android.view.View.OnClickListener;

import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {
 Button startButton;
 Button libraryButton;
 Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button startButton = (Button)findViewById(R.id.btnStart);
        Button libraryButton = (Button)findViewById(R.id.btnLibrary);
        Button exitButton = (Button)findViewById(R.id.btnExit);
        startButton.setOnClickListener(this);
        libraryButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
    if(v.getId()==startButton.getId()) {
        Intent i = new Intent(this, SettingsActivity.class);
    }
    else {
        if(v.getId()==libraryButton.getId()) {
            //intent to library
        }
        else {
            finish();
            System.exit(0);
        }
    }

    }

}

