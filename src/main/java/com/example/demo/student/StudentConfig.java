package com.example.demo.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student arjun = new Student("Arjun", "arjunsudhalkar@gmail.com", LocalDate.of(2000, Month.JANUARY,5));
            Student alex = new Student("alex", "alex@gmail.com", LocalDate.of(2004, Month.JANUARY,3));
            repository.saveAll(
                    List.of(arjun, alex)
        );
        };


    }

}
