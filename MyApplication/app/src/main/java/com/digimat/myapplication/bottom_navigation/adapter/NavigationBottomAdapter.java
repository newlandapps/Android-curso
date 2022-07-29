package com.digimat.myapplication.bottom_navigation.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.digimat.myapplication.R;
import com.digimat.myapplication.bottom_navigation.model.NavigationItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NavigationBottomAdapter extends RecyclerView.Adapter<NavigationBottomViewHolder> {
    private List<NavigationItem> mMenuOptionList;
    private LayoutInflater mInflater;
    Map<String, String> icon_navigation = new HashMap<String, String>();

    public NavigationBottomAdapter(Context context, List<NavigationItem> menuOptionList) {
        mInflater = LayoutInflater.from(context);
        mMenuOptionList = menuOptionList;
        setupIcon();
    }

    @NonNull
    @Override
    public NavigationBottomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.navigation_bottom_item, parent, false);
        return new NavigationBottomViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull NavigationBottomViewHolder holder, int position) {
        NavigationItem menuItem = mMenuOptionList.get(position);
        holder.render(menuItem);
    }

    @Override
    public int getItemCount() {
        return mMenuOptionList.size();
    }

    public void setupIcon() {
        String prefix = "ic_navigation_";
        icon_navigation.put("Perfil", prefix + "perfil");
        icon_navigation.put("Rastreo", prefix + "rastreo");
        icon_navigation.put("Unidades", prefix + "unidades");
        icon_navigation.put("Notificaciones", prefix + "notificaciones");
        icon_navigation.put("Geozonas", prefix + "geozonas");
        icon_navigation.put("Checklist", prefix + "checklist");
    }

    public String searchIcon(String objName) {
        String iconname = icon_navigation.get(objName);
        return iconname;
    }
}