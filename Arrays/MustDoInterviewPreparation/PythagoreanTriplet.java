package com.company;

import java.util.Scanner;

public class PythagoreanTriplet {

	public static final void swap(int [] arr, int a, int b){
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int size = scan.nextInt();
	int [] arr = new int[size];
	int [] arr2 = new int [size];
	boolean flag= false;

	for (int i=0; i<size; i++){
	    arr[i] = scan.nextInt();
    }

	for (int i=0; i<size; i++){
	    arr2[i] = arr[i]*arr[i];
    }

	for (int i=0; i<size-1; i++){
		for (int j=i+1; j<size; j++){
			if(arr2[j]<arr2[i]){
				swap(arr2,j,i );
			}
		}
	}
	int c = arr2[size-1];
	for (int i=0;i<size;i++) {
		for (int j = 0; j < size - 2; j++) {
			if (arr2[j] + arr2[j + 1] == c) {
				flag = true;
			}
		}
		size--;
		c = arr2[size - 1];
	}
	if(flag == true){
		System.out.println("YES");
	}
	else{
		System.out.println("NO");
	}




	/*for (int i=0; i<size; i++){
		System.out.print(arr2[i] + " ");
	}*/
    }
}
