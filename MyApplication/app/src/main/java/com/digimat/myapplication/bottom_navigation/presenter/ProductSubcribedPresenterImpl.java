package com.digimat.myapplication.bottom_navigation.presenter;

import android.content.Context;
import android.util.Log;

import com.digimat.myapplication.bottom_navigation.callback.MenuServerCallback;
import com.digimat.myapplication.bottom_navigation.interactor.MenuInteractor;
import com.digimat.myapplication.bottom_navigation.model.MenuOption;
import com.digimat.myapplication.bottom_navigation.view.BottomNavigationActivity;

import java.util.List;

public class ProductSubcribedPresenterImpl {
    private Context context;
    private BottomNavigationActivity view;
    private MenuInteractor interactor;


    public ProductSubcribedPresenterImpl(BottomNavigationActivity mView, Context mContext) {
        view = mView;
        context = mContext;

    }

    public void onListener() {
        interactor.getAllOnRoadMenu("token", new MenuServerCallback() {
            @Override
            public void getAllMenuOptionsServer(List<MenuOption> menuOptionsList) {
                menuOptionsList.forEach(menu -> {
                    Log.d("option", menu.getObjName());
                });
                //viewRecyclerView.displayMenu();
            }

            @Override
            public void onNetworkError() {

            }

            @Override
            public void onServerError() {

            }
        });
    }
}
