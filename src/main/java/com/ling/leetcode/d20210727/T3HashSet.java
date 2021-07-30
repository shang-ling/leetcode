package com.ling.leetcode.d20210727;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: leetcode
 * @description: 窗口滑动（队列），利用hashSet集合来存储
 * @author: ling
 * @create: 2021-07-27 23:22
 **/
public class T3HashSet {
    public int lengthOfLongestSubstring(String s) {
        //定义最大长度，和窗口的左右指针。
        int result = 0;
        int left = 0;
        int right = 0;

        //定义一个set集合来存放队列的数据
        Set<Character> characterSet = new HashSet<>();

        if (s == null || s.length() == 0)
            return 0;
        else {
            while (left <= s.length() && right <= s.length()) {
                //判断是否出现集合已有的字符，有左指针向前缩进
                if (characterSet.contains(s.charAt(right))) {
                    characterSet.remove(s.charAt(left));
                    left++;
                }else {
                    characterSet.add(s.charAt(right));
                    right++;

                    //返回历史最大长度和当前长度中的最大值
                    int nowReturn = right - left;
                    result = Math.max(result,nowReturn);
                }
            }
        }
        return result;
    }
}
