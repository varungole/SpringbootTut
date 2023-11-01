package com.example.demoSpringboot.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
                Student varun = new Student(
                  "Varun",
                  "varungole1999@gmail.com",
                  LocalDate.of(1999, Month.MAY, 29)  
                );

                Student ashish = new Student(
                  "Ashish",
                  "ashishgole2004@gmail.com",
                  LocalDate.of(2004, Month.OCTOBER, 30)  
                );

                studentRepository.saveAll(List.of(varun , ashish));

        };
    }
}
