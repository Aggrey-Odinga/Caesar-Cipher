package org.odinga;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CypherDecoderTests {

    @Test
    public void should_successfully_decode_word() {
        String expectedWord = "QUICK";
        CypherEncoder encoder = new CypherEncoder();
        CypherDecoder decoder = new CypherDecoder();

        String encodedWord = encoder.encode(expectedWord, 23);

        decoder.setWord(encodedWord);
        decoder.setKey(23);
        String decodedWord = decoder.decode();

        Assertions.assertEquals(expectedWord, decodedWord);
    }

    @Test
    public void should_only_decode_alphabets() {
        String word = "66436*#";
        CypherDecoder decoder = new CypherDecoder();
        decoder.setKey(2);
        decoder.setWord(word);
        String decodedWord = decoder.decode();
        Assertions.assertEquals(word, decodedWord);
    }

}
