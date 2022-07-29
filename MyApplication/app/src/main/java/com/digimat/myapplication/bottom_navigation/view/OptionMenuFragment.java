package com.digimat.myapplication.bottom_navigation.view;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.digimat.myapplication.R;
import com.digimat.myapplication.bottom_navigation.adapter.NavigationBottomAdapter;
import com.digimat.myapplication.bottom_navigation.model.NavigationItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OptionMenuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OptionMenuFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private View view;

    private RecyclerView recyclerViewNav, recyclerView;
    private NavigationBottomAdapter mAdapter;
    private NavigationBottomAdapter mAdapter2;

    public OptionMenuFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OptionsMenuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OptionMenuFragment newInstance(String param1, String param2) {
        OptionMenuFragment fragment = new OptionMenuFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        // This callback will only be called when MyFragment is at least Started.
        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                //Aqui va logica.
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Ocultar el navbar
        BottomNavigationView navBar = getActivity().findViewById(R.id.bottom_navigation);


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_navigation_recyclerview, container, false);

        navBar.setVisibility(view.GONE);

        ImageView back = view.findViewById(R.id.imageView2);


        back.setOnClickListener(view1 -> {
            Vibrator v = (Vibrator) view.getContext().getSystemService(view.getContext().VIBRATOR_SERVICE);
            v.vibrate(65); // 5000 miliseconds = 5 seconds

            FragmentManager manager = getParentFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            Toast.makeText(view.getContext(), "Atras", Toast.LENGTH_SHORT).show();
            transaction
                    .isAddToBackStackAllowed();
            transaction.commit();
        });


        //Dummy data
        List<NavigationItem> navigationItem = new ArrayList<>();
        navigationItem.add(new NavigationItem(1145, "Perfil", true));
        navigationItem.add(new NavigationItem(1146, "Rastreo", true));
        navigationItem.add(new NavigationItem(1147, "Unidades", true));
        navigationItem.add(new NavigationItem(1148, "Notificaciones", true));
        navigationItem.add(new NavigationItem(1149, "Geozonas", true));
        navigationItem.add(new NavigationItem(1150, "Contacto", true));
        navigationItem.add(new NavigationItem(2107, "Checklist", true));


        recyclerViewNav = view.findViewById(R.id.menuappbar_icon_visible);
        RecyclerView recyclerView = view.findViewById(R.id.menuappbar_icon_invisible);

        mAdapter = new NavigationBottomAdapter(view.getContext(), navigationItem);

        recyclerViewNav.setAdapter(mAdapter);

//        mAdapter2 = new NavigationBottomAdapter(view.getContext(), navigationItem2);
        recyclerView.setAdapter(mAdapter);


        //decorator
        RecyclerView.ItemDecoration decoration = new DividerItemDecoration(view.getContext(), DividerItemDecoration.VERTICAL);

        recyclerView.addItemDecoration(decoration);
        recyclerViewNav.addItemDecoration(decoration);

        recyclerViewNav.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_menu_options, container, false);
        return view;
    }
}