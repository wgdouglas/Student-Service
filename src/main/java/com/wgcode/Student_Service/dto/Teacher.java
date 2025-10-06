package com.wgcode.Student_Service.dto;

import lombok.Data;

@Data
public class Teacher {
    private String courseId;
    private String userId;
    private UserProfile profile;
}
