package net.javaguides.springbootrestapi1.controller;

import net.javaguides.springbootrestapi1.bean.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/Student")
    public Student getStudent(){
        Student student = new Student (
                1,
                "A",
                "G"
        );
        return student;
    }

    @GetMapping("/Students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();

        students.add(new Student(1,"A", "B"));
        students.add(new Student(2,"C", "D"));

        return students;
    }

    @GetMapping("/Student/{id}")
    public Student getStudentPV(@PathVariable("id") int studentId){
        return new Student(studentId,"A","B");
    }

    @GetMapping("/Student/query")
    public Student getStudentRP(@RequestParam int studentId,
                                @RequestParam String fstName
                                ){
        return new Student(studentId,fstName,"B");
    }
}
