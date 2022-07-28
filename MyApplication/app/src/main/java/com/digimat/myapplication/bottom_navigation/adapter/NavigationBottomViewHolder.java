package com.digimat.myapplication.bottom_navigation.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.digimat.myapplication.R;
import com.digimat.myapplication.bottom_navigation.model.NavigationItem;

import java.util.ArrayList;
import java.util.List;

public class NavigationBottomViewHolder extends RecyclerView.ViewHolder {
    public TextView txtvw;
    private ImageView imgvw_navigation_btn;
    private ImageView imgvw_navigation_img;
    final NavigationBottomAdapter mAdapter;
    private Context context;

    private Resources resources;


    public NavigationBottomViewHolder(@NonNull View itemView, NavigationBottomAdapter adapter) {
        super(itemView);
        //setupItemView(itemView);
        context = itemView.getContext();
        resources = itemView.getResources();

        txtvw = itemView.findViewById(R.id.text);
        imgvw_navigation_img = itemView.findViewById(R.id.imgvw_navigation_img);
        imgvw_navigation_btn = itemView.findViewById(R.id.imgvw_navigation_btn);

        mAdapter = adapter;
    }

    private void setupItemView(View itemView) {

        imgvw_navigation_img = itemView.findViewById(R.id.imgvw_navigation_img);
        imgvw_navigation_btn = itemView.findViewById(R.id.imgvw_navigation_btn);
    }


    @SuppressLint("ResourceAsColor")
    public void render(NavigationItem menuItem) {
        String objName = menuItem.getObjName();
        txtvw.setText(objName);

        Drawable drawable = resources.getDrawable(R.drawable.ic_navigation_perfil, resources.newTheme());

        imgvw_navigation_img.setImageDrawable(drawable);

    }

    public Drawable searchNavigationItem(String objName) {
        String res_name = "ic_navigation_" + objName.toLowerCase();


        int identifier = resources.getIdentifier(res_name, "drawable", this.context.getPackageName());
        Drawable icon = resources.getDrawable(identifier);

        List<String> icon_navigation = new ArrayList<>();
        icon_navigation.add("icon_navigation_");
        if (icon != null) {
            return icon;
        }
        return null;
    }
}
