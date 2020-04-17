/*Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively
i.e first element should be max value, second should be min value, third should be second max, fourth
 should be second min and so on...*/

package com.company;
import java.util.Arrays;
import java.util.Scanner;


public class RearangeMaxMin {
    public static final void swap(int [] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int sizeOfArray = scan.nextInt();
	int[] arr= new int[sizeOfArray];

	for (int i=0; i<sizeOfArray;i++){
	    arr[i]=scan.nextInt();
    }
	for(int i=0; i<sizeOfArray-1;i++){
	    for(int j=i+1;j<sizeOfArray;j++){
	        if(arr[j]<arr[i]){
	            swap(arr,j,i);
            }
        }
    }
int start = 0;
	for (int i=0; i<sizeOfArray;i++){
	    int end=sizeOfArray-1;
	    if(start<end){
	        System.out.print(arr[end] + " " + arr[start] + " ");
	        sizeOfArray--;
	        start++;
        }
	    else if(start==end){
	        System.out.print(arr[start]);
        }
    }

    }
}
