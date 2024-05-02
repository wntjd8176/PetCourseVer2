package com.SeoulProject.petCourse.Entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Table
@Entity
public class UserEntity {
    @Id   @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long userID;
    public String name;
    public String email;


    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
    public UserEntity(String name, String email){
        this.name = name;
        this.email = email;
    }
}



