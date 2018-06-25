package com.hemant.geeksforgeeks.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hemantkumar on 6/25/2018.
 * Max Tip Calculator #geeksforgeeks
 */
public class TipCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            int noOfOrders = Integer.parseInt(str[0]);
            int rahulOrders = Integer.parseInt(str[1]);
            int ankitOrders = Integer.parseInt(str[2]);
            int[] rahulOrderList = new int[rahulOrders];
            int[] ankitOrderList = new int[ankitOrders];
            String str1[] = br.readLine().split(" ");
            for (int j = 0; j < noOfOrders; j++) {
                rahulOrderList[j] = Integer.parseInt(str1[j]);
            }
            String str2[] = br.readLine().split(" ");
            for (int k = 0; k < noOfOrders; k++) {
                ankitOrderList[k] = Integer.parseInt(str2[k]);
            }
            
        }


    }
}
