package com.digimat.myapplication.practica4.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.digimat.myapplication.R;
import com.digimat.myapplication.practica4.adapter.adapterEmpleados;
import com.digimat.myapplication.practica4.model.Datum;
import com.digimat.myapplication.practica4.presenter.presenterpractica4;
import com.digimat.myapplication.practica4.presenter.presenterInterface;

import java.util.List;

public class practica4ViewImpl extends Fragment implements practica4View{
    private presenterInterface presenter;
    public  static final String TAG= practica4ViewImpl.class.getSimpleName();

    private List<Datum> empleados;

    private adapterEmpleados adapter;
    private RecyclerView rv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment4,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        rv=view.findViewById(R.id.rvemployes);
        presenter= new presenterpractica4(this,getContext());
        presenter.requestEmployes();

    }

    @Override
    public void setEmpleados(List<Datum> data) {
        this.empleados=data;
        if(empleados!=null)
        {
            fillEmpleados(empleados);
        }
    }

    private void fillEmpleados(List<Datum> empleados) {
        adapter=new adapterEmpleados(empleados,getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }
}
