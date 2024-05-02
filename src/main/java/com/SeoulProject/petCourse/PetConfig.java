package com.SeoulProject.petCourse;

import com.SeoulProject.petCourse.Dao.LocationDAO;
import com.SeoulProject.petCourse.Dao.LocationDAOImpl;
import com.SeoulProject.petCourse.Dao.UserDAO;
import com.SeoulProject.petCourse.Dao.UserDAOImpl;
import com.SeoulProject.petCourse.Dto.LocationDto;
import com.SeoulProject.petCourse.Repository.LocationRepository;
import com.SeoulProject.petCourse.Repository.UserRepository;
import com.SeoulProject.petCourse.Service.LocationServiceImpl;
import com.SeoulProject.petCourse.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfig {

     private final UserRepository userRepository;
     private final LocationRepository locationRepository;

   public PetConfig(UserRepository userRepository,LocationRepository locationRepository){
       this.userRepository=userRepository;
       this.locationRepository = locationRepository;
   }

    @Bean
    public UserDAO UserDAOImpl(){
        return new UserDAOImpl(userRepository);
    }
    @Bean
    public LocationDAO LocationDAOImpl(LocationRepository locationRepository){return new LocationDAOImpl(locationRepository);}






}
