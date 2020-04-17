package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversInGroups {

    public static void reverseInGroup(int [] arr, int n, int k){
        for (int i=0; i<n; i+=k){
            int left=i;
            int right = Math.min(i+k-1,n-1);
            int temp;
            while(left<right){
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left+=1;
                right-=1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine[]=br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        int k = Integer.parseInt(inputLine[1]);
        int [] arr = new int[n];
        String inputLine1[]=br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++){
            arr[i]=Integer.parseInt(inputLine1[i]);
        }
        reverseInGroup(arr,n,k);
        StringBuffer str = new StringBuffer();
        for (int i=0; i<n; i++){
            str.append(arr[i]+ " ");
        }
        System.out.println(str);
    }
}
