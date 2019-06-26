package com.htb;

import configClass.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
    public static void main(String[] args) {
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean-person.xml");
//        Person person= (Person) applicationContext.getBean("person");
//        System.out.println(person.toString());

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig.class);
        Person person01=applicationContext.getBean(Person.class);
        String[] beanNames=applicationContext.getBeanNamesForType(Person.class);

        System.out.println(person01);
//        System.out.println(beanNames);
        for (int i = 0; i < beanNames.length; i++) {
            String beanName = beanNames[i];
            System.out.println(beanName);

        }
    }

}
