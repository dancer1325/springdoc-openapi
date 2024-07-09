package test.org.springdoc.ui.app2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource(value = "springdoc.swagger-ui.enabled=false")
public class SpringDocApp2Real {
    public static void main(String[] args) {
        SpringApplication.run(SpringDocApp2Real.class, args);
    }
}
