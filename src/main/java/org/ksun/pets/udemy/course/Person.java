package org.ksun.pets.udemy.course;

public class Person {
private Pet pet;
private String surname;
private int age;

//    public Person(Pet pet) {
//        this.pet = pet;
//
//    }


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

    public Person() {

    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("call pet");
        pet.say();
    }
}
