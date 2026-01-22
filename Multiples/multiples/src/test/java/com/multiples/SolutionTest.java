package com.multiples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test(){
        assertEquals(23, new Solution().solution(10));
    }
}
