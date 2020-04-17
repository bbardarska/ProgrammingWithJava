/*Given an unsorted array A of size N of non-negative integers,
find a continuous sub-array which adds to a given number S.*/

package com.company;

import java.util.Scanner;

public class SubarraySum {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int testCases = scan.nextInt();
	int start = 0;
	int end = 0;
	long currSum = 0;
	boolean flag = false;

	for (int i=0; i<testCases; i++){
	    int size = scan.nextInt();
	    int sum = scan.nextInt();

	    int[] array = new int[size];
	    for (int k=0; k<size; k++){
	        array[k] = scan.nextInt();
        }
        for (int k=0; k<size; k++){
            currSum += array[k];

            if(currSum >= sum){
                end = k;

                while(sum < currSum && start < end){
                    currSum -= array[start];
                    start++;
                }
                if(currSum == sum){
                    System.out.println((start + 1) + " " + (end + 1));
                    flag = true;
                    break;
                }
            }
        }
        if(flag == false){
            System.out.println(-1);
        }
    }
    }

}
