package org.ksun.pets.udemy.course;

public class Dog implements Pet {
    public Dog() {
        System.out.println("constructor");
    }

    @Override
    public void say() {
        System.out.println("B");
    }


    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }


}
