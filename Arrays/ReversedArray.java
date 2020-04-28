import java.util.Scanner;

public class ReversedArray {

    static int [] reversedArr(int [] arr){
        int [] reversedNumbers = new int[arr.length];
        int j=0;

        for (int i=reversedNumbers.length - 1; i>=0; i--){
            reversedNumbers[j] = arr[i];
            j++;
            System.out.print(arr[i] + " ");
        }
        return reversedNumbers;
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] array = new int [size];

        for (int i=0; i<size; i++){
            array[i]=scan.nextInt();
        }

        reversedArr(array);
    }
}
