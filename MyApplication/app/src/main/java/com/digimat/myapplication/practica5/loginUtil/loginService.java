package com.digimat.myapplication.practica5.loginUtil;

import com.digimat.myapplication.Retrofit.retrofitEndpoints;
import com.digimat.myapplication.practica5.loginModel.loginRequest;
import com.digimat.myapplication.practica5.loginModel.loginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface loginService {
    @POST(retrofitEndpoints.LOGIN)
    Call<loginResponse> getlogin(@Body loginRequest request);
}
