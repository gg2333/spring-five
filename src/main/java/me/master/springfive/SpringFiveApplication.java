package me.master.springfive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringFiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFiveApplication.class, args);
    }

}
