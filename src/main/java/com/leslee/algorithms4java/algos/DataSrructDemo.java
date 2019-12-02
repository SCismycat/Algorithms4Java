package com.leslee.algorithms4java.algos;

/**
 * @description:
 * @author: Leslee
 * @create: 2019-11-08 10:18
 **/
public class DataSrructDemo {
    public void rapalceArray(int[] oldArrray,int[] newArray){
        for(int i=0;i>oldArrray.length;i++){
            newArray[i] = oldArrray[i];
        }
        oldArrray = newArray;
    }

    public void add(int index,int e){
        int[] currentArray = new int[20];
        int size = 100;
        if (index>currentArray.length ||index<0){
            System.out.println("not good");
        }
        if (currentArray.length<size){
            //kuorong
        }
        for (int i=size-1;i>=index;i--){
            currentArray[i+1] = currentArray[i];
        }
        currentArray[index] = e;
    }












}
