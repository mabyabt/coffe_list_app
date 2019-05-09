package com.tudo.todu;


import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("index")
public class MainView extends VerticalLayout {




        public MainView() {
                        add(
            new H1("hello word"));

        }




}
