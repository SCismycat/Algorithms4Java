package com.leslee.algorithms4java.algos;

/**
 * @description:
 * @author: Leslee
 * @create: 2019-10-17 11:28
 **/
public class Fibonacci {
    //自顶向下
    public static int fibonacci(int n){
        if(n<=0){
            return n;
        }
        int[] memo = new int[n+1];
        for (int i=0;i<=n;i++){
            memo[i] = -1;
        }
        return fib(n,memo);
    }
    public static int fib(int n,int[] memo){
        if (memo[n]!=-1){
            return memo[n];
        }
        if (n<=2){
            memo[n] = 1;
        }else {
            memo[n] = fib(n-1,memo)+fib(n-2,memo);
        }
        return memo[n];
    }
    //自底向上
    public static int fib_DP(int n){
        if(n<=0){
            return n;
        }
        int[] memo = new int[n+1];
        memo[0] = 0;
        memo[1] = 1;
        for (int i=2;i<=n;i++){
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }
}
