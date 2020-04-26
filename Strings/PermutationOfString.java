//Given a string S. The task is to print all permutations of a given string.

import java.util.Scanner;

public class PermutationOfString {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        permute(str);
    }

    public static void permute (String myString){
        if(myString == null || myString.length()==0){
            System.out.print("Invalid length of the string.");
            return;
        }
        permute("", myString);
    }
    private static void permute (String prefix, String left){
        if(left.length()==0){
            System.out.println(prefix);
            return;
        }
        for (int i=0; i<left.length(); i++){
            permute(prefix + left.charAt(i), left.substring(0,i) + left.substring(i+1,left.length()));
        }
    }
}
