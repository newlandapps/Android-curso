package com.digimat.myapplication.bottom_navigation.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.digimat.myapplication.R;
import com.digimat.myapplication.bottom_navigation.model.NavigationItem;

import java.util.List;

public class NavigationBottomAdapter extends RecyclerView.Adapter<NavigationBottomViewHolder> {
    private List<NavigationItem> mMenuOptionList;
    private LayoutInflater mInflater;

    public NavigationBottomAdapter(Context context, List<NavigationItem> menuOptionList) {
        mInflater = LayoutInflater.from(context);
        mMenuOptionList = menuOptionList;
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
}