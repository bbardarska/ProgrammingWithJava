package com.company;

import java.util.Scanner;

public class InversionCount {

    public static final void swap(int [] arr, int a, int b){
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	int size = scan.nextInt();
	int [] arr = new int[size];
	int numOfInv =0;

        for (int k=0; k<size; k++){
            arr[k] = scan.nextInt();
        }

        for (int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(arr[j]<arr[i]){
                    swap(arr,j, i);
                    numOfInv++;
                }
            }
        }
        System.out.println(numOfInv);
    }
}
