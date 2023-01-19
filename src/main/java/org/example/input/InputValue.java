package org.example.input;

import java.util.Scanner;

public class InputValue {
    public int inputValue() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an amount to withdrawal: ");
        return scn.nextInt();
    }
}
