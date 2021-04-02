package com.example.startune;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {
    private Button TopHits;
    private Button Pop;
    private Button DjRemix;
    private Button Dangdut;
    private Button Reggae;
    private Button Rock;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TopHits = (Button) findViewById(R.id.b1);
        Pop = (Button) findViewById(R.id.b2);
        DjRemix = (Button) findViewById(R.id.b3);
        Dangdut = (Button) findViewById(R.id.b4);
        Reggae = (Button) findViewById(R.id.b5);
        Rock = (Button) findViewById(R.id.b6);

        TopHits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTopHits();
            }
        });
        Pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPop();
            }
        });
        DjRemix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDjRemix();
            }
        });
        Dangdut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDangdut();
            }
        });
        Reggae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReggae();
            }
        });
        Rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRock();
            }
        });
    }
    public void openTopHits(){
        Intent intent = new Intent(this, TopHits.class);
        startActivity(intent);
    }
    public void openPop(){
        Intent intent = new Intent(this, Pop.class);
        startActivity(intent);
    }
    public void openDjRemix(){
        Intent intent = new Intent(this, DjRemix.class);
        startActivity(intent);
    }
    public void openDangdut(){
        Intent intent = new Intent(this, Dangdut.class);
        startActivity(intent);
    }
    public void openReggae(){
        Intent intent = new Intent(this, Reggae.class);
        startActivity(intent);
    }
    public void openRock(){
        Intent intent = new Intent(this, Rock.class);
        startActivity(intent);
    }

}
