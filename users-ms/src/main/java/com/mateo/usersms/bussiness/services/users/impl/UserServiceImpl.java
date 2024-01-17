package com.mateo.usersms.bussiness.services.users.impl;

import com.mateo.usersms.bussiness.services.users.IUserService;
import com.mateo.usersms.persistence.repositories.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;

    @Override
    public boolean existsByCvu(String cvu) {
        return userRepository.existsByCvu(cvu);
    }

    @Override
    public boolean existsByAlias(String alias) {
        return false;
    }
}
