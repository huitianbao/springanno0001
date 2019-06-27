package com.htb01.test;

import com.htb.Person;
import configClass.MainConfig;
import configClass.MainConfigSec;
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

    @Test
    public void test02(){
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(MainConfigSec.class);
        System.out.println("容器创建完成。。。。。。。。。。");
        String[] names=applicationContext.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);

        }

        System.out.println("下面就要创建实例了。。。。。。。。。。");
        Object person01 = applicationContext.getBean("person");
        Object person02 = applicationContext.getBean("person");
        System.out.println(person01==person02);



    }

}
