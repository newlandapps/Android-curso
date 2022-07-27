package com.digimat.myapplication.bottom_navigation.callback;

import com.digimat.myapplication.bottom_navigation.model.MenuOption;

import java.util.List;

public interface MenuServerCallback extends ServerCallback {
    void getAllMenuOptionsServer(List<MenuOption> menuOptionsList);
}
