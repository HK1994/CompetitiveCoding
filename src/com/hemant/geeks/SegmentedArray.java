package com.hemant.geeks;

import java.util.Scanner;

public class SegmentedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arrayLen = sc.nextInt();
        int[] array = new int[arrayLen];

        for (int i = 0; i < arrayLen - 1; i++)
            array[i] = sc.nextInt();

        segmentArray(array, arrayLen);  //DNF Algorithm
    }

    public static void segmentArray(int[] a, int len) {
        int low = 0, temp = 0;
        int mid = 0;
        int high = len - 1;

        while (mid <= high) {
            switch (a[mid]) {
                case 0: {
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;

                }
                case 1: {
                    mid++;
                    break;

                }
                case 2: {
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;

                }

            }

        }
    }
}
