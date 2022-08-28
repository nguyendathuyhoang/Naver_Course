package com.Likelion22.Homework_Week22;

import com.Likelion22.Homework_Week22.DesignPattern.ComputerFactory.Computer;
import com.Likelion22.Homework_Week22.DesignPattern.Factory.ComputerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

//		Computer pc = ComputerFactory.getComputer("PC");
//		System.out.println("Computer: "+pc);
//		Computer server = ComputerFactory.getComputer("Server");
//		System.out.println("Computer: "+server);
	}

}
