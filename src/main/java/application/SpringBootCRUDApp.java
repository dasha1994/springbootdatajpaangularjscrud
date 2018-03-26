package application;

import application.configuration.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"application"})
public class SpringBootCRUDApp {
    public static void main(String...args){
        SpringApplication.run(SpringBootCRUDApp.class, args);
    }
}
