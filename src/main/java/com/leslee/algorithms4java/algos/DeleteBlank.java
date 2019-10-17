package com.leslee.algorithms4java.algos;

/**
 * @description:
 * @author: Leslee
 * @create: 2019-10-17 09:41
 **/
public class DeleteBlank {
    public static String deleteBlank(String target){
        StringBuilder sb = new StringBuilder();
        boolean isFirstBlank = false;
        char c;
        for (int i=0;i<target.length();i++){
            c = target.charAt(i);
            if (c==' '|| c=='\t'){
                if (!isFirstBlank){
                    sb.append(c);
                    isFirstBlank=true;
                }
            }
            else {
                sb.append(c);
                isFirstBlank = false;
            }
        }
        return  sb.toString();
    }

    public static void main(String[] args) {
        String string = "acd  c fd dd";
        String res = DeleteBlank.deleteBlank(string);
        System.out.println(res);
    }

}
