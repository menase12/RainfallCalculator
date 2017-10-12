package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Calculation();
    }
    public static double Calculation()

    {
        double length,width,inch;
        double rainFall;
        Scanner keyboard= new Scanner(System.in);

        System.out.print("Enter your roof length: ");
        length=keyboard.nextDouble();
        System.out.print("Enter your roof width: ");
        width=keyboard.nextDouble();
        inch=(length*width)*12;
        rainFall=(inch/231);
        System.out.print("Your calculated rainfall is: "+rainFall+" inches");
        return 0;
    }
}
