package com.leslee.algorithms4java.algos;

/**
 * @author: Leslee
 * @create: 2019-10-13 22:22
 **/
public class StringConvertInt {

    public static long string2Int(char[] a){
        int n = 0;
        for (int i=0;i<a.length;i++){
            if (a[i]!='0'){
                int c = a[i]-'0';
                n = n*10+c;
            }
        }
        return n;
    }
    //1.空指针判断没加 2. 正负符 3. 非法字符 4. 整型溢出
    public static int string2Int1(char[] a){
        if (a.length==0){
            return 0;
        }
        //处理空格
        //处理正负
        int sign =1;
        //………………


        int n = 0;
        for (int i=0;i<a.length;i++){
            if (a[i]!='0'){
                int c = a[i]-'0';
                n = n*10+c;
            }
        }
        return n;
    }




    public static void main(String[] args) {
        String a = "123";
        char[] aa = a.toCharArray();
        long m = StringConvertInt.string2Int(aa);
        System.out.println(m);
    }

}
