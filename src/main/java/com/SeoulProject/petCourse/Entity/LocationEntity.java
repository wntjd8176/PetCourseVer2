package com.SeoulProject.petCourse.Entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Table
@Entity
public class LocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Double latitude;

    public Double longitude;

    public LocationEntity(Double latitude, Double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
