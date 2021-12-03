package com.will.rushleetcode.easy;

/**
 * @ClassName: TowSum
 * @Description: TODO
 * @Author: ww
 * @Date: 2021/12/2 9:55
 **/
public class TowSum {
    public static int[] towSum(int[] nums, int target){
        int [] result = new int[2];
        for (int i=0; i<nums.length;i++){
            int num2 = target-nums[i];
            for (int j=i+1;j<nums.length;j++){
                if (num2==nums[j]){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,-2,-3,-4,-5};
        int target = -8;
        System.out.println(towSum(nums, target));
    }
}
