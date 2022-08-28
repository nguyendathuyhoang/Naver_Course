package com.Likelion22.Homework_Week22.DesignPattern.Controller;

import com.Likelion22.Homework_Week22.DesignPattern.ComputerFactory.Computer;
import com.Likelion22.Homework_Week22.DesignPattern.Factory.ComputerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("factory-method")
public class FactoryMethodController {
    @Autowired
    private ComputerFactory computerFactory;

    @GetMapping(value = "/{type}")
    public String getMethod(@PathVariable("type") String type)
    {
        Computer computer = computerFactory.getComputer(type);
        System.out.println("Type: "+type);
        System.out.println("Computer: "+computer.getType());
        return computer.getType();
    }
}
