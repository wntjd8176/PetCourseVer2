package com.SeoulProject.petCourse.Dao;

import com.SeoulProject.petCourse.Dto.LocationDto;
import com.SeoulProject.petCourse.Dto.UserDto;
import com.SeoulProject.petCourse.Entity.LocationEntity;
import org.springframework.stereotype.Service;


public interface LocationDAO {
    public boolean insert(LocationDto locationDto);
    public boolean insert2(LocationEntity locationEntity);
}
