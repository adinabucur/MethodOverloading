package com.learnprogramming;

public class Exercise {
    public static void main(String[] args) {
        double result = calcFeetAndInchesToCentimeters(2, 2);
        System.out.println(result);

        double secondResult = calcFeetAndInchesToCentimeters(26);
        System.out.println(secondResult);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 && inches > 12)) {
            return -1;
        }
        double feetToCentimeters = feet * 12 * 2.54;
        double inchesToCentimeters = inches * 2.54;
        return feetToCentimeters + inchesToCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        int inchesToFeet = (int) inches / 12;
        double restOfInches = inches % 12;
        System.out.println("Inches to feet = " + inchesToFeet);
        System.out.println("Rest of inches = " + restOfInches);
        return calcFeetAndInchesToCentimeters(inchesToFeet, restOfInches);
    }
}
