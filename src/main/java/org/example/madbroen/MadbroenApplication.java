package org.example.madbroen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class MadbroenApplication {

    public static void main(String[] args) {
        SpringApplication.run(MadbroenApplication.class, args);
    }

}


