package com.wgcode.Student_Service.service;

import com.wgcode.Student_Service.configurations.StudentRepository;
import com.wgcode.Student_Service.domain.ClassIndex;
import com.wgcode.Student_Service.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
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
//
//    public Optional<StudentDTO> findStudentById(StudentDTO studentId){
//        Optional<StudentDTO> findStudentsById = studentRepository.findById(studentId.getStudentId());
//        if(findStudentsById.isEmpty()){
//            throw new RuntimeException("Student not found in database");
//        }
//        ClassIndex classIndex = new ClassIndex();
//        var classGraduatedYear = classIndex.getStudentEnrollmentYear();
//        var classEnrolledYear = classIndex.getStudentEnrollmentYear();
//        if (classGraduatedYear == 5) {
//            throw new RuntimeException("Student not found in database");
//        }
    // my first attemp logic
//        return findStudentsById.map(student -> {
//            ClassIndex studentStillEnrolled = new ClassIndex();
//            studentStillEnrolled.setStudentEnrollmentYear(2025 - classEnrolledYear);
//            if (studentStillEnrolled.getStudentEnrollmentYear() < 5){
//                return student;
//            } else {
//                throw new RuntimeException("Student not found in database");
//            }
//        });
//    }


    public Optional<StudentDTO> findStudentById(StudentDTO studentId){
        Optional<StudentDTO> foundStudentById = studentRepository.findById(studentId.getStudentId());
        if(foundStudentById.isEmpty()) {
            throw new RuntimeException("Student not found in database");
        }
        var currentYear = LocalDateTime.now().getYear();
        var classIndex = new ClassIndex();
        var enrollmentYear = classIndex.getStudentEnrollmentYear();
        var yearsEnrolled = currentYear - enrollmentYear;
        if (yearsEnrolled <=4){
            return foundStudentById;
        } else {
            throw new RuntimeException("Student not found in database");
            }
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
