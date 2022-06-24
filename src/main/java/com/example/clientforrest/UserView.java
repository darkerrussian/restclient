package com.example.clientforrest;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class UserView extends VerticalLayout {

    public UserView(UserService userService){
        Grid grid = new Grid<User>(User.class);
        grid.setItems(userService.getUsers());

        grid.setColumns("id", "login", "pass", "name", "phone", "adress");
        add(grid);
    }
}
