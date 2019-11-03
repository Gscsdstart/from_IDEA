package com.ssm.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Admin {

    private int  admin_id;
    private String admin_name;
    private String admin_password;


}
