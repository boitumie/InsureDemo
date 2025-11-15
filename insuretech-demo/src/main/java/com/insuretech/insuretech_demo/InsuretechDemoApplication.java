package com.insuretech.insuretech_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

@SpringBootApplication
public class InsuretechDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuretechDemoApplication.class, args);
        int[] numbers = {1,2,3,4};
        Date today = new Date();

        today.getDate();
        System.out.println(Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Your name is :" + name);



	}

}

