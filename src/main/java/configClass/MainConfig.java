package configClass;

import com.htb.Person;
import com.htb01.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/*
FilterType.ANNOTATION     按照注解的方式
ASSIGNABLE_TYPE   按照给定的类型
CUSTOM   自定义规则



 */
@Configuration
//@ComponentScan(value = "com.htb01",excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})
//})

//@ComponentScan(value = "com.htb01",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})
//},useDefaultFilters = false)


//value 指定要扫描的包
//excludeFilters  排除的组件

//可以多写几个  scan
@ComponentScans(value = @ComponentScan(value = "com.htb01",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyFilterTypeCustom.class})
},useDefaultFilters = false)

)

public class MainConfig {

//    id 默认是 方法名
    @Bean(value = "person")
    public Person person01(){
        return new Person(18,"lisi");
    }
}
