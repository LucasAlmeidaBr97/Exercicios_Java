package com.alphabet.position;

import java.util.HashMap;
import java.util.Map;

public class Kata {

    static String alphabetPosition(String text) {
        int index = 1;
        text = text.toLowerCase();
        Map<Character, Integer> alphabet = new HashMap();    
        for(char  c = 'a'; c<= 'z'; c++){
            alphabet.put(c, index++);
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(alphabet.containsKey(ch)){
                result.append(alphabet.get(ch)).append(" ");
            }
        
        }
        return result.toString().trim();
    }
}
