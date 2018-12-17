package com.hemant.geeks;

import java.util.Scanner;

public class covertBinaryToDecimal {

    public static String numberInDecimal(int n) {
        String s = String.valueOf(n);
        int size = s.length();
        int decimalNumber = 0;
        int base = 1;

        for (int i = size - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                decimalNumber = decimalNumber + base;
            }
            base = base * 2;
        }
        return String.valueOf(decimalNumber);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int binaryNumber = sc.nextInt();

        System.out.println(numberInDecimal(binaryNumber));
    }
}
