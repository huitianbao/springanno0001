package configClass;

import com.htb.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

//    id 默认是 方法名
    @Bean(value = "person")
    public Person person01(){
        return new Person(18,"lisi");
    }
}
