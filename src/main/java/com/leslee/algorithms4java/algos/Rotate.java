package com.leslee.algorithms4java.algos;

/**
 * @description:
 * @author: Leslee
 * @create: 2019-11-14 13:41
 **/
public class Rotate {

    public void rotate(int[] nums,int k){
        int tmp,previous;
        for (int i=0;i<k;i++){
            previous = nums[nums.length-1];
            for (int j=0;j<nums.length;j++){
                tmp = nums[j];
                nums[j] = previous;
                previous = tmp;
            }
        }
    }

    public static void main(String[] args) {

    }

}
