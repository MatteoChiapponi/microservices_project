package com.mateo.usersms.bussiness.mappers.impl;

import com.mateo.usersms.bussiness.mappers.IUserMapper;
import com.mateo.usersms.model.User;
import com.mateo.usersms.model.dtos.SaveUserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements IUserMapper {

    @Override
    public User saveUserDtoToUser(SaveUserDto saveUserDto) {
        return new User(saveUserDto.firstName(),
                saveUserDto.lastName(),
                saveUserDto.identificationCard(),
                saveUserDto.email(),
                saveUserDto.phoneNumber(),
                saveUserDto.password());
    }


}
