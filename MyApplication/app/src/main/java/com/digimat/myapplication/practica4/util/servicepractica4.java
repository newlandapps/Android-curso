package com.digimat.myapplication.practica4.util;

import com.digimat.myapplication.Retrofit.retrofitEndpoints;
import com.digimat.myapplication.practica4.model.request;
import com.digimat.myapplication.practica4.model.response;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface servicepractica4 {
    @POST(retrofitEndpoints.GET_EMPLOYES)/** pinta lempleados del mapa*/
    Call<response> getempleados(@Body request request);
}
