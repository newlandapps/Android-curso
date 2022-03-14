package com.pnla.onroadplus.practica6;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.pnla.onroadplus.R;
import com.pnla.onroadplus.practica2.fragment;

public class practica6map extends Fragment implements OnMapReadyCallback {
    public  static final String TAG= practica6map.class.getSimpleName();
    private MapView mView;
    private GoogleMap mMap;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_map,container,false);
        initView(view);
        mView.onCreate(savedInstanceState);
        if (mView != null) {
            mView.getMapAsync(this);
        }
        return view;
    }

    private void initView(View view) {
        mView = view.findViewById(R.id.map_view_tracking);


    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        mMap.clear();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(19.3775177, -99.2354137), 2.0f));
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(19.3775177, -99.2354137), 5.5f));
            }
        }, 4000);
    }
    @Override
    public void onStart() {
        super.onStart();
        mView.onStart();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
    @Override
    public void onResume() {
        super.onResume();
        mView.onResume();
    }
}
