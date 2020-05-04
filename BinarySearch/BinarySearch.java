/*Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function
* to search target in nums. If target exists, then return its index, otherwise return -1. */

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int left = 0;
        int right = arr.length -1;

        while(left<=right){
            int middleElement = left + (right - left)/2;
            if(arr[middleElement] == target){
                return middleElement;
            }
            else if(arr[middleElement] > target){
                right = middleElement -1;
            }
            else{
                left = middleElement + 1;
            }
        }

        return -1;
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int sizeOfArray = scan.nextInt();
        int [] array = new int[sizeOfArray];
        for (int i=0; i<sizeOfArray; i++){
            array[i]=scan.nextInt();
        }
        int target = scan.nextInt();
        System.out.print(binarySearch(array,target));

    }
}
