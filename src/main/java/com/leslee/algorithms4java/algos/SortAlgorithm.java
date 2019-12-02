package com.leslee.algorithms4java.algos;

/**
 * @description:
 * @author: Leslee
 * @create: 2019-11-08 10:54
 **/
public class SortAlgorithm {

    public void bubbleSort(int[] arr){
        boolean flag = true;
        for (int i=0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }


    }
    //选择排序
    public void selectSort(int[] arr){
        //每次找到最小的值的坐标。然后把最小值放在最前面
        for (int i=0;i<arr.length-1;i++){
            int minK = i;
            for(int j = i+1;j<arr.length;j++){
                if (arr[j]<arr[minK]){
                    minK = j;
                }
            }
            //把上面的最小值的坐标取到以后，跟在i中的最小的交换顺序
            if (minK!=i){
                int tmp = arr[minK];
                arr[minK] = arr[i];
                arr[i] = tmp;
            }
        }
    }

//插入排序
    public void insertSort(int[] arr){
        int j;
        for (int i=1;i<arr.length;i++){
            int tmp = arr[i];
            j = i -1;
            while (j>-1 && tmp<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = tmp;
        }
    }



}
