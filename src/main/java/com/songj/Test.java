package com.songj;

public class Test {
    /**
     * 1²+2²+3²+……+n²=n(n+1)(2n+1)/6 可以用(n+1)³-n³=3n²+3n+1累加(立方差推导)
     * @param args
     */
    public static void main(String[] args) {
        int n = 100;
        int x = n*(n+1)*(2*n+1)/6;
        System.out.println(x);
    }
}