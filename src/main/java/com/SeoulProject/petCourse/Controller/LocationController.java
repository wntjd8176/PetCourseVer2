package com.SeoulProject.petCourse.Controller;

import com.SeoulProject.petCourse.Dao.LocationDAOImpl;
import com.SeoulProject.petCourse.Service.LocationService;
import com.SeoulProject.petCourse.Service.LocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LocationController {

    @Autowired
    private final LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/location")
    public String location(){ return "location";}

    @PostMapping("/saveLocation")
    public void saveLocation(Double latitude, Double longitude) {

       locationService.pushLocation(latitude, longitude);
    }

}
