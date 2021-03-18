package com.Malhi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("---xxx---Advance Calculator---xxx---");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number => ");
        int i = s.nextInt();
        System.out.print("Enter second number => ");
        int j = s.nextInt();
       AdvanceCalculator adCal = new AdvanceCalculator(i,j );
       adCal.addSub();
       adCal.mulDiv();
        System.out.println("You noticed any change");



    }
}
