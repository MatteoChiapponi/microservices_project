package com.mateo.usersms.bussiness.facades.Impl;

import com.mateo.usersms.bussiness.facades.IUserFacade;
import com.mateo.usersms.bussiness.mappers.IUserMapper;
import com.mateo.usersms.bussiness.services.users.IUserService;
import com.mateo.usersms.model.dtos.SaveUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserFacadeImpl implements IUserFacade {
    private final IUserService userService;
    private final IUserMapper userMapper;
    @Override
    public String saveUser(SaveUserDto saveUserDto) {
        var user = userMapper.saveUserDtoToUser(saveUserDto);
        return null;
    }
}
