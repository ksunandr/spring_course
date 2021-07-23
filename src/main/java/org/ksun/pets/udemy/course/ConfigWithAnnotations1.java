package org.ksun.pets.udemy.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContext3.xml");
        Person person = context.getBean("person", Person.class); //defoult bean id
        person.callPet();

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();
        context.close();

    }
}
