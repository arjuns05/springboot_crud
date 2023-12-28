package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;
    public StudentService (StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent(){

        Student student = new Student(1L, "Arjun", "arjunsudhalkar@gmail.com",  LocalDate.of(2000, Month.JANUARY, 5) );
//        return List.of(student);

        return studentRepository.findAll();
    }

    public void addNewStudent(Student student){
        Optional<Student> studentOptional= studentRepository.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()){
            throw new IllegalStateException("Email Already In Use");
        }
        studentRepository.save(student);
        System.out.println(student);


    }

    public void deleteStudent(Student student){
        studentRepository.delete(student);
        System.out.println(student);
    }




}
