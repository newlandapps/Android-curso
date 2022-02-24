package com.digimat.myapplication.practica3;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.digimat.myapplication.R;
import com.digimat.myapplication.practica2.practica2fragment;
import com.digimat.myapplication.practica4.view.practica4;
import com.digimat.myapplication.practica5.loginView.practica5;

public class practica3  extends AppCompatActivity {

    private MediaPlayer song1 = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practica_tres);

        LottieAnimationView animationView= findViewById(R.id.splash);



        song1 = MediaPlayer.create(getApplicationContext(),  R.raw.netflixsound);
        song1.setLooping(false);
        animationView.addAnimatorUpdateListener(
                (animation) -> {
                    // Do something.
                    song1.start();


                });
        animationView.playAnimation();

        if (animationView.isAnimating()) {

        }else
        {

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    song1.pause();
                    goToLoginContainer();

                }
            },3500);
        }
    }
    private void goToLoginContainer() {
        Intent intent = new Intent(practica3.this, practica5.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();

    }
}
