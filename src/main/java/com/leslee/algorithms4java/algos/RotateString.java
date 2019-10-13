package com.leslee.algorithms4java.algos;

/**
 * @description:
 * @author: Leslee
 * @create: 2019-10-12 18:27
 **/

import java.util.Arrays;
import java.util.SortedMap;

/**
 * 要求把字符串前面的若干个字符移动到字符串的尾部，
 * 如把字符串“abcdef”前面的2个字符'a'和'b'移动到字符串的尾部，
 * 使得原字符串变成字符串“cdefab”。
 */
public class RotateString {
    //暴力解法，复杂度O(mn)
    public static String LeftShiftOne(char[] s,int n){
        char t = s[0];
        for (int i=1;i<n;i++){
            s[i-1] = s[i];
        }
        s[n-1] = t;
        return String.valueOf(s);
    }
    //原字符串二分，再分别反转，再反转。
    public  static String reverseString(char[] s,int from,int to){
        while (from<to){
            char t = s[from];
            s[from++] = s[to];
            s[to--] = t;
        }
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        String str = "abcdef";
        char[] s = new char[6];
        s[0] = 'a';
        s[1] = 'b';
        s[2] = 'c';
        s[3] = 'd';
        s[4] = 'e';
        s[5] = 'f';
//        String aa = "";
//        for(int m =2;m>0;m--){
//            aa = RotateString.LeftShiftOne(s,str.length());
//        }
//        System.out.println(aa);

        //
        String s1 = RotateString.reverseString(s,0,2);
        String s2 = RotateString.reverseString(s1.toCharArray(),3,5);
        String s3 = RotateString.reverseString(s2.toCharArray(),0,5);
        System.out.println(s3);

    }
}
