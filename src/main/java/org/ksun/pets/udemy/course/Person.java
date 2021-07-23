package org.ksun.pets.udemy.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
private Pet pet;
private String surname;
private int age;

//@Autowired
//    public Person(Pet pet) {
//        System.out.println("Person constructor");
//        this.pet = pet;
//
//    }

    public Person() {
        System.out.println("default Person constructor");
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


@Autowired
    public void setPet(Pet pet) {

        System.out.println("Person.setPet");
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Person.callPet");
        pet.say();
    }
}
