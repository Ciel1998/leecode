package com.liziyi;

import java.util.Arrays;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2021/1/11 8:38
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
public class Solution88 {
    //数组排序
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //当时只想到了转为String想比较，没想到直接把他们和为数组，再排序。
        for (int i = 0; i < n; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        Solution88 solution88 = new Solution88();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        solution88.merge(nums1,3,nums2,3);
    }
}
