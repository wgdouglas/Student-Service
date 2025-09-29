package com.wgcode.Student_Service.domain;

import lombok.Data;

@Data
public class ClassIndex {
    private String classId;
    private String className;
    private String studentId;
    private String teacherId;
    private Integer studentEnrollmentYear;
    private Integer numberOfStudents;

    public ClassIndex(String classId, String className, String studentId, String teacherId,
                      Integer studentEnrollmentYear, Integer numberOfStudents) {
        this.classId = classId;
        this.className = className;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.studentEnrollmentYear = studentEnrollmentYear;
        this.numberOfStudents = numberOfStudents;
    }

    public ClassIndex() {
    }
}
