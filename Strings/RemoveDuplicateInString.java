import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateInString {

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        System.out.print(removeDuplicate(str));

    }

    public static String removeDuplicate(String str){
        Set<Character> set = new HashSet<>();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i=0; i<str.length(); i++){
            Character c = str.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                stringBuffer.append(c);
            }
        }
        return stringBuffer.toString();
    }
}
