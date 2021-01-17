package com.liziyi.exam224;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2021/1/17 10:32
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
public class Solution5653 {
    public int countGoodRectangles(int[][] rectangles) {
        //正方形最长边
        int longRec = 0;
        //当前正方形的边
        int nowRec;
        //最大正方形的个数
        int num = 1;
        for (int i = 0; i < rectangles.length; i++) {
            nowRec = Math.min(rectangles[i][0],rectangles[i][1]);
            if (longRec < nowRec) {
                longRec = nowRec;
                num = 1;
            } else if (longRec == nowRec){
                num ++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Solution5653 solution5653 = new Solution5653();
        int[][] rectangles = new int[5][2];
        rectangles[0][0]= 4;
//        rectangles[0]= {4,2}
//        rectangles[1] = [4][2];
//        {
//        } [4][2]; [[2, 3],[3, 7],[4, 3],[3, 7]];
//        solution5653.countGoodRectangles();
    }
}
