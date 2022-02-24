package com.digimat.myapplication.practica4.presenter;

import android.content.Context;

import com.digimat.myapplication.practica4.interactor.interactor;
import com.digimat.myapplication.practica4.interactor.interactorInterface;
import com.digimat.myapplication.practica4.model.Datum;
import com.digimat.myapplication.practica4.view.practica4View;

import java.util.List;

public class presenterpractica4 implements  presenterInterface{
    private practica4View view;
    private Context context;
    private interactorInterface interactor;


    public presenterpractica4(practica4View view, Context context) {
        this.view=view;
        this.context=context;
        interactor=new interactor(this,context);

    }

    @Override
    public void requestEmployes() {
        if(view!=null)
        {
        interactor.requestEmpleados();
        }
    }
    @Override
    public void setEmpleados(List<Datum> data) {
        if(view!=null)
        {
            view.setEmpleados(data);
        }
    }

}
