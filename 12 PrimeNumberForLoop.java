import java.util.Scanner;

class PrimeNumberForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number which you want to check:-");
        int number = input.nextInt();
        int prime = checkPrime(number);
        if (prime > 1){
            System.out.println("number is not prime");
        }else {
            System.out.println("number is prime");
        }
    }
    public static int checkPrime(int number){
            int count = 0 ;
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                    System.out.println(count);

                    // logic is that any prime number is divided by
                    // one and itself only so,we divide the
                    // number from 2 to that number  take reminder from 2 to that number
                    // and if  the number is divided by more than 1 number and give
                    // reminder zero so the number is not prime
                }
            }
            return count;
        }


}
