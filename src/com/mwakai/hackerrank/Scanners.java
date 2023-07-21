package com.mwakai.hackerrank;

/**
 * In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.
 */

import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter");
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();


        System.out.println("String: " +s);
        System.out.println("Double: " +d);
        System.out.println("Int: " +i);
    }
}
