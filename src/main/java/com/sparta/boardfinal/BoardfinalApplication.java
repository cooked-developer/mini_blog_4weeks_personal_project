package com.sparta.boardfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class BoardfinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardfinalApplication.class, args);
    }

}
