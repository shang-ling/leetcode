package com.ling.leetcode.d20210730;

/**
 * @program: leetcode
 * @description: 给你一个字符串 s，由若干单词组成，单词之间用单个或多个连续的空格字符隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
 * @author: ling
 * @create: 2021-07-30 14:51
 **/
public class T58 {
    public int lengthOfLastWord(String s) {
        int result = 0;
        int stop = 0;

        // 从最后算回来，其以符号和空格断首尾
        if (s == " " || s =="" || s == null)
            return 0;
/*        for (int i = s.length(); i >= 0; i--){
            if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' || s.charAt(i) < 'a' || s.charAt(i) > 'z'){
                i--;
            }else {
                result++;
            }
        }*/

        // ps: 即使有符号，也会再打空格，所以不需要判断符号，
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                result++;
            }else if (result != 0)
                return result;
        }
        return result;
    }
}
