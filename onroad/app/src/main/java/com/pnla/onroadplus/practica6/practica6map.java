package com.pnla.onroadplus.practica6;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.location.LocationListener;
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
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.pnla.onroadplus.R;
import com.pnla.onroadplus.practica2.fragment;

import java.util.List;

public class practica6map extends Fragment implements OnMapReadyCallback  {//LocationListener
    public  static final String TAG= practica6map.class.getSimpleName();
    private MapView mView;
    private GoogleMap mMap;
    private double latitude;
    private double longitude;
    private Marker mainIconMarker;
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
        uiSettingsMap(mMap);


        Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {
                markerset();


            }
        }, 6000);
    }
    private void markerset() {
        LatLng newlandapps = new LatLng(19.4853326, -99.1502188);
        BitmapDrawable bitmapdraw = (BitmapDrawable) getResources().getDrawable(R.drawable.bluedot);
        Bitmap b = bitmapdraw.getBitmap();
        Bitmap smallMarker = Bitmap.createScaledBitmap(b, 60, 60, false);
        mainIconMarker= mMap.addMarker(new MarkerOptions().position(newlandapps).icon(  BitmapDescriptorFactory.fromBitmap(smallMarker)));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(newlandapps,16.5f));
    }
    private void uiSettingsMap(GoogleMap mMap) {
        UiSettings uiSettings = mMap.getUiSettings();
        uiSettings.setZoomControlsEnabled(true);
        mMap.setPadding (0, 1400, 0, 80);
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










































//    @Override
//    public void onLocationChanged(@NonNull Location location) {
//        this.latitude=location.getLatitude();
//        this.longitude=location.getLongitude();
//        if(mainIconMarker!=null) {
//            mainIconMarker.setPosition(new LatLng(latitude, longitude));
//            LatLng myloc = new LatLng(latitude, longitude);
//            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myloc, 16.5f));
//            Log.e("findlocation", " update for      Lat:" + latitude + "   Long: " + longitude);
//        }
//    }