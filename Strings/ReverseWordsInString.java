/*Given a String of length S, reverse the whole string without reversing the individual words in it.
Words are separated by dots.*/
import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String [] strArr = str.split("\\.");  //convert the string into a string array

        for(int i=strArr.length - 1; i>=0; i--){
            if(i==0){
                System.out.print(strArr[i]);
            }
            else{
                System.out.print(strArr[i] + ".");
            }
        }

    }
}
