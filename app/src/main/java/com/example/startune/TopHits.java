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

public class TopHits extends AppCompatActivity {


    private static final String isPlaying = "media is playing ";

    MediaPlayer player;

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_hits);


        btn1 = (Button)findViewById(R.id.button);
        Button button = findViewById(R.id.a1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TopHits.this,Dashboard.class);
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

        btn6 = (Button)findViewById(R.id.button6);

        btn6.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick (View arg0){

                playSound(6);

            }

        });

        btn7 = (Button)findViewById(R.id.button7);

        btn7.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick (View arg0){

                playSound(7);

            }

        });

        btn8 = (Button)findViewById(R.id.button8);

        btn8.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick (View arg0){

                playSound(8);

            }

        });

        btn9 = (Button)findViewById(R.id.button9);

        btn9.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick (View arg0){

                playSound(9);

            }

        });

        btn10 = (Button)findViewById(R.id.button10);

        btn10.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick (View arg0){

                playSound(10);

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

            Toast.makeText(this, isPlaying+ "Dere - Kota", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.derekota);

        }else if (arg ==2){

            Toast.makeText(this, isPlaying+ "Snowman - Sia", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.snowman);

        }else if (arg ==3){

            Toast.makeText(this, isPlaying+ "Budi Doremi - Melukis Senja", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.melukissenja);

        }else if (arg ==4){

            Toast.makeText(this, isPlaying+ "Pamungkas - To The Bone", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.tothebone);

        }else if (arg ==5){

            Toast.makeText(this, isPlaying+ "Duncan Laurence - Arcade", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.losinggame);

        }else if (arg ==6){

            Toast.makeText(this, isPlaying+ "Skinnyfabs - Happy", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.happy);

        }else if (arg ==7){

            Toast.makeText(this, isPlaying+ "Andmesh - Hanya Rindu", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.hanyaindu);

        }else if (arg ==8){

            Toast.makeText(this, isPlaying+ "Stephanie - I Love You 3000", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.iloveyou);

        }else if (arg ==9){

            Toast.makeText(this, isPlaying+ "Imagine Dragons - Bad Liar", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.badliar);

        }else if (arg ==10){

            Toast.makeText(this, isPlaying+ "Denny Caknan - Los Dol", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.los);

        }

        player.setLooping(true);

        player.start();

    }

}