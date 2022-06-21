package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.FEBRUARY;
import static java.time.Month.MAY;

@Configuration
public class StudentConfiguration {

    @Bean
    CommandLineRunner runner(StudentRepository repository) {
        return args -> {
            Student first = new Student(
                    "first one",
                    "first@email",
                    LocalDate.of(2002, MAY, 2)
            );

            Student second = new Student(
                    "second",
                    "second@email",
                    LocalDate.of(2003, FEBRUARY, 5)
            );

            repository.saveAll(List.of(first, second));
        };
    }
}
