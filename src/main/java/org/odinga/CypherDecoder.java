package org.odinga;

public class CypherDecoder {
    private final String alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String word;
    private int key;


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String decode() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < word.length(); i ++) {
            char c = word.charAt(i);
            int position = alphabet.indexOf(c);
            if(position == -1) {
                builder.append(c);
                continue;
            }
            int newPosition = position - key;
            if (newPosition  < 0) {
                newPosition += alphabet.length();
            }
            builder.append(alphabet.charAt(newPosition));
        }
        return builder.toString();
    }

}
