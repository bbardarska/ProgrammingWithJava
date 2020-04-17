/*Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array.
 Equilibrium position in an array is a position such that the sum of elements
  before it is equal to the sum of elements after it.*/

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilibriumPoint {


	public static int getEquilibriumPoint (int [] arr, int n){
		int [] left = new int[n];
		int wholeSum = 0;
		int rightSum = 0;
		int ans = -1;
		for (int i=0; i<n;i++){
			wholeSum+=arr[i];
			left[i]=wholeSum;
		}
		for (int i=n-1;i>=0;i--){
			rightSum+=arr[i];
			if(rightSum==left[i]){
				ans = i + 1;
			}
		}
		return ans;
	}
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int [] arr = new int[n];
		String inputLine[] = br.readLine().trim().split(" ");
		for (int i=0; i<n; i++){
			arr[i]=Integer.parseInt(inputLine[i]);
		}
		System.out.println(getEquilibriumPoint(arr,n));

    }
}
