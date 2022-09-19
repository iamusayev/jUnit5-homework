package com.dmdev.dto;

import com.dmdev.entity.Gender;
import com.dmdev.entity.Role;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Value;
@Value
@Builder
public class UserDto {
    Integer id;
    String name;
    LocalDate birthday;
    String email;
    Role role;
    Gender gender;
}
