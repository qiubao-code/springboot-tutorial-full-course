package com.example.springboottutorialfullcourse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@RestController
@Slf4j
public class SpringbootTutorialFullCourseApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootTutorialFullCourseApplication.class, args);
    }
}
