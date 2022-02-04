package com.digimat.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import com.digimat.myapplication.practica1.practica1intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button boton1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1=findViewById(R.id.botonactivity1);
        boton1.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.botonactivity1:

                Intent clase2=new Intent(MainActivity.this, practica1intent.class);
                startActivity(clase2);

                break;
        }
    }
}