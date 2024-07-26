package com.example.animationpartone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageview);


//        This is for the fadein
//        Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadein);
//        imageView.startAnimation(animation);

//        FadeOut Animation
        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadeout);
        imageView.startAnimation(animation);

         //fadeout pachi image fari visible na thay ena mate handler no use karishu

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                    imageView.setVisibility(View.GONE);
            }

        },5000);

    }
}