package com.will.rushleetcode.easy;

/**
 * @ClassName: IsPailindrome
 * @Description: TODO
 * @Author: ww
 * @Date: 2021/12/7 11:02
 **/
public class IsPailindrome {
    public static boolean isPailindrome(int x){
        if (x<0) return false;
        String str = String.valueOf(x);
        if (str.length()==1) return true;

            for (int i = 0 ; i<str.length()/2;i++){
                if (str.charAt(i)!=str.charAt(str.length()-i-1)) return false;
            }
            return true;

    }

    public static void main(String[] args) {
        System.out.println(isPailindrome(100));
    }
}
