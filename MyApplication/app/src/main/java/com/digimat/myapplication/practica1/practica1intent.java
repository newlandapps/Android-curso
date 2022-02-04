package com.digimat.myapplication.practica1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.digimat.myapplication.MainActivity;
import com.digimat.myapplication.R;
import com.digimat.myapplication.practica2.practica2fragment;

public class practica1intent  extends AppCompatActivity  implements View.OnClickListener{

    private Button boton2,boton3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practica1intent);

        boton2=findViewById(R.id.botonactivity2);
        boton2.setOnClickListener(this);

        boton3=findViewById(R.id.botonactivity3);
        boton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            switch (view.getId()){
                case R.id.botonactivity2:

                    Intent intent=new Intent(practica1intent.this, MainActivity.class);
                    startActivity(intent);

                    break;
                case R.id.botonactivity3:

                    Intent intent2=new Intent(practica1intent.this, practica2fragment.class);
                    startActivity(intent2);

                    break;
            }
    }
}
