package com.leslee.algorithms4java.algos;

import java.util.Arrays;
import java.util.SortedMap;

/**
 * @author: Leslee
 * @create: 2019-10-13 21:17
 **/
public class ContainsString {
    //判断字符串是否包含
    //粗暴解法
    public boolean StringContain(String[] a,String[] b){

        for (int i=0;i<b.length;++i){
            int j;
            for (j=0;(j<a.length) && (a[j]!=b[i]);++j);
            if (j>=a.length){
                return false;
            }

        }
        return true;
    }
    //先字母排序，且同时对两个字串轮查，
    public boolean StringContainBySort(String[] a1,String[] b1){
        Arrays.sort(a1);
        Arrays.sort(b1);
        for (int pa=0,pb=0;pb<b1.length;){
            while ((pa<a1.length)&&(a1[pa].equals(b1[pb]))){
                ++pa;
            }
            if ((pa >= a1.length) || (!a1[pa].equals(b1[pb]))){
                return false;
            }
            ++pb;
        }
        return true;
    }


    public static void main(String[] args) {
        String[] a = new String[]{"A","B","C","D","E"};
        String[] b = new String[]{"A","B","C","D"};
        ContainsString containsString = new ContainsString();
//        boolean a1 = containsString.StringContain(a,b);
//        System.out.println(a1);
        boolean co = containsString.StringContainBySort(a,b);
        System.out.println(co);
    }

}
