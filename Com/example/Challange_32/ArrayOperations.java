package Com.example.Challange_32;

public class ArrayOperations {

    private int arr[];

    public ArrayOperations(int[] array) {
        this.arr = array;
    }

    public class Statistics {

        int mean() {

            int sum = 0;
            for (int Result : arr) {
                sum += Result;
            }
            return sum / arr.length;
        }

        int median(){
            return 0;
        }
    }

}

