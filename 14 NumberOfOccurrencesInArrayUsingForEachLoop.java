import java.util.Scanner;

class NumberOfOccurrencesInArray {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for which you want to check number of occurrences:-"+" ");
        int target = input.nextInt();

        // Method call

        int result = Occurrence(array,target);
        System.out.println("Your number is found"+" "+result+" "+"times in array");
    }
    public static int Occurrence(int[] arr, int num){
        int count = 0;
       for (int output : arr){
           if (output == num){
               count++;
           }
       }
        return count;
    }
}
