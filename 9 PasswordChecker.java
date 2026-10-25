import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password ;


        PasswordChecker objectOfPasswordChecker = new PasswordChecker();

        do {
            System.out.print("Please enter your password :-"+" ");
            password = input.next();
        }while (!objectOfPasswordChecker.passwordChecker(password));
        System.out.println("password is valid");

    }
    public boolean passwordChecker(String password){
       if (password.equals("gagan@#.123")) return true;
       else return false;
    }
}
