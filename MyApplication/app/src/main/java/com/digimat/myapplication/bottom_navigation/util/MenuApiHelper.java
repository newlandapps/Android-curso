package com.digimat.myapplication.bottom_navigation.util;


import com.digimat.myapplication.bottom_navigation.model.MenuOptionRequest;
import com.digimat.myapplication.bottom_navigation.model.MenuOptionResponse;


import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MenuApiHelper {
    @POST("login/menuAppbar")
    void getAllMenuOptions(@Body MenuOptionRequest request, Callback<MenuOptionResponse> serverResponse);
}
