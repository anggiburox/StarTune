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

public class Pop extends AppCompatActivity {


    private static final String isPlaying = "media is playing ";

    MediaPlayer player;

    Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);


        btn1 = (Button)findViewById(R.id.button);
        Button button = findViewById(R.id.a1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pop.this,Dashboard.class);
                startActivity(intent);
            }
        });

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

        btn4 = (Button)findViewById(R.id.button4);

        btn4.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick (View arg0){

                playSound(4);

            }

        });

        btn5 = (Button)findViewById(R.id.button5);

        btn5.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick (View arg0){

                playSound(5);

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

            Toast.makeText(this, isPlaying+ "Taylor Swift - Love Story", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.lovestory);

        }else if (arg ==2){

            Toast.makeText(this, isPlaying+ "Stephanie - I Love You 3000", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.iloveyou);

        }else if (arg ==3){

            Toast.makeText(this, isPlaying+ "Judika - Cinta Karena Cinta", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.cintakarenacinta);

        }else if (arg ==4){

            Toast.makeText(this, isPlaying+ "Imagine Dragons - Bad Liar", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.badliar);

        }else if (arg ==5){

            Toast.makeText(this, isPlaying+ "Guyon Waton - Perlahan", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.perlahan);

        }

        player.setLooping(true);

        player.start();

    }

}