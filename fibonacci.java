package com.company;

public class fibonacci {
    public int fib(int n) {
        if (n<=1){
            return n;
        }
    return fib(n-1)+ fib(n-2);
    }

    public static void main(String[] args) {
	fibonacci f = new fibonacci();
	System.out.println(f.fib(4));
    }
}
