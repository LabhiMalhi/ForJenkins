package com.Malhi;

public class Calulator{
    public int a;
    public int b;

    public Calulator(int a, int b){
        this.a = a;
        this.b = b;

    }

    public void addSub(){
        System.out.println("Addition => " + (this.a+this.b));
        System.out.println("Subraction => " + (this.a-this.b));
    }
}
