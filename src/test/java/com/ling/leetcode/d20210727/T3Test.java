package com.ling.leetcode.d20210727;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class T3Test {

    @Test
    public void lengthOfLongestSubstring5() {
        T3 t3 = new T3();
        assertEquals(3, t3.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, t3.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, t3.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, t3.lengthOfLongestSubstring(""));
    }
}
