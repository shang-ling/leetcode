package com.ling.leetcode.d20210730;

import java.util.HashSet;

/**
 * @program: leetcode
 * @description: 给定一个Excel表格中的列名称，返回其相应的列序号。
 * @author: ling
 * @create: 2021-07-30 08:21
 **/
public class T171 {
    public int titleToNumber(String columnTitle) {
        //创建一个hash集合来存储对应列表的value，返回对应的key
        HashSet<String> hashSet = new HashSet<>();
        // 不可取，因为循环，26进制
        // hashSet.add("A");
        // hashSet.add("B");

        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            // 因为从 1 开始，而A在ASCII中是从65开始的，所以要-64或者减去 A + 1
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
            // result =  (columnTitle.charAt(i) - 'A' + 1);
        }

        return result;
    }
}
