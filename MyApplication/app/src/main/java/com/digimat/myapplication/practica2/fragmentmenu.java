package com.digimat.myapplication.practica2;

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

public class fragmentmenu extends Fragment implements View.OnClickListener{

    public  static final String TAG= fragmentmenu.class.getSimpleName();

    private ImageButton botonmenu1,botonmenu2;

    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment2menu,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        botonmenu1=view.findViewById(R.id.imageButton1);
        botonmenu2=view.findViewById(R.id.imageButton2);

        botonmenu1.setOnClickListener(this);
        botonmenu2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageButton1:
                cambiarFragmento1();
                break;
            case R.id.imageButton2:
                cambiarFragmento2();
                break;
        }
    }

    private void cambiarFragmento2() {
        manager = getActivity().getSupportFragmentManager();
        transaction=manager.beginTransaction();
        fragment3 fragmentrojo=new fragment3();
        transaction.add(R.id.frameLayoutlayout,fragmentrojo,fragmentmenu.TAG).commit();
    }

    private void cambiarFragmento1() {
        manager = getActivity().getSupportFragmentManager();
        transaction=manager.beginTransaction();
        fragment fragmentazul=new fragment();
        transaction.add(R.id.frameLayoutlayout,fragmentazul,fragmentmenu.TAG).commit();
    }
}