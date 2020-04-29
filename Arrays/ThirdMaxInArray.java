import java.util.Scanner;

public class ThirdMaxInArray {
    static Integer thirdMax(int [] array, int size){
    int max = 0;
    int secondMax = 0;
    int thirdMax = 0;

    for (int i=0; i < size; i++){
        if(array[i]>max){
         thirdMax=secondMax;
         secondMax=max;
         max = array[i];
     }   else if(array[i]>secondMax){
            thirdMax = secondMax;
            secondMax=array[i];
     }   else if(array[i]>thirdMax){
         thirdMax=array[i];
     }
        }
    if(thirdMax == 0){
        return max;
    }
    return thirdMax;
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int [] array = new int[size];
        for (int i=0; i<size; i++){
            array[i]=scan.nextInt();
        }
        System.out.print(thirdMax(array,size));

    }
}
