package com.liziyi;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2021/1/9 9:05
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int n = 0;n < matrix[0].length ;n ++ ) {
            for(int m = 0;m < matrix.length; m ++) {
                if(target == matrix[m][n]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //二维数组定义赋值
        int[][] ints = new int[1][1];
        ints[0][0] = -5;
        solution.searchMatrix(ints ,-2);
    }
}
