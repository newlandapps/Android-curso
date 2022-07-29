package com.digimat.myapplication.bottom_navigation.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.digimat.myapplication.ChecklistFragment;
import com.digimat.myapplication.R;
import com.digimat.myapplication.bottom_navigation.model.NavigationItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

public class BottomNavigationActivity extends AppCompatActivity {
    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        BottomNavigationView navBar = findViewById(R.id.bottom_navigation);


        //Default fragment.
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        //transaction.replace(, null);
        transaction.commit();


        navBar.setOnItemSelectedListener(item -> {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.fragment_profile:
                    fragment = new PerfilFragment();
                    break;
                case R.id.fragment_journey:
                    fragment = new JournyFragment();
                    break;
                case R.id.fragment_checklist:
                    fragment = new ChecklistFragment();
                    break;
                case R.id.ic_menu_threedots:
                    fragment = new OptionMenuFragment();
                    break;
                default:
                    fragment = new PerfilFragment();
                    break;
            }

            transaction = manager.beginTransaction();
            transaction.replace(R.id.fragment_container_options, fragment, null);
            transaction.addToBackStack("myfragments");
            transaction.commit();
            return false;
        });
    }

    public void setupRecyclerView() {

    }

    public void setupData(List<NavigationItem> menuOptionsList) {

    }
}