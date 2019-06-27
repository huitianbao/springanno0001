package com.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @description:
 * @author: htb
 * @createDate: 2019/6/26
 * @version: 1.0
 */
public class WindowsCondition implements Condition {
    /**
     *
     * @param conditionContext   判断条件使用的上下文
     * @param annotatedTypeMetadata   注释信息
     * @return boolean
     * @since v1.0.0
     * <PRE>
     * author htb
     * date 2019/6/26
     * </PRE>
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        ClassLoader classLoader = conditionContext.getClassLoader();
        Environment environment = conditionContext.getEnvironment();
        //bean的注册类
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        String property = environment.getProperty("os.name");
        boolean person = registry.containsBeanDefinition("person");
        if (person){
            System.out.println("包含 person");
        }else {
            System.out.println("--------------------"+registry.containsBeanDefinition("person"));
            System.out.println("不包含 person");
        }

        if (property.contains("Windows")){
            return true;
        }else {
            return false;
        }



    }
}
