package com.company;

import java.util.Scanner;

public class TrappingWater {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int [] arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }

        int [] arr1 = new int[size]; //left
        int [] arr2 = new int[size]; //right

        int max=0;
        for (int i=0; i<size; i++){
            if(max<arr[i]){
                max=arr[i];
            }
            arr1[i]=max;
        }

        int max1=0;
        for (int i=size-1; i>=0; i--){
            if(max1<arr[i]){
                max1=arr[i];
            }
            arr2[i]=max1;
        }

        int waterAtIndex = 0;
        int totalWater = 0;
        for (int i=0; i<size; i++){
            waterAtIndex = Math.min(arr1[i],arr2[i]) - arr[i];
            totalWater += waterAtIndex;
        }

        System.out.println(totalWater);

    }
}
