package com.mateo.usersms.bussiness.mappers;

import com.mateo.usersms.model.User;
import com.mateo.usersms.model.dtos.SaveUserDto;

public interface IUserMapper {
    User saveUserDtoToUser(SaveUserDto saveUserDto);
}
