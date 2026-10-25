import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Calculator program ");
        System.out.print("Enter your first number :-");
        int num1 = input.nextInt();
        System.out.print("Enter your second number :-");
        int num2 = input.nextInt();
        System.out.print("Enter operator number :-");
        String operation = input.next();

        int output = switch (operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> -1;
        };
        System.out.println(output);
    }
}
