package com.hemant.spoj.classic;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hemantkumar on 6/11/2018.
 * TEST - Life, the Universe, and Everything Problem
 * #basic #tutorial #ad-hoc-1
 */
public class ClassicProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
// take input till no is not 42
        boolean valNot42 = false;
        do {
            int a = sc.nextInt();
            if (a != 42) {
                valNot42 = true;
                list.add(a);
            } else {
                valNot42 = false;
            }
        }
        while (valNot42);

        for (Integer e : list) {
            System.out.println(e.toString());
        }
    }
}

