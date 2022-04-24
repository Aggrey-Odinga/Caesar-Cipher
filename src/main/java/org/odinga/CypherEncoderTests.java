package org.odinga;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CypherEncoderTests {

    @Test
    public void should_encode_word_successfully() {
        CypherEncoder encoder = new CypherEncoder();
        String encodedWord = encoder.encode("QUICK", 23);
        Assertions.assertEquals("NRFZH", encodedWord);
    }

    @Test
    public void should_only_encode_alphabets() {
        CypherEncoder encoder = new CypherEncoder();
        String encodedWord = encoder.encode("B56C", 1);
        Assertions.assertEquals("C56D", encodedWord);
    }
}
