public class ReverseString {
    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }

    public static String reverse(String str){
        StringBuilder strBuilder = new StringBuilder();
        char [] strChar = str.toCharArray();

        for(int i = strChar.length - 1; i>=0; i--){
            strBuilder.append(strChar[i]);
        }
        return strBuilder.toString();
    }
    
    public static void main(String args []){
        String originalString = "Hello World";
        System.out.println("The original string is: " + originalString);

        String reversedString = reverseRecursively(originalString);
        //String reversedString = reverse(originalString);
        System.out.print("The reversed string is: " + reversedString );
    }
}
