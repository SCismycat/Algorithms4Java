package com.leslee.algorithms4java.algos;

/**
 * @description:
 * @author: Leslee
 * @create: 2019-11-08 10:48
 **/
public class BinarySearch {

    public int findBinDemo(int[] array,int data){
        int low = 0;
        int high = array.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if (data==array[mid]){
                return mid;
            }else if (data<array[mid]){
                high = mid -1;
            }else {
                low = mid +1;
            }
        }
        return -1;
    }

}
