package com.liziyi.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2021/1/18 9:07
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
public class Solution3 {
    public int findRepeatNumber(int[] nums) {
        int re = 0;
        //定义set通过set找到重复值。
       Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (!set.add(num)) {
                re = num;
            }
        }
        return re;
    }
}
