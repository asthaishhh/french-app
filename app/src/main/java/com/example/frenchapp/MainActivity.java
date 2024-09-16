package com.example.frenchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button blackButton, greenButton, purpleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackButton  = findViewById(R.id.blackButton);
        greenButton  = findViewById(R.id.greenButton);
        purpleButton = findViewById(R.id.purpleButton);


        blackButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        purpleButton.setOnClickListener(this);


        /*this is very unprofessional way if we got to do it individually for each button
         So ,  we write 'implements View.onClickListener after MainActivity
         extends AppCompatActivity*/
       /* blackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(
                        getApplicationContext(),
                        R.raw.black
                );
                mp.start();
            }
        }); */
    }

    @Override
    public void onClick(View v) {
    int clickedButton = v.getId();

    if(clickedButton == R.id.blackButton){
        PlaySounds(R.raw.black);
    }
    else if(clickedButton == R.id.greenButton){
        PlaySounds(R.raw.green);
    }
    else{
        PlaySounds(R.raw.purple);
    }
    }

    public void PlaySounds(int id){
        MediaPlayer mp = MediaPlayer.create(
                this,
                id
        );
        mp.start();

    }
}