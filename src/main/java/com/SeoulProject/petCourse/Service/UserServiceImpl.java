package com.SeoulProject.petCourse.Service;

import com.SeoulProject.petCourse.Dao.UserDAO;
import com.SeoulProject.petCourse.Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAOImpl;
    @Autowired
    private LocationRepository locationRepository;


}
