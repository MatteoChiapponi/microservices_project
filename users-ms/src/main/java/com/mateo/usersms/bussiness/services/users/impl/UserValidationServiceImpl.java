package com.mateo.usersms.bussiness.services.users.impl;

import com.mateo.usersms.bussiness.services.users.IUserService;
import com.mateo.usersms.bussiness.services.users.IUserValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserValidationServiceImpl implements IUserValidationService {
    private final IUserService userService;

    @Override
    public boolean isAliasAvailable(String alias) {
        return !userService.existsByAlias(alias);
    }

    @Override
    public boolean isCvuAvailable(String cvu) {
        return !userService.existsByCvu(cvu);
    }
}
