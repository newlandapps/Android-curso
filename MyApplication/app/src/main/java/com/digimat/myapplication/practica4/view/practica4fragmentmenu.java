package com.digimat.myapplication.practica4.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.digimat.myapplication.R;
import com.digimat.myapplication.practica2.fragment;
import com.digimat.myapplication.practica2.fragment3;
import com.digimat.myapplication.practica2.fragmentmenu;

public class practica4fragmentmenu extends Fragment implements View.OnClickListener{

    public  static final String TAG= practica4fragmentmenu.class.getSimpleName();

    private ImageButton botonmenu1,botonmenu2;

    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.practica4menu,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        botonmenu1=view.findViewById(R.id.imageButton41);
        botonmenu2=view.findViewById(R.id.imageButton42);

        botonmenu1.setOnClickListener(this);
        botonmenu2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageButton41:
                cambiarFragmento5();
                break;
            case R.id.imageButton42:
                cambiarFragmento4();
                break;
        }
    }

    private void cambiarFragmento4() {
        manager = getActivity().getSupportFragmentManager();
        transaction = manager.beginTransaction();
        fragment fragmentazul = new fragment();
        transaction.add(R.id.frameLayoutlayout42, fragmentazul, fragment.TAG).commit();
    }

    private void cambiarFragmento5() {

            manager = getActivity().getSupportFragmentManager();
            transaction=manager.beginTransaction();
            practica4ViewImpl fragmentrojo=new practica4ViewImpl();
            transaction.add(R.id.frameLayoutlayout42,fragmentrojo, practica4ViewImpl.TAG).commit();
        }

}
