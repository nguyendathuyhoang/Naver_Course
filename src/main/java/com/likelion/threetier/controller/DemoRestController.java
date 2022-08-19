package com.likelion.threetier.controller;

import com.likelion.threetier.model.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/json")
    public String json()
    {
        return "Helo from json file";
    }

    @GetMapping("/Girl")
    public String Clothing()
    {
        //ApplicationContext a = null;
        Girl girl = (Girl)context.getBean(Girl.class);
        String wear = girl.outfit.wear();
        return wear;
    }
}
