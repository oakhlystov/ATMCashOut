package org.example.check;

public class CheckInput {

    public void checkInputAmount(int sum) {
        final int num20 = 20;
        final int million = 1000000;
        if (CheckSum.checkIfSumIsLessThan20(sum) || CheckSum.checkIfSumIsGreaterThan1mln(sum)) {
            throw new IllegalStateException("The amount must be " + num20 + " - " + million + ", but you entered " + sum);
        }
    }
}
