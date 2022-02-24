package com.digimat.myapplication.practica5.loginView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.digimat.myapplication.R;
import com.digimat.myapplication.practica3.practica3;
import com.digimat.myapplication.practica4.view.practica4;
import com.digimat.myapplication.practica5.loginPresenter.loginPresenter;
import com.digimat.myapplication.practica5.loginPresenter.loginPresenterImpl;

public class loginFragmentViewImpl extends Fragment implements loginFragmentView ,View.OnClickListener {
    public  static final String TAG= loginFragmentViewImpl.class.getSimpleName();

    private CardView btnLogin;
    private EditText edtUserOrEmail,edtPassword;
    private loginPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.login_fragment,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        edtUserOrEmail = view.findViewById(R.id.edtUserOrEmail);
        edtPassword = view.findViewById(R.id.edtPassword);
        edtPassword.setText(null);
        edtUserOrEmail.setText(null);
        btnLogin = view.findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);

        presenter = new loginPresenterImpl(this,getContext());
    }
    @Override
    public void succes() {
        Intent intent = new Intent(getActivity(), practica4.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                //Toast.makeText(getContext(), "got to login", Toast.LENGTH_SHORT).show();
                presenter.requestLoginData(edtUserOrEmail.getText().toString(), edtPassword.getText().toString());
                break;
        }
    }


}
