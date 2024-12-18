package com.companyName.core;

public class Calculator {
    public static int sum(int a,int b){
        if (a==0||b==0)throw new  IllegalArgumentException("this method wont accept zero value");
        return a+b;
    }
    public static int sum(int a,int b,int c){
        if (a==0||b==0||c==0)throw new  IllegalArgumentException("this method wont accept zero value");
        return a+b+c;
    }

    public int multiply(int a,int b){
        if (a<0||b<0)throw new  IllegalArgumentException("this method wont accept negative value");
        return a*b;
    }
    public int multiply(int a,int b,int c){
        if (a<0||b<0||c<0)throw new  IllegalArgumentException("this method wont accept negative value");
        return a*b*c;
    }
    public static int division(int a,int b){
        if (b==0)throw new  IllegalArgumentException("in this method b cant be zero because it will give you infinity");
        if (a==0)throw new  IllegalArgumentException("in this method a cant be zero because it will give you zero back");
        return a/b;
    }
}
