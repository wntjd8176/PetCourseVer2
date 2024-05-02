package com.SeoulProject.petCourse.Service;

import com.SeoulProject.petCourse.Dao.LocationDAO;
import com.SeoulProject.petCourse.Dao.UserDAO;
import com.SeoulProject.petCourse.Entity.LocationEntity;
import com.SeoulProject.petCourse.Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements  LocationService{
    @Autowired
    private LocationDAO locationDAOImpl;

    @Override
    public void pushLocation(Double latitude, Double Longitude){
        LocationEntity locationEntity = new LocationEntity(latitude,Longitude);
        locationDAOImpl.insert2(locationEntity);

    }



}
