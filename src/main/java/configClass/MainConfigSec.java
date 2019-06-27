package configClass;

import com.condition.LinuxCondition;
import com.condition.WindowsCondition;
import com.htb.Person;
import org.springframework.context.annotation.*;

/*
scope
prototype   多实例的
singleton  单实例的   默认值
request  同一个 request
session  同一个 session


单实例的时候  容器启动就创建
多实例的时候  容器启动不创建，使用的时候创建

懒加载  单实例
    容器启动不创建，第一次使用的时候再创建对象，初始化

 */
@Configuration
//满足条件，类中注册的 bean才会生效
//@Conditional({WindowsCondition.class})
@Conditional({LinuxCondition.class})
public class MainConfigSec {

//    @Scope("prototype")
    @Lazy
    @Bean("person")
    Person person(){
        System.out.println("创建   bean  实例。。。。。。。。。。。。");
        return new Person(18,"htbhtb");

    }

//    @Conditional({WindowsCondition.class})
    @Bean("bill")
    Person person01(){
        return new Person(60,"Bill");
    }

//    @Conditional({LinuxCondition.class})
    @Bean("linus")
    Person person02(){
        return new Person(48,"Liuns");
    }
}
