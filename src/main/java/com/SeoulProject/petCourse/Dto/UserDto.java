package com.SeoulProject.petCourse.Dto;

import lombok.Getter;

@Getter
public class UserDto {
    public String name;
    public String email;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
