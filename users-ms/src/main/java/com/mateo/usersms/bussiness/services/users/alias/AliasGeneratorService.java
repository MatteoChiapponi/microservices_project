package com.mateo.usersms.bussiness.services.users.alias;

import com.mateo.usersms.bussiness.services.users.IUserValidationService;
import com.mateo.usersms.utils.WordReaderUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AliasGeneratorService {
    private String alias;
    private final WordReaderUtil wordReader;
    private final IUserValidationService userValidationService;

    public String getAlias() {
        if (alias == null)
            generateAlias();
        return alias;
    }
    private void generateAlias(){
        var currentAlias = "";
        for (int i = 0; i < 3; i++) {
            currentAlias+= wordReader.randomWord()+".";
        }
        var finalAlias = currentAlias.substring(0,currentAlias.length()-1);
        if (userValidationService.isAliasAvailable(finalAlias)){
            alias = finalAlias;
            return;
        }
        generateAlias();
    }
}
