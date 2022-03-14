package com.pnla.onroadplus.practica2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.pnla.onroadplus.R;
import com.pnla.onroadplus.Retrofit.General_constants;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

public class fragment extends Fragment  {//OnMapReadyCallback

    public  static final String TAG= fragment.class.getSimpleName();
//    private GoogleMap mMap;
//    private MapView mView;

    private TextView email;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.restore_pasword,container,false);
        initView(view);

        return view;
    }

    private void initView(View view) {
        email=view.findViewById(R.id.emailProfile);

        SharedPreferences preferences = getContext().getSharedPreferences(General_constants.CREDENTIALS_PREFERENCES, Context.MODE_PRIVATE);
        String emaiString = preferences.getString(General_constants.EMAIL, null);
        email.setText(emaiString);
      //  mView = view.findViewById(R.id.mapsZonas);
    }

//    @Override
//    public void onMapReady(@NonNull GoogleMap googleMap) {
//        mMap = googleMap;
//        LatLng newlands = new LatLng(19.485152,-99.149681);
//
//
//        //mMap.addMarker(new MarkerOptions().position(torreon).title("Bienvenido a quesipizzas"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(newlands,13f));
//        mMap.animateCamera(CameraUpdateFactory.zoomIn());
//        mMap.animateCamera(CameraUpdateFactory.zoomTo(12), 2000, null);
//    }
//    @Override
//    public void onStart() {
//        super.onStart();
//        mView.onStart();
//    }
}
