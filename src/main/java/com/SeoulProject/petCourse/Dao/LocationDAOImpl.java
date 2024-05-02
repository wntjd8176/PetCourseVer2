package com.SeoulProject.petCourse.Dao;

import com.SeoulProject.petCourse.Dto.LocationDto;
import com.SeoulProject.petCourse.Dto.UserDto;
import com.SeoulProject.petCourse.Entity.LocationEntity;
import com.SeoulProject.petCourse.Entity.UserEntity;
import com.SeoulProject.petCourse.Repository.LocationRepository;
import com.SeoulProject.petCourse.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationDAOImpl implements LocationDAO {
    LocationRepository locationRepository;

    @Autowired
    public LocationDAOImpl(LocationRepository locationRepository){
        this.locationRepository=locationRepository;
    }

    @Override
    public boolean insert(LocationDto locationDto){
        LocationEntity locationEntity = new LocationEntity(locationDto.getLatit(),locationDto.getLongit());
        locationRepository.save(locationEntity);

        return true;


    }
    @Override
    public boolean insert2(LocationEntity locationEntity){
        locationRepository.save(locationEntity);

        return true;
    }



}
