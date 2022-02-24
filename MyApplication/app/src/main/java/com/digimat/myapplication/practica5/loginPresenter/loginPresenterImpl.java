package com.digimat.myapplication.practica5.loginPresenter;

import android.content.Context;

import com.digimat.myapplication.practica5.loginInteractor.loginInteractor;
import com.digimat.myapplication.practica5.loginInteractor.loginInteractorImpl;
import com.digimat.myapplication.practica5.loginView.loginFragmentView;

public class loginPresenterImpl implements  loginPresenter{

    private loginFragmentView view;
    private loginInteractor interactor;
    private Context context;
    public loginPresenterImpl(loginFragmentView view,Context context)
    {
        this.view=view;
        this.context=context;
        interactor=new loginInteractorImpl(this,context);

    }

    @Override
    public void requestLoginData(String user, String password) {
        if(view!=null)
        {
            interactor.requestLogin(user,password);
        }
    }

    @Override
    public void succes() {
        if(view!=null) {
          view.succes();
        }
    }
}
