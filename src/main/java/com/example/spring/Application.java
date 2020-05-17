package com.example.spring;

import com.example.spring.api.UserController;
import com.sun.tools.javac.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

import java.util.UUID;

@SpringBootApplication
@EnableCaching
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

//		ApplicationContext cxt = SpringApplication.run(Main.class, args);
//		UserController userController = cxt.getBean(UserController.class);

//		System.out.println(userController.getUsers(1));
//
//		System.out.println(userController.removeUser(3));


	}


}
