package com.htb01.test;

import configClass.MainConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {
    @Test
    public void test01(){

        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(MainConfig.class);

        String[] names=applicationContext.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);

        }

    }

}
