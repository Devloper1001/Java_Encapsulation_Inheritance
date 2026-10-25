import java.util.Scanner;

class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your string :");
        String str = input.next();
        System.out.println(palindrome(str) ? "Palindrome" : "Not palindrome");
    }
    public static boolean palindrome(String str){
        if (str.length() <= 1) {
            return true;
        }

        int lastChar = str.length()-1;

        if (str.charAt(0) != str.charAt(lastChar)){
            return false;
        }
        String newStr = str.substring(1,lastChar);
        return palindrome(newStr);
    }
}
