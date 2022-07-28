package com.digimat.myapplication.bottom_navigation.callback;

import com.digimat.myapplication.bottom_navigation.model.NavigationItem;

import java.util.List;

public interface MenuServerCallback extends ServerCallback {
    void getAllMenuOptionsServer(List<NavigationItem> menuOptionsList);
}
