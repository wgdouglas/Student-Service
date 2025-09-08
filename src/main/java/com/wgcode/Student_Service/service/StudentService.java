package com.wgcode.Student_Service.service;

import com.wgcode.Student_Service.configurations.StudentRepository;
import com.wgcode.Student_Service.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentDTO> retrieveAllStudents() {
        return studentRepository.findAll();
    }


    public void registerStudents(StudentDTO student) {
        Optional<StudentDTO> findStudentsByEmail = studentRepository
                .retrieveAllStudentsByEmail(student.getStudentEmail());

        if (findStudentsByEmail.isEmpty()){
           throw new RuntimeException("Student not found in Database");
        }

        if(findStudentsByEmail.isPresent()) {
            throw new IllegalStateException("Student already exists in " +
                    "the Database. Please try again with a different email");
        }
        studentRepository.save(student);
    }

    public void deletingStudent(Long studentId) {
        boolean idExists = studentRepository.existsById(studentId);
        if (!idExists){
            throw new IllegalStateException("Student with the id" + studentId
                    + "does not exist in the database please try another id");
        }
        studentRepository.deleteById(studentId);
    }
}
