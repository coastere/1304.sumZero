package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 5;
        int[] result = new int[n];
        if (n == 0) {
            result[0]=0;
        }else {
            int sum=0;
            for (int i = 0; i <n-1 ; i++) {
                result[i]=i;
                sum+=i;
            }
            result[n-1]=-sum;
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(result[i]);
        }

    }
}
