import java.util.Scanner;

class MinimumOfTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the program to find minimum of two number\n ");
        System.out.print("Enter the first number :-");
        int num1 = input.nextInt();
        System.out.print("Enter second number :-");
        int num2 = input.nextInt();
        System.out.println(Min(num1,num2));

    }
    public static int Min(int num1 , int num2){
        int maximumOfTwoNumber = num1 < num2 ? num1 : num2;
        return maximumOfTwoNumber;

    }
}
