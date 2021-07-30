package com.ling.leetcode.d20210730;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class T171Test {

    @Test
    public void titleToNumber() {
        T171 t171 = new T171();
        String[] s = {"A", "B", "C", "Z", "AA", "AB",  "ZY" };

        for (int i = 0; i < s.length; i++) {
            System.out.print(t171.titleToNumber(s[i]) + " ");
        }


    }
}
