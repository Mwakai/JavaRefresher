package com.mwakai;

public class Main {

    /*
        - Access Modifier
        - Optional Static
        - Return type
        - Name
        - Optional Parameters
        - Method body
        - Optional return value
     */
    public static void main(String[] args) {
        double yield = calculatePropertyYield(1_300, 250_000);
        System.out.println(yield);
    }

    private static double calculatePropertyYield(double rent, double propertyPrice) {
        double yearlyRent = rent * 12;
        double yield = (yearlyRent / propertyPrice) * 100;

        return yield;
    }
}
