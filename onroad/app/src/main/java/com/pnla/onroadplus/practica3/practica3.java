package com.pnla.onroadplus.practica3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.pnla.onroadplus.R;
import com.pnla.onroadplus.Retrofit.General_constants;
import com.pnla.onroadplus.practica2.practica2fragment;
import com.pnla.onroadplus.practica4.view.practica4;
import com.pnla.onroadplus.practica5.loginView.practica5;

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
                    SharedPreferences preferences = getApplicationContext().getSharedPreferences(General_constants.CREDENTIALS_PREFERENCES, Context.MODE_PRIVATE);
                    String token = preferences.getString(General_constants.TOKEN, null);
                    if(token==null)
                    {goToLoginContainer();}
                    else
                    {
                        goTomainScreen();
                    }

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
    private void goTomainScreen() {
        Intent intent = new Intent(practica3.this, practica4.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();

    }
    //Intent intent = new Intent(getActivity(), practica4.class);
}
