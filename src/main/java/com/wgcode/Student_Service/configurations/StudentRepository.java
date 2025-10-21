package com.wgcode.Student_Service.configurations;

import com.wgcode.Student_Service.dto.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<StudentDTO, Long> {

    @Query("SELECT s FROM StudentDTO s WHERE s.studentEmail = ?1")
    Optional<StudentDTO> retrieveAllStudentsByEmail(String email);
}
