package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mary = new Student( "Mary",
                    "mary@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 10),
                    21);

            Student alex = new Student( "Alex",
                    "aleeeex@gmail.com",
                    LocalDate.of(1999, Month.MARCH, 18),
                    23);

            repository.saveAll(List.of(mary,alex));
        };


    }
}
