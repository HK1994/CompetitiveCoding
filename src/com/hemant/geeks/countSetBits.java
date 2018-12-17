package com.hemant.geeks;

public class countSetBits {

    public static String countBitsMethod1(int n)
    {
        int count=0;
        while(n>0)
        {
            n = n&(n-1);
            count++;
        }
        return String.valueOf(count);
    }

    public static String countBitsMethod2(int n)
    {
        int count=0;
        while(n>0)
        {
            count+= n&1;
            n>>=1;

        }
        return String.valueOf(count);
    }

    public static void main(String args[])
    {
        System.out.println(Integer.bitCount(15));  //O(1)
        System.out.println(countBitsMethod1(15)); // O(log n )  Brian Kerinigham's Algorithms
        System.out.println(countBitsMethod2(15)); // O(log n ) bitwise count
    }
}
