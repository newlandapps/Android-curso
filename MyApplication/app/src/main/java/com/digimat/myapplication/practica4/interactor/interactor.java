package com.digimat.myapplication.practica4.interactor;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

import com.digimat.myapplication.Retrofit.General_constants;
import com.digimat.myapplication.Retrofit.retrofitClient;
import com.digimat.myapplication.practica4.model.Datum;
import com.digimat.myapplication.practica4.model.request;
import com.digimat.myapplication.practica4.model.response;
import com.digimat.myapplication.practica4.presenter.presenterpractica4;
import com.digimat.myapplication.practica4.util.servicepractica4;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class interactor implements interactorInterface{
    private presenterpractica4 presenter;
    private Context context;

    private servicepractica4 service;
    private Retrofit retrofit;
    public interactor(presenterpractica4 presenter, Context context) {
        this.presenter=presenter;
        this.context=context;
        retrofit = retrofitClient.getRetrofitInstance();
       service = retrofit.create(servicepractica4.class);
    }

    @Override
    public void requestEmpleados() {

            requestEmpleados("a871fb54b08d4894afb2cd5780543d16",true); 

    }

    private void requestEmpleados(String token, boolean b) {
        request req=new request(b,token);
        Call<response>call= service.getempleados(req);
        call.enqueue(new Callback<response>() {
            @Override
            public void onResponse(Call<response> call, Response<response> response) {
                Log.e("rsponsecode",""+response.code());
               if(response.code()==200)
               {
                   getempleadosdata(response, context);
               }
            }

            @Override
            public void onFailure(Call<response> call, Throwable t) {
                Toast.makeText(context,""+t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getempleadosdata(Response<response> response, Context context) {
        response resp=response.body();
        if(resp!=null)
        {
            String message= resp.getMessage();
            int responsCode=resp.getResponseCode();
            if(responsCode==105)
            {
                List<Datum> data=resp.getData();
                presenter.setEmpleados(data);
            }
        }
    }


}
