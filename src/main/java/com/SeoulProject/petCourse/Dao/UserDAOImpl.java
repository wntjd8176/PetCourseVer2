package com.SeoulProject.petCourse.Dao;

import com.SeoulProject.petCourse.Dto.UserDto;
import com.SeoulProject.petCourse.Entity.UserEntity;
import com.SeoulProject.petCourse.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAOImpl implements UserDAO {
    UserRepository userRepository;
    @Autowired
   public UserDAOImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public boolean insert(UserDto userDto){
        UserEntity userEntity = new UserEntity(userDto.getName(),userDto.getEmail());
         userRepository.save(userEntity);

         return true;


    }
}
