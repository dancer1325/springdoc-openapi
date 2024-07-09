package test.org.springdoc.ui.app2;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource(value = "springdoc.swagger-ui.enabled=false")
public class SpringDocApp2Real {
    public static void main(String[] args) {

        var springApplication = new SpringApplication(SpringDocApp2Real.class);

        // Pass external configuration via `setDefaultProperties()`
        Map<String, Object> defaultProperties = new HashMap<>();
        defaultProperties.put("springdoc.swagger-ui.enabled", "false");
        springApplication.setDefaultProperties(defaultProperties);

        springApplication.run(args);
    }
}
