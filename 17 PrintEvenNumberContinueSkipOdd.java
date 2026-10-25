import java.util.Scanner;

class PrintEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] array = ArrayUtility.inputArray();
//
//        for (int value : array){
//            if (value %2 != 0){
//                continue;                      USING FOR-EACH LOOP PRINT EVEN NUMBER ENTERED BY USER
//                                               SKIP ODD NUMBER USING CONTINUE STATEMENT
//            }
//            System.out.println(value);
//        }

        for (int i = 1; i <= 100; i++){
            if (i%2 != 0){
                continue;                    //USING FOR LOOP PRINT EVEN NUMBER 1 TO 100
//                                             SKIP ODD NUMBER USING CONTINUE STATEMENT
            }
            System.out.print(i +" ");
        }
    }
}
