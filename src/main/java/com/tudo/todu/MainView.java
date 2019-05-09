package com.tudo.todu;


import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("index")
public class MainView extends VerticalLayout {




        public MainView() {
                        add(
            new H1("welcome to my application:"),
                        loginForm());
            setAlignItems(Alignment.CENTER);
        }

    private Component loginForm() {


        TextField nameField = new TextField("Name");
        PasswordField passwordField = new PasswordField("password:");
        Button loginBtn = new Button("login");
        VerticalLayout loginVL = new VerticalLayout(nameField,passwordField,loginBtn);

        loginVL.setWidth("50%");

        return  loginVL;
    }




}
