package com.Likelion22.Homework_Week22.DesignPattern.Factory;

import com.Likelion22.Homework_Week22.DesignPattern.ComputerFactory.Computer;
import com.Likelion22.Homework_Week22.DesignPattern.SubClasses.PC;
import com.Likelion22.Homework_Week22.DesignPattern.SubClasses.Server;
import org.springframework.stereotype.Repository;

@Repository
public class ComputerFactory {
    public static Computer getComputer(String type)
    {
        if ("PC".equalsIgnoreCase(type))
        {
            return new PC();
        }
        else if ("Server".equalsIgnoreCase(type))
        {
            return new Server();
        }
        return null;
    }
}
