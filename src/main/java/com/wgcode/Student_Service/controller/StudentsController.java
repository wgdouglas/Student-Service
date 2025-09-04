package com.wgcode.Student_Service.controller;

import com.wgcode.Student_Service.dto.StudentDTO;
import com.wgcode.Student_Service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/v2/students")
public class StudentsController {

    private final StudentService studentService;

    @Autowired
    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("allStudents")
    public List<StudentDTO> getStudents(){
        return studentService.retrieveAllStudents();
    }

    @PostMapping("registerStudents")
    public void registerNewStudents(@RequestBody StudentDTO students){
        studentService.registerStudents(students);
    }
}
