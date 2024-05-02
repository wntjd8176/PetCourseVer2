package com.SeoulProject.petCourse.Dto;

import lombok.Getter;

@Getter
public class LocationDto {
    public Double latitude;

    public Double longitude;

    public Double getLatit() {
        return latitude;
    }

    public Double getLongit() {
        return longitude;
    }
}
