package com.liziyi;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2021/1/10 10:39
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
public class Solution5649 {
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            // encoded[i]=arr[i] XOR arr[i+1];
            //^ 如果对一个值连续做两次 XOR，会返回这个值本身。
            arr[i + 1] = arr[i] ^ encoded[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution5649 solution5649 = new Solution5649();
        //数组传参
        int a[] = {1, 2, 3};
        solution5649.decode(a, 1);
    }
}

