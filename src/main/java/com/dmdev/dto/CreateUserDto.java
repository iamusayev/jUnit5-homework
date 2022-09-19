package com.dmdev.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreateUserDto {
    private String name;
    private String birthday;
    private String email;
    private String password;
    private String role;
    private String gender;
}
