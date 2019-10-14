package com.leslee.algorithms4java.algos;

/**
 * @author: Leslee
 * @create: 2019-10-15 00:50
 **/
public class RemoveBlank {

    public void removeBlank(char[] s){
        int begin = 0;
        while (s[begin]==' '){
            begin++;
        }
        int j = 0;
        for (int i=begin;i<s.length-1;i++){
            if (s[i]==' ' && s[i+1]==' '){
                continue;
            }
            s[j++] =s[i];
        }
        s[j] = '\0';
    }

    public static void main(String[] args) {
        String str = " wer e   e   ";
        char[] s = str.toCharArray();
        RemoveBlank removeBlank = new RemoveBlank();
        removeBlank.removeBlank(s);
    }

}
