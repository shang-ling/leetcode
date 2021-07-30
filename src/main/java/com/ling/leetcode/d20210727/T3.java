package com.ling.leetcode.d20210727;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description: 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * @author: ling
 * @create: 2021-07-27 18:13
 **/
public class T3 {
    public int lengthOfLongestSubstring(String s) {

        //首先判断是否为空
        if (s == null || s.length() == 0)
            return 0;

        int result = 0;
        List<Character> characterList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (characterList.contains(charAt)) {
                result = Math.max(characterList.size(), result);
                characterList.subList(0, characterList.indexOf(charAt) + 1).clear();
            }
            characterList.add(charAt);
        }
        //返回历史最大长度和当前长度中的最大值
        return Math.max(characterList.size(), result);
    }
}
