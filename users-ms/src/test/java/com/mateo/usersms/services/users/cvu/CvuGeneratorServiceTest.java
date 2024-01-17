package com.mateo.usersms.services.users.cvu;

import com.mateo.usersms.bussiness.services.users.cvu.CvuGeneratorService;
import org.junit.jupiter.api.Test;

class CvuGeneratorServiceTest {

    @Test
    void testCvu (){
        var cvu = new CvuGeneratorService();
        System.out.println(cvu.getCvu());
    }

}