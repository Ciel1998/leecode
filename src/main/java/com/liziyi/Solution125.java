package com.liziyi;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2021/1/13 8:39
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        //大小写转换
        String lowercase = s.toLowerCase();
        //只留下字母和数字
        String str = lowercase.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
        //转为数组
        char[] num = str.toCharArray();
        System.out.println(num);
        for (int i = 0; i < num.length; i++) {
            if (num[i] != num[num.length - 1 - i]) {
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Solution125 solution125 = new Solution125();
        solution125.isPalindrome(s);
    }
}
