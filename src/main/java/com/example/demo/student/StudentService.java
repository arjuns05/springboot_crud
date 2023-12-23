package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudent(){

        Student student = new Student(1L, "Arjun", "arjunsudhalkar@gmail.com", 21, LocalDate.of(2000, Month.JANUARY, 5) );
        return List.of(student);
    }


}
