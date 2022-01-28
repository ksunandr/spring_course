package org.ksun.pets.udemy.course;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog constructor");
    }

    @Override
    public void say() {
        System.out.println("Dog say Bow");
    }


    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }


}
