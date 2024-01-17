package com.mateo.usersms.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordReaderUtilTest {
    private final WordReaderUtil wordReaderUtil2 = WordReaderUtil.getInstance();

    @Test
    void readWords() {
        wordReaderUtil2.randomWord();
    }

    @Test
    void randomWord() {
        wordReaderUtil2.randomWord();
    }
}