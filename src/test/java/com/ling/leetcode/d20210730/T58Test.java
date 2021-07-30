package com.ling.leetcode.d20210730;

import org.junit.Test;

public class T58Test {

    @Test
    public void lengthOfLastWord() {
        T58 t58 = new T58();
        String s = "Hello World ";
        System.out.print(t58.lengthOfLastWord(s));
    }

    @Test
    public void lengthOfLastWord1() {
        T58 t58 = new T58();
        String s = "Hello World";
        System.out.print(t58.lengthOfLastWord(s));
    }

    @Test
    public void lengthOfLastWord2() {
        T58 t58 = new T58();
        String s =" ";
        System.out.print(t58.lengthOfLastWord(s));
    }

    @Test
    public void lengthOfLastWord3() {
        T58 t58 = new T58();
        String s ="hello world ! a ";
        System.out.print(t58.lengthOfLastWord(s));
    }
}
