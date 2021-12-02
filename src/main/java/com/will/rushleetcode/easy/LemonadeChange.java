package com.will.rushleetcode.easy;

/**
 * @ClassName: LemonadeChange
 * @Description: TODO
 * @Author: ww
 * @Date: 2021/12/2 9:40
 **/
public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills){
        int five = 0;
        int ten = 0;

//        如果第一张不是5直接错误
        if (bills[0] != 5) {
            return false;
        }
        five += 1;
//        如果第二张是20直接错误
        if (bills[1] == 20) {
            return false;
        } else if (bills[1] == 5) {
            five += 1;
        } else {
            five = 0;
            ten = 1;
        }
//        就目前的余额是第一张和第二张的总和5,5/10只有这两种可能，如果是5,5 第三张只可以是5或者10，如果是10，第三张只可能是5
        int total = bills[0] + bills[1];
        for (int i = 2; i < bills.length; i++) {
            if (bills[i] - 5 > total) return false;
            else if (five == 0 && bills[i] > 5) return false;
            switch (bills[i]) {
                case 5:
                    five++;
                    total+=5;
                    break;
                case 10:
                    ten++;
                    five -= 1;
                    total+=5;
                    break;
                case 20:
                    if (ten > 0) {
                        ten -= 1;
                        five -= 1;
                        total+=5;
                    } else {
                        if (five < 3) return false;
                        five -= 3;
                        total+=5;
                    }
                    break;
            }
        }
        return true;
    }
}
