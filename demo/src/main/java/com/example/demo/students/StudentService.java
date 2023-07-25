package com.example.demo.students;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of( new Student(
                        1L,
                        "md kamruddin ansari",
                        "kamr@123gamil.com",
                        LocalDate.of(1998,07,12),
                        24
                )
        );
    }
}
