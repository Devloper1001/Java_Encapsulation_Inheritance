import java.util.Scanner;

class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome the program to calculate absolute value");
        System.out.print("Enter your number :-");
        int num = input.nextInt();

                   // Object Creation
        AbsoluteValue absolut = new AbsoluteValue();
        System.out.println(absolut.absolute(num));

    }

    public int absolute(int num){
        int output = num < 0 ? -num : num;
        return output;
    }
}
