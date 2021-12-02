package com.will.rushleetcode.easy;

/**
 * @ClassName: maxPower
 * @Description: TODO
 * @Author: ww
 * @Date: 2021/12/2 9:39
 **/
public class maxPower {
    public static int maxPower(String s){
        char[] chars = s.toCharArray();
        int count = 1, max = 0;
        for (int i = 1; i < chars.length; i++) {
//            从第二个字符开始与前一个字符比较，如果相同给count+1，
            count += chars[i] == chars[i - 1] ? 1 : -count + 1;
            max = Math.max(max, count);
        }
        return Math.max(max, count);
    }
}
