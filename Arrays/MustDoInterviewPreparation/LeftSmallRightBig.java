/*Given an unsorted array of size N.
 Find the first element in array such that all of its left elements are smaller
 and all right elements to it are greater than it.*/

package com.company;

import java.util.Scanner;

public class LeftSmallRightBig {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int [] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i]=scan.nextInt();
        }
        int [] leftMax = new int[n];
        leftMax[0] = Integer.MIN_VALUE;

        for (int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1] , arr[i-1]);
        }

        int rightMin = Integer.MAX_VALUE;

        for (int i=n-1; i>=0; i--){
            if(arr[i] > leftMax[i] && arr[i] < rightMin){
                System.out.println(arr[i]);
            }
            rightMin = Math.min(rightMin,arr[i]);
        }

    }
}
