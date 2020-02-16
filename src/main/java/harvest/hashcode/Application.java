package harvest.hashcode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("Spring Boot");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
