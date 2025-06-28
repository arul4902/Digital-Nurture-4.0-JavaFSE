package com.example.junitdemo;


public class Calculator1 {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        if(b==0) throw new IllegalArgumentException("divide by zero is not possible...");
        return a/b;
    }
}
