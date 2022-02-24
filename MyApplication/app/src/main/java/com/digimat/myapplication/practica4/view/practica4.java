package com.digimat.myapplication.practica4.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.digimat.myapplication.R;
import com.digimat.myapplication.practica2.fragment;
import com.digimat.myapplication.practica2.fragmentmenu;

public class practica4  extends AppCompatActivity {
    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practica4fragment);

        irafracgment1();

        fragmentmenu();
    }



    private void irafracgment1() {
        manager = getSupportFragmentManager();
        transaction=manager.beginTransaction();
        practica4ViewImpl fragmentazul=new practica4ViewImpl();
        transaction.add(R.id.frameLayoutlayout42,fragmentazul, practica4ViewImpl.TAG).commit();
    }


    private void fragmentmenu() {
        manager = getSupportFragmentManager();
        transaction=manager.beginTransaction();
        practica4fragmentmenu menu=new practica4fragmentmenu();
        transaction.add(R.id.frameLayoutmenu41,menu,practica4fragmentmenu.TAG).commit();
    }
}
