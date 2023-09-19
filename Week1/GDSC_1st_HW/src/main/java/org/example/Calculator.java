package org.example;

public interface Calculator {
    int plus(int a, int b);
    int minus(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
}

class Calc implements Calculator{
    public int plus(int a, int b){
        return a + b;
    }
    public int minus(int a, int b){
        return a - b;
    }
    public int mul(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        return a / b;
    }
}