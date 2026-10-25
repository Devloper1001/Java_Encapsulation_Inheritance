import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guss ;
        do {
            System.out.print("Enter the number :-");
            guss = input.nextInt();
        }while (!isTrue(guss));
        System.out.println(" congratulations you guess the right number");
    }
    public static boolean isTrue(int num){
        return num == 5;
    }
}
