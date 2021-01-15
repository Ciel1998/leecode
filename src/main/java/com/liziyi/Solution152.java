package com.liziyi;

import java.util.ArrayList;

import static sun.swing.MenuItemLayoutHelper.max;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2021/1/14 20:45
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
public class Solution152 {
    public int maxProduct(int[] nums) {
        int imax = 1;int imin = 1; int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            //当负数时，交换最大值和最小值
            if (nums[i] < 0) {
                int x = imax;
                imax = imin;
                imin = x;
            }
            //最大值等于nums[i],或者最大值*nums[i]
            imax = Math.max(nums[i] , imax * nums[i]);
            imin = Math.min(nums[i] , imin * nums[i]);
            //找到最大值
            max = Math.max(imax,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = {-2,0,-1};
        Solution152 solution152 = new Solution152();
        solution152.maxProduct(a);
    }
}
