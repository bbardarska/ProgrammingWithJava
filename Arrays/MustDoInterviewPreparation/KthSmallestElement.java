package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class KthSmallestElement {

    public final static void swap(int []arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int k = scan.nextInt();
        for (int i=0;i<size-1;i++){
            for (int j=i+1;j<size;j++){
                    if(arr[j]<arr[i]){
                        swap(arr,j,i);
                    }
            }
        }
        if(k<=size){
            System.out.println(arr[k-1]);
        }

    }
}
