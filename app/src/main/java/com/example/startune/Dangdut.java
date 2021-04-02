package com.example.startune;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Dangdut extends AppCompatActivity {


    private static final String isPlaying = "media is playing ";

    MediaPlayer player;

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangdut);


        Button button = findViewById(R.id.a1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dangdut.this,Dashboard.class);
                startActivity(intent);
            }
        });

        btn1 = (Button)findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick (View arg0){

                playSound(1);

            }

        });

        btn2 = (Button)findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick (View arg0){

                playSound(2);

            }

        });

        btn3 = (Button)findViewById(R.id.button3);

        btn3.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick (View arg0){

                playSound(3);

            }

        });

    }

    public void onPause(){

        try{

            super.onPause();

            player.pause();

        }catch (Exception e){

        }

    }

    private void playSound(int arg){

        try{

            if (player.isPlaying()){

                player.stop();

                player.release();

            }

        }catch (Exception e){

            Toast.makeText(this, "Masuk Lagu", Toast.LENGTH_LONG).show();

        }

        if (arg ==1){

            Toast.makeText(this, isPlaying+ "Denny Caknan - Los Dol", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.los);

        }else if (arg ==2){

            Toast.makeText(this, isPlaying+ "Vita Alvia - Kopi Dangdut", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.kopidangdut);

        }else if (arg ==3){

            Toast.makeText(this, isPlaying+ "Vita Alvia - Ku Puja Puja", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.kupujapuja);

        }

        player.setLooping(true);

        player.start();

    }

}