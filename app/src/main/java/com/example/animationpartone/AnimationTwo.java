package com.example.animationpartone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimationTwo extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_two);
        imageView=findViewById(R.id.imageview);

//        Blink Animaiton
//        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
//        imageView.startAnimation(animation);


//        zoomin Animation
//        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomin);
//        imageView.startAnimation(animation);


//        zoomout Animation
        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomout);
        imageView.startAnimation(animation);
    }
}