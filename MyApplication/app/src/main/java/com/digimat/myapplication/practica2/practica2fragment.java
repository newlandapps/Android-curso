package com.digimat.myapplication.practica2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.digimat.myapplication.R;

public class practica2fragment extends AppCompatActivity {

    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practica2_fragment);

        irafracgment1();

        fragmentmenu();
    }

    private void irafracgment1() {
        manager = getSupportFragmentManager();
        transaction=manager.beginTransaction();
        fragment fragmentazul=new fragment();
        transaction.add(R.id.frameLayoutlayout,fragmentazul,fragmentmenu.TAG).commit();
    }


    private void fragmentmenu() {
        manager = getSupportFragmentManager();
        transaction=manager.beginTransaction();
        fragmentmenu menu=new fragmentmenu();
        transaction.add(R.id.frameLayoutmenu,menu,fragmentmenu.TAG).commit();
    }


}
