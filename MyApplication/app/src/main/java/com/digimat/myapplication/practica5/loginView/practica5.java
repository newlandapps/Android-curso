package com.digimat.myapplication.practica5.loginView;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.digimat.myapplication.R;
import com.digimat.myapplication.practica4.view.practica4ViewImpl;

public class practica5 extends AppCompatActivity {
    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practica5);

        irafracgment5();

    }

    private void irafracgment5() {
        manager = getSupportFragmentManager();
        transaction=manager.beginTransaction();
        loginFragmentViewImpl loginF=new loginFragmentViewImpl();
        transaction.add(R.id.frameLayout5,loginF, loginFragmentViewImpl.TAG).commit();
    }
}
