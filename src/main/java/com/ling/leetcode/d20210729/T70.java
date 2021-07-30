package com.ling.leetcode.d20210729;

/**
 * @program: leetcode
 * @description: 有n阶楼梯，一次可以爬1或2台阶，有多少种方式可以爬到楼顶
 * @author: ling
 * @create: 2021-07-29 10:26
 **/
public class T70 {
    public int climbStairs(int n) {

        // 超时
        // 递归每层都是前一层+前两层
        if (n == 0 || n ==1) {
            return 1;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);

    }

    // 记忆优化：增加一个数组来存放计算结果，减少重复计算
    public int climbStairs2(int n) {
        int[] memo = new int[n + 1];
        return climbStairsMemo(n, memo);
    }
    public int climbStairsMemo(int n, int memo[]) {
        // 如果记忆的结果，就直接返回记忆
        if (memo[n] > 0)
            return memo[n];

         if (n == 1 || n == 2) {
             memo[n] = n;
         }else {
             memo[n] = climbStairsMemo(n - 1, memo) + climbStairsMemo(n - 2, memo);
         }
         return memo[n];

    }


}
