package com.wgcode.Student_Service.configurations;

import com.wgcode.Student_Service.dto.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentRepository extends JpaRepository {

    @Query("SELECT s FROM Students s WHERE s.email = ?1")
    Optional<StudentDTO> retrieveAllStudentsByEmail(String email);
}
