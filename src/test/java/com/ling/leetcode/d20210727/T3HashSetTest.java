package com.ling.leetcode.d20210727;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class T3HashSetTest {

    @Test
    public void lengthOfLongestSubstring() {
        T3HashSet t3HashSet = new T3HashSet();
        String s = "abcabcbb";
        System.out.print(t3HashSet.lengthOfLongestSubstring(s));
    }

    @Test
    public void lengthOfLongestSubstring1() {
        T3HashSet t3HashSet = new T3HashSet();
        assertEquals(3,t3HashSet.lengthOfLongestSubstring("abcabcbb"));

    }
}
