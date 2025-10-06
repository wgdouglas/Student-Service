package com.wgcode.Student_Service.service;

import com.wgcode.Student_Service.dto.StudentDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class GoogleClassroomService {

    private StudentDTO studentDTO;
    private WebClient googleClassRoomWebClient;
    public GoogleClassroomService() {
    }

    public GoogleClassroomResponse createStudentGoogleClassroomAccount(StudentDTO studentDTO){
        return null;
    }

}
