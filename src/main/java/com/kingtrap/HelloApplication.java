package com.kingtrap;

import com.kingtrap.bean.Hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//如果没有该注解，可以在类中，使用@Component等spring注解替换
@EnableConfigurationProperties({Hello.class})
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

}
