package com.Malhi;

public class AdvanceCalculator extends Calulator {

    public AdvanceCalculator(int a, int b) {
        super(a, b);
    }

    public void mulDiv(){
        System.out.println("Multiplication => " +a*b);
        System.out.println("Division => "+ a/b);
        System.out.println("Are you not Entertained?");
    }

}
