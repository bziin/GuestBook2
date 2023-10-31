package org.zerock.b03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class B03Application {

    public static void main(String[] args) {
        SpringApplication.run(B03Application.class, args);
    }

}
