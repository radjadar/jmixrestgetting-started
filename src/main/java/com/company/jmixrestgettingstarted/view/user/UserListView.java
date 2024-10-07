package com.company.jmixrestgettingstarted.view.user;

import com.company.jmixrestgettingstarted.entity.User;
import com.company.jmixrestgettingstarted.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "users", layout = MainView.class)
@ViewController("User.list")
@ViewDescriptor("user-list-view.xml")
@LookupComponent("usersDataGrid")
@DialogMode(width = "64em")
public class UserListView extends StandardListView<User> {
}