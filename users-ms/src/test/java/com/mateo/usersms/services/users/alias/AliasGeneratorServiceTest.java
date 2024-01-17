package com.mateo.usersms.services.users.alias;

import com.mateo.usersms.bussiness.services.users.alias.AliasGeneratorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class AliasGeneratorServiceTest {

    @Autowired
    private AliasGeneratorService aliasGeneratorService;

    @Test
    void testAlias() {
        System.out.println(aliasGeneratorService.getAlias());
    }
}