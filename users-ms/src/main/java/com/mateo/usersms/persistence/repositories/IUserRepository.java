package com.mateo.usersms.persistence.repositories;

import com.mateo.usersms.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

    boolean existsByCvu(String cvu);
    boolean existsByAlias(String alias);
}
