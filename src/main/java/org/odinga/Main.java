package org.odinga;

public class Main {
    public static void main(String[] args) {
       CypherEncoder encoder = new CypherEncoder();
       //encoder.setWord()
        // encoder.setKey(2)
        // encoder.encode
       System.out.println(encoder.encode("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23));

        CypherDecoder decoder = new CypherDecoder();
       decoder.setWord("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD");
       decoder.setKey(23);

       System.out.println(decoder.decode());
    }
}