package com.pnla.onroadplus.practica4.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.pnla.onroadplus.R;

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


    public void fragmentmenu() {
        manager = getSupportFragmentManager();
        transaction=manager.beginTransaction();
        practica4fragmentmenu menu=new practica4fragmentmenu();
        transaction.add(R.id.frameLayoutmenu41,menu,practica4fragmentmenu.TAG).commit();

        testsuma(2, 2);

    }
    public int testsuma(int  dato1, int dato2) {
        return dato1+dato2;
    }
}
