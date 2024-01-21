package com.SpringExample.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student omer=new Student(
                    "Ömer Faruk",
                    "ofucer99@gmail.com",
                    LocalDate.of(1999,
                            DECEMBER,
                            22));
            Student tunay=new Student(
                    "Tunay",
                    "tunabstrk041@gmail.com",
                    LocalDate.of(2001,
                            NOVEMBER,
                            15));

            studentRepository.saveAll(List.of(omer,tunay));
        };

    }

}
