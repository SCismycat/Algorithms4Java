package com.leslee.algorithms4java.algos;

/**
 * @description:
 * @author: Leslee
 * @create: 2019-10-15 10:13
 **/
public class FindSecondNum {

    public static void main(String[] args) {
        int[] nums = {12,34,53,32,134};
        int fMax = 0;
        int sMax = 0;
        for (int num:nums){
            if (num>fMax){
                sMax = fMax;
                fMax = num;
            }else if (num>sMax){
                sMax = num;
            }
        }
        System.out.println(fMax+","+sMax);
    }


}
