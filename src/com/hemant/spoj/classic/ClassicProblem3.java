package com.hemant.spoj.classic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hemantkumar on 6/12/2018.
 * ADDREV - Adding Reversed Numbers
 * #simple-math #ad-hoc-1
 */
public class ClassicProblem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        int [] x = new int[testCases];
        int [] y = new int[testCases];
        int [] z = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            String[] str = br.readLine().split(" ");
            x[i] = reversedNumber(Integer.parseInt(str[0]));
            y[i] = reversedNumber(Integer.parseInt(str[1]));
        }
        for(int j=0;j<testCases;j++)
        {
            z[j]=reversedNumber(x[j]+y[j]);
            System.out.println(z[j]);
        }

    }

    static int reversedNumber(int num) {
        int revNum = 0;
        int x;
        while (num > 0) {
            x = num % 10;
            revNum = revNum * 10 + x;
            num = num / 10;
        }
        return revNum;
    }
}
