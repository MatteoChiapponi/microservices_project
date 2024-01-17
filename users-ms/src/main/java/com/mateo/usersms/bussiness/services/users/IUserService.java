package com.mateo.usersms.bussiness.services.users;

public interface IUserService {
    boolean existsByCvu(String cvu);
    boolean existsByAlias(String alias);
}
