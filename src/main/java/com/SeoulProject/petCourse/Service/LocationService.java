package com.SeoulProject.petCourse.Service;

import org.springframework.stereotype.Service;

@Service
public interface LocationService {
    public void pushLocation(Double latitude, Double Longitude);

}
