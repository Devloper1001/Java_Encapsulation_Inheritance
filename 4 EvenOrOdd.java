import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome the program to check your number is even or odd");
        System.out.print("Enter your number :-");
        int num = input.nextInt();
        Even_Odd(num);

    }
    public  static void Even_Odd(int num){
        String output = num%2 == 0 ? "even" : "Odd";
        System.out.println(output);
    }
}
