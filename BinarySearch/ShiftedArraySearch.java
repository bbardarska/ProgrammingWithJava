import java.util.Scanner;

public class ShiftedArraySearch {
    public static int shiftedArrSearch(int[] shiftedArr, int num){
        int pivot = findPivotPoint(shiftedArr);
        if(pivot == 0 || num < shiftedArr[0]){
            return binarySearch(shiftedArr, pivot, shiftedArr.length -1, num);
        }
        else{
            return binarySearch(shiftedArr, 0, pivot -1, num);
        }
    }

    public static int findPivotPoint(int [] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left<=right){
            int mid = left + (right - left)/2;
            if(mid == 0 || arr[mid] < arr[mid-1]){
                return mid;
            }
            else if(arr[mid] > arr[0]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return 0;
    }

    public static int binarySearch(int [] arr, int left, int right, int num){
       while(left<=right){
           int mid = left + (right - left)/2;
           if(arr[mid] == num){
               return mid;
           }
           else if(arr[mid]>num){
               right = mid - 1;
           }
           else{
               left = mid + 1;
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
        System.out.print(shiftedArrSearch(array,target));
    }
}
