import java.util.Scanner;

class RandomNumber{

    int key;

    RandomNumber(int Key){
        this.key = key;
    }

    @Override
    public String toString() {
        return "RandomNumber{" +
                "your number is : =" + randomNumber() +
                '}';
    }

    long randomNumber(){
        return Math.round(Math.ceil(Math.random()*6));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Game");
        System.out.print("please press one and enter to throw the dice :");
        int key ;
        Scanner input = new Scanner(System.in);
        key = input.nextInt();
        RandomNumber game = new RandomNumber(key);
        System.out.println(game.toString());

    }
}
