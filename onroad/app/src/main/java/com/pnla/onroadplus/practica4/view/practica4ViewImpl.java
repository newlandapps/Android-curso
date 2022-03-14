package com.pnla.onroadplus.practica4.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pnla.onroadplus.R;
import com.pnla.onroadplus.practica4.adapter.adapterEmpleados;
import com.pnla.onroadplus.practica4.model.Datum;
import com.pnla.onroadplus.practica4.presenter.presenterpractica4;
import com.pnla.onroadplus.practica4.presenter.presenterInterface;

import java.util.ArrayList;
import java.util.List;

public class practica4ViewImpl extends Fragment implements practica4View{
    private presenterInterface presenter;
    public  static final String TAG= practica4ViewImpl.class.getSimpleName();

    private List<Datum> empleados;

    private adapterEmpleados adapter;
    private RecyclerView rv;
    private SearchView searchView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment4,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        rv=view.findViewById(R.id.rvemployes);
        searchView=view.findViewById(R.id.searchviewEmpleados);
        presenter= new presenterpractica4(this,getContext());
        presenter.requestEmployes();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                List<Datum> dataEmpleados = filterZones(empleados, newText);//List<datarequesZonas> dataZones
                if(dataEmpleados!=null) {
                    adapter.setFilter(dataEmpleados);

                }
                return false;
            }});
    }

    private List<Datum> filterZones(List<Datum> empleados, String newText) {
        List<Datum> filteredList = new ArrayList<>();
        newText = newText.toLowerCase();
        for (Datum employe : empleados) {
            String empleado = employe.getEmployeeName().toLowerCase();
            if (empleado.contains(newText)) {
                filteredList.add(employe);
            }
        }
        return filteredList;


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
