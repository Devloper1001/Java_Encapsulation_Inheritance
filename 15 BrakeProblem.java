import java.util.Scanner;

class BrakeProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        do {
//            System.out.print("enter the value :");
//            value= input.next();
//        }while (!value.equals("exit"));

        while (true) {
            System.out.print("enter the value :");
            String value = input.next();
            //if (value == "exit"){                       WE CANNOT COMPARE TWO OBJECT IT COMPARE --
            //                                         -- REFERENCES INSTEAD OF VALUE WHICH IS ALWAYS DIFFERENT
//            if (value.equals("exit")){                                THIS EQUAL IS CASE SENSITIVE
            if (value.equalsIgnoreCase("exit")) {        // THIS EQUALS IS NOT CASE SENSITIVE RESULT
                //                                                      ALWAYS TRUE EITHER UPPERCASE OR LOWERCASE
                System.out.println("You successfully exit");
                break;
            }

        }
    }
}
