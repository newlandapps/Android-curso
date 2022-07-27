package com.digimat.myapplication.bottom_navigation.interactor;

import com.digimat.myapplication.bottom_navigation.callback.MenuServerCallback;
import com.digimat.myapplication.bottom_navigation.model.MenuOption;
import com.digimat.myapplication.bottom_navigation.model.MenuOptionRequest;
import com.digimat.myapplication.bottom_navigation.model.MenuOptionResponse;
import com.digimat.myapplication.bottom_navigation.util.MenuApiHelper;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MenuInteractor implements MenuOptionInteractor {
    MenuApiHelper apiService;

    public MenuInteractor(MenuApiHelper mApiService) {

    }

    public void getAllOnRoadMenu(String token, MenuServerCallback callback) {
        MenuOptionRequest request = new MenuOptionRequest(1144, "e93ef7aa19e17cfcdeff059641a2e4bc");

        apiService.getAllMenuOptions(request, new Callback<MenuOptionResponse>() {
            @Override
            public void onResponse(Call<MenuOptionResponse> call, Response<MenuOptionResponse> response) {
                if (!response.isSuccessful()) {
                    //Mandar error
                }

                List<MenuOption> menuOptionsList = response.body().getData();

                if (menuOptionsList.isEmpty()) {
                    //Mandar error de data vacia.
                }

                callback.getAllMenuOptionsServer(menuOptionsList);
            }

            @Override
            public void onFailure(Call<MenuOptionResponse> call, Throwable t) {

            }
        });
    }
}
