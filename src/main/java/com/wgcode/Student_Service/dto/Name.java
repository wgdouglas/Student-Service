package com.wgcode.Student_Service.dto;

import lombok.Data;

@Data
public class Name {
    public String givenName;
    public String familyName;
    public String fullName;

    public Name() {
    }

    public Name(String givenName, String familyName, String fullName) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.fullName = fullName;
    }
}

//{
//  "givenName": string,
//  "familyName": string,
//  "fullName": string
//}
