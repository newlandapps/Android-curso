package com.digimat.myapplication.bottom_navigation.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.digimat.myapplication.R;
import com.digimat.myapplication.bottom_navigation.model.NavigationItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

public class BottomNavigationActivity extends AppCompatActivity {
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        BottomNavigationView bottomNavigation = findViewById(R.id.bottom_navigation);
        manager = getSupportFragmentManager();

        bottomNavigation.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.fragment_profile:
                    Toast.makeText(this, "profile", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fragment_journey:
                    Toast.makeText(this, "journey", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fragment_checklist:
                    Toast.makeText(this, "checklist", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.ic_menu_threedots:
                    transaction = manager.beginTransaction().setReorderingAllowed(true);
                    transaction.replace(R.id.fragment_container_options, OptionMenuFragment.class, null);
                    transaction.commit();

            }
            return false;
        });
    }

    public void setupRecyclerView() {

    }

    public void setupData(List<NavigationItem> menuOptionsList) {

    }
}