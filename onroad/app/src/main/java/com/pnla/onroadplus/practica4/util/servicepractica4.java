package com.pnla.onroadplus.practica4.util;



import com.pnla.onroadplus.Retrofit.retrofitEndpoints;
import com.pnla.onroadplus.practica4.model.request;
import com.pnla.onroadplus.practica4.model.response;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface servicepractica4 {
    @POST(retrofitEndpoints.GET_EMPLOYES)/** pinta lempleados del mapa*/
    Call<response> getempleados(@Body request request);
}
