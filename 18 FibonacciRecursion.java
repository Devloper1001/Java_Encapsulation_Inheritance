import java.util.Scanner;

class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number :");
        int  num = input.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.println(Fibonacci(i) +" ");
        }
    }
    public static int Fibonacci(int position){
        System.out.print(".");
        if (position == 1){
            return 0;
        }if (position == 2){
            return 1;
        }
        return Fibonacci(position - 1) + Fibonacci(position - 2);
    }
}
