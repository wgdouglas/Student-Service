package com.wgcode.Student_Service.controller;

import com.wgcode.Student_Service.dto.StudentDTO;
import com.wgcode.Student_Service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v2/students")
@CrossOrigin
public class StudentsController {

    private final StudentService studentService;

    @Autowired
    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("allStudents")
    public List<StudentDTO> getStudents() {
        return studentService.retrieveAllStudents();
    }

    @PostMapping("registerStudents")
    public void registerNewStudents(@RequestBody StudentDTO students) {
        studentService.registerStudents(students);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deletingStudent(studentId);
    }
}

