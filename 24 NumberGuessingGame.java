import java.util.Scanner;

class GuessingGame {
    int userInput;

    GuessingGame(int userInput){
        this.userInput = userInput;
    }

    @Override
    public String toString() {
        return "GuessingGame{" +
                "your guessed number : " + userInput +" \n" +
                "massage : " + compareNumber(userInput) +
                '}';
    }

    int guessNumber(){
        double random = Math.random()*2;
        int cili = (int)Math.ceil(random);
        return cili;
    }
    String compareNumber(int number){
        int store = guessNumber();
        if (number == store){
            return "Number through by the system is : " + store + "\n You win";
        }
        return "you guessed the wrong number ," +
                "Number through by the system is : "+ store;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to number guessing game");
        System.out.print("please choose a number :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        GuessingGame object = new GuessingGame(num);
        System.out.println(object.toString());

    }

}
