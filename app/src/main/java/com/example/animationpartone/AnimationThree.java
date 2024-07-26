package com.example.animationpartone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimationThree extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_three);
        imageView=findViewById(R.id.bouncing_img);

//        Bouncing Image Animation
//        Animation animation= AnimationUtils.loadAnimation(this,R.anim.bounce);
//        imageView.startAnimation(animation);

        Animation animation=AnimationUtils.loadAnimation(this,R.anim.rotate);
        imageView.startAnimation(animation);
    }
}