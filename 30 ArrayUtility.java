import java.util.Scanner;

// INPUT ARRAY ELEMENT

class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER NUMBER OF ELEMENTS : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i<size){
            System.out.print("ENTER ELEMENT NUMBER "+ (i+1) +" : " );
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
    public static int[] printArray(int[] arr){
        int i = 0;
        while(i< arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
        return arr;
    }
    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER NUMBER OF ROWS: ");
        int rows = input.nextInt();
        System.out.print("PLEASE ENTER NUMBER OF COLUMN: ");
        int column = input.nextInt();
        int[][] numArr = new int[rows][column];
        int i = 0;
        while(i< rows){
            int j = 0;
            while (j<column){
                System.out.print("ENTER ELEMENT OF ROW "+":"+" " + (i+1)+" "+","+" "
                        +"COLUMN"+" "+":"+" "+(j+1)+" "+"="+" " );
                numArr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArr;
    }

}
