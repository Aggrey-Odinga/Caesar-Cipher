package org.odinga;

public class CypherEncoder {
    private final String alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public String encode(String word, int key) {
       StringBuilder builder = new StringBuilder();
       for(int i = 0; i < word.length(); i ++) {
           char c = word.charAt(i);
           int position = alphabet.indexOf(c);
           if(position == -1) {
               builder.append(c);
               continue;
           }
           int newPosition = (position + key) % alphabet.length();
           builder.append(alphabet.charAt(newPosition));
       }
        return builder.toString();
    }
}
