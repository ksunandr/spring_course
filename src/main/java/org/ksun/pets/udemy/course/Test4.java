package org.ksun.pets.udemy.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog mydog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);
        System.out.println(mydog==yourDog);
        System.out.println(mydog);
        System.out.println(yourDog);
        context.close();
    }
}
