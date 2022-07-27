package com.digimat.myapplication.bottom_navigation.presenter;

public interface ActionListenerCallback {

    public void onActionSuccess(String successMessage);

    public void onActionFailure(Throwable throwableError);


    public void onNetworkError();


    public void onServerError();
}
