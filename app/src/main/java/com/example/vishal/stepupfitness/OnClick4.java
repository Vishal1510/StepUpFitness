package com.example.vishal.stepupfitness;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by User on 5/6/2016.
 */
public class OnClick4 extends AppCompatActivity {

    ImageButton beginer;
    ImageButton intermediate;
    ImageButton expert;
    Button backbutton;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_click);
        beginer = (ImageButton) findViewById(R.id.beginer);
        beginer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(OnClick4.this, bs1.class);
                startActivity(myintent);
            }
        });
        intermediate= (ImageButton) findViewById(R.id.intermediate);
        intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(OnClick4.this, bs2.class);
                startActivity(myintent);
            }
        });
        expert= (ImageButton) findViewById(R.id.expert);
        expert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(OnClick4.this, bs3.class);
                startActivity(myintent);
            }
        });




        Intent intent = getIntent();
        int position = intent.getIntExtra("POSITION", 0);
        final Context context1 = this;



        backbutton = (Button) findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(context1, MainActivity.class);
                startIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Ensures that the activity stack is cleared.
                startIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context1.startActivity(startIntent);
            }
        });




    }
}
