package com.digimat.myapplication.practica5.loginInteractor;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.digimat.myapplication.Retrofit.General_constants;
import com.digimat.myapplication.Retrofit.retrofitClient;
import com.digimat.myapplication.practica5.loginModel.loginData;
import com.digimat.myapplication.practica5.loginModel.loginRequest;
import com.digimat.myapplication.practica5.loginModel.loginResponse;
import com.digimat.myapplication.practica5.loginPresenter.loginPresenter;
import com.digimat.myapplication.practica5.loginPresenter.loginPresenterImpl;
import com.digimat.myapplication.practica5.loginUtil.loginService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class loginInteractorImpl implements  loginInteractor {

       private loginPresenter presenter;
       private Context context;
       private loginService services;
       public loginInteractorImpl( loginPresenter presenter, Context context) {
           this.presenter = presenter;
           this.context = context;
           Retrofit client = retrofitClient.getRetrofitInstance();
           services = client.create(loginService.class);
        }

    @Override
    public void requestLogin(String user, String password) {
//        SharedPreferences preferences = context.getSharedPreferences(General_constants.CREDENTIALS_PREFERENCES, Context.MODE_PRIVATE);
//
//        String userName = preferences.getString(General_constants.USER_PREFERENCES, null);
//        String passs = preferences.getString(General_constants.PASSWORD_PREFERENCES, null);

            resquesLoginData(user,password);        

        
    }

    private void resquesLoginData(String user, String password) {
        loginRequest request = new loginRequest(user, password);
        services.getlogin(request).enqueue(new Callback<loginResponse>() {
            @Override
            public void onResponse(Call<loginResponse> call, Response<loginResponse> response) {
            if(response.code()==200)
            {
                getUserData(response, user, password);
            }else
            {
                Toast.makeText(context, "algo salio mal "+response.code(), Toast.LENGTH_SHORT).show();
            }
            }

            @Override
            public void onFailure(Call<loginResponse> call, Throwable t) {
                Toast.makeText(context, "algo salio mal "+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void getUserData(Response<loginResponse> response, String user, String password) {
        loginResponse resp=response.body();
        if (resp != null) {
            int responseCode = resp.getResponseCode();
            if (responseCode == 100) {
                loginData userData = resp.getData();
                if(userData!=null) {
                    String userName=userData.getEmployeeName();
                    String token=userData.getToken();
                    String email=userData.getEmail();
                    String urlImage=userData.getUserImage();

                    Toast.makeText(context, ""+userName+"   "+email, Toast.LENGTH_SHORT).show();
//                    SharedPreferences preferences = context.getSharedPreferences("credentials", Context.MODE_PRIVATE);
//                    SharedPreferences.Editor editor = preferences.edit();
//                    editor.putString("userName", userName);  //lo devuelve el web service
//                    editor.putString("user", user);  //ingresado por usuario
//                    editor.putString("urlImage", urlImage);
//                    editor.putString("token", token);
//                    editor.putString("password", password);
//                    editor.putString("email", email);
//                    editor.commit();
                }
            }

            }
    }

}

