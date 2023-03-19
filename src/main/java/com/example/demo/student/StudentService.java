package com.example.demo.student;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(new Student(1L,"Marry",
                "mary@gmail.com", LocalDate.of(2000,10,10),21));
    }
}
