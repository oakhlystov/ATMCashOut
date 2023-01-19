package org.example.check;

public class CheckInput {
    public void checkInputAmount(int sum) {
        if (sum < 20 || sum > 1000000) {
            throw new IllegalStateException("The amount must be 20 - 1.000.000, but you entered " + sum);
        }
    }
}
