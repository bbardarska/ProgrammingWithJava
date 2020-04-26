
import java.util.Scanner;

public class LongestPalindromeInString {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        String myString = scan.nextLine();
        System.out.print(findLongestPalindrome(myString));

    }

    public static String findLongestPalindrome(String str ){
        if(str.length() < 1 || str == null){
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i=0; i<str.length(); i++){
            int length1 = expandFromCenter(str,i, i);
            int length2 = expandFromCenter(str,i, i+1);
            int actualLength = Math.max(length1,length2);
            if(actualLength > end - start){
                start = i- ((actualLength - 1)/2);
                end = i + (actualLength/2);
            }

        }
        return str.substring(start, end+1);
    }

    public static int expandFromCenter(String str, int left, int right){
        if(str == null || str.length() == 0 || left > right){
            return 0;
        }

        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }

        return right - left - 1;
    }
}
