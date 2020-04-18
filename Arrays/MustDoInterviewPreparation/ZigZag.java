/*Given an array A (distinct elements) of size N.
 Rearrange the elements of array in zig-zag fashion. The converted array should be in form a < b > c < d > e < f. */

import java.util.Scanner;

public class ZigZag {

    public static final void swap(int [] arr, int a, int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int [] arr = new int[n];

        boolean flag = false;

        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        for (int i=0; i<n-1; i++){

            if(!flag){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
            else {
                if(arr[i] < arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
            flag = !flag;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
