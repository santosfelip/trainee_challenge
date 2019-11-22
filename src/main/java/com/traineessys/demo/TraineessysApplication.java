package com.traineessys.demo;

import controler.ControllerData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class TraineessysApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraineessysApplication.class, args);
        ControllerData controllerData = new ControllerData();
		System.out.println(new File(".").getAbsolutePath());
        System.out.println(controllerData.AccessData());

	}

}
