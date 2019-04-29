package com.CoffeList.CoffeList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class getIndex {
@RequestMapping(value = "/welcome", method = RequestMethod.GET)
protected getIndex(){
        greeting();
    }

    public String greeting(){

        return  "Welcom the coffee app";



    }

}
