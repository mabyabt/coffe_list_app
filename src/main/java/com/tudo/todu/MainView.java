package com.tudo.todu;


import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("index")
public class MainView extends VerticalLayout {




        public MainView() {
                        add(
                               // darkLightTheme(),
            new H1("welcome to my application:"),
                        loginForm());
            setAlignItems(Alignment.CENTER);
        }


      /*  private Component darkLightTheme(){
            Tab tabLight = new Tab("Light ");
            Tab tabDark = new Tab("Dark ");
            Tabs tabs = new Tabs(tabDark,tabLight);
            setAlignItems(Alignment.START);

            HorizontalLayout hl = new HorizontalLayout(tabs);


            return  hl;

        }*/


    private Component loginForm() {


        TextField nameField = new TextField("Name");
        PasswordField passwordField = new PasswordField("Password:");
        Button loginBtn = new Button("Login");
        VerticalLayout loginVL = new VerticalLayout(nameField,passwordField,loginBtn);

        loginVL.setWidth("50%");
            loginVL.setAlignItems(Alignment.CENTER);
        return  loginVL;
    }




}
