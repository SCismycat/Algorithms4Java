package com.leslee.algorithms4java.algos;

/**
 * @description:
 * @author: Leslee
 * @create: 2019-10-12 17:18
 **/
public class EditDistance {
    public static int ed(String s1, String s2){
        int d[][];
        int s1Len = s1.length();
        int s2Len = s2.length();
        int S1i;
        int S2i;
        char ch1;
        char ch2;
        int cost;
        if (s1Len ==0){
            return s2Len;
        }
        if (s2Len==0){
            return s1Len;
        }
        //新建一个二维表
        d = new int[s1Len+1][s2Len+1];
        for (S1i=0;S1i<=s1Len;S1i++){
            d[S1i][0] = S1i;
        }
        for(S2i=0;S2i<=s2Len;S2i++){
            d[0][S2i] = S2i;
        }
        //开始计算损失
        for (S1i=1;S1i<=s1Len;S1i++){
            ch1 = s1.charAt(S1i-1);
            for (S2i=1;S2i<=s2Len;S2i++){
                ch2 = s2.charAt(S2i-1);
                if (ch1==ch2){
                    cost = 0;
                }else {
                    cost = 1;
                }
                d[S1i][S2i] = Math.min(Math.min(d[S1i-1][S2i]+1,d[S1i][S2i-1]+1),d[S1i-1][S2i-1]+cost);
            }
        }
        return d[s1Len][s2Len];
    }

    public static void main(String[] args) {
        System.out.println(EditDistance.ed("kitten","sitting"));
    }
}
