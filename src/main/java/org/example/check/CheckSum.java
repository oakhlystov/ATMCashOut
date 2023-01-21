package org.example.check;

public class CheckSum {
    public static boolean checkIfSumDiv20HasRest(int sum) {
        return sum % 20 != 0;
    }

    public static boolean checkIfSumDiv50HasRest(int sum) {
        return sum % 50 != 0;
    }

    public static boolean checkIfSumIsLessThan20(int sum) {
        return sum < 20;
    }

    public static boolean checkIfSumIsGreaterThan1mln(int sum) {
        return sum > 1000000;
    }

    public static boolean checkIfSumIsGreaterThanZero(int sum) {
        return sum > 0;
    }
}
