package com.compare;

public class Kata {

    public static boolean solution(String str, String ending) {
        if (str.endsWith(ending)) {
            return true;
        }
        return false;
    }
}
