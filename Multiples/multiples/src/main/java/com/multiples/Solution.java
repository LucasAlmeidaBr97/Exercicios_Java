package com.multiples;

public class Solution {

    public int solution(int number) {
        int[] n = new int[number];
        int multiple = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = i;
            if (n[i] % 3 == 0 || n[i] % 5 == 0) {
                multiple += n[i];
            }

        }
        return multiple;
    }
}
