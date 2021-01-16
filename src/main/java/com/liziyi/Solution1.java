package com.liziyi;

import java.lang.reflect.Array;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2021/1/16 14:53
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (target == nums[i] + nums[j]) {
                    if (i != j) {
                        arr[0] = i;
                        arr[1] = j;
                    }
                }
            }
        }
        return arr;
    }
}
