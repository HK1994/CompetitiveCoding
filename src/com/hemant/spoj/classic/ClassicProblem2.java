package com.hemant.spoj.classic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by hemantkumar on 6/11/2018.
 * PRIME1 - Prime Generator
 * #number-theory
 */
public class ClassicProblem2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int noOfTestCases = Integer.parseInt(reader.readLine());
        int[] m = new int[noOfTestCases];
        int[] n = new int[noOfTestCases];
        for (int i = 0; i < noOfTestCases; i++) {
            String[] str = reader.readLine().split(" ");
            m[i] = Integer.parseInt(str[0]);
            n[i] = Integer.parseInt(str[1]);
        }
        for (int i = 0; i < noOfTestCases; i++) {
            getPrimeNumbers(m[i], n[i]);
        }
    }

    private static void getPrimeNumbers(int x, int y) {
        int m = x;
        int n = y;
        for (int i = m; i <= n; i++) {
            if ( i > 1 && checkPrime(i)) {
                System.out.println(i);
                if(i > 3 && i%2 != 0) i++;
            }
        }

    }

    private static Boolean checkPrime(int num) {
        Boolean flag = true;
        if (num < 4)
            return true;
        for (int j = 2; j <= num / 2; j++) {
            if (num % j == 0) {
                flag = false;
            }
        }
        return flag;
    }

}

