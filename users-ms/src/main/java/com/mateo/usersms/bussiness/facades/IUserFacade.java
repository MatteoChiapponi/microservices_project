package com.mateo.usersms.bussiness.facades;

import com.mateo.usersms.model.dtos.SaveUserDto;

public interface IUserFacade {
    String saveUser(SaveUserDto saveUserDto);
}
