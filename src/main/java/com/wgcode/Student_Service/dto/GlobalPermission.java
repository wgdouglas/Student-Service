package com.wgcode.Student_Service.dto;

import lombok.Data;

@Data
public class GlobalPermission {

    private enum permission {
        PERMISSION_UNSPECIFIED,
        CREATE_COURSE
    }
}
