package com.wgcode.Student_Service.dto;

import java.util.List;

public class UserProfile {

    private String id;
    private Name name;
    private String emailAddress;
    private String photoUrl;
    private List<GlobalPermission> permissions;
    private Boolean verifiedTeacher;
}

//  "id": string,
//  "name": {
//    object (Name)
//  },
//  "emailAddress": string,
//  "photoUrl": string,
//  "permissions": [
//    {
//      object (GlobalPermission)
//    }
//  ],
//  "verifiedTeacher": boolean
//}
