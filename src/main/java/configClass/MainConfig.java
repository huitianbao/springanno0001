package configClass;

import com.htb.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.htb01")
public class MainConfig {

//    id 默认是 方法名
    @Bean(value = "person")
    public Person person01(){
        return new Person(18,"lisi");
    }
}
