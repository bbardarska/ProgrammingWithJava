
/*Given an array of positive integers. Your task is to find the leaders in the array.
Note: An element of array is leader if it is greater than or equal to all the elements
to its right side. Also, the rightmost element is always a leader. */

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayLeaders {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());
        int [] arr = new int[n];
        String inputLine[] = br.readLine().trim().split(" ");
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(inputLine[i]);
        }
        int max = arr[n-1];
        StringBuffer str = new StringBuffer();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                a.add(max);
            }
        }
    for(int i=a.size()-1;i>=0;i--){
        str.append(a.get(i)+" ");
    }
    System.out.println(str);


    }
}
