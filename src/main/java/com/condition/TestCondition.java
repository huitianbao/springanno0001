package com.condition;

import configClass.MainConfigSec;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @description:
 * @author: htb
 * @createDate: 2019/6/26
 * @version: 1.0
 */
public class TestCondition {
    @Test
    public void test01(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfigSec.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            String beanDefinitionName = beanDefinitionNames[i];
            System.out.println(beanDefinitionName);

        }
    }
}
