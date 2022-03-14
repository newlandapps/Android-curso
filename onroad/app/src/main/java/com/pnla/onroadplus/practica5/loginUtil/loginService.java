package com.pnla.onroadplus.practica5.loginUtil;

import com.pnla.onroadplus.Retrofit.retrofitEndpoints;
import com.pnla.onroadplus.practica5.loginModel.loginRequest;
import com.pnla.onroadplus.practica5.loginModel.loginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface loginService {
    @POST(retrofitEndpoints.LOGIN)
    Call<loginResponse> getlogin(@Body loginRequest request);
}
