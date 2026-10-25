import java.util.Scanner;

class SumeOfPositiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int count = 0;
        int[] array = ArrayUtility.inputArray();

//        do {
//            System.out.print("enter your number :-");
//            number = input.nextInt();
//            if (number < 0) continue;                  // WE  CAN USE THIS CASE ALSO
//            count+=number;
//            System.out.println(count);
//        }while (number >= 0 );
//
        for (int value : array){                       // FOR EACH LOOP
            if (value < 0){
                continue;
            }
            count+=value;
        }
        System.out.println("Sum of all positive number is  : "+count);

    }

}
