class MaxValArray {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        maxVal(array);

    }public static void maxVal(int[] arr){
        int min = 0;
        for (int value : arr){
            if (min < value){
                min = value;

            }
        }
        System.out.println("maximum number is: "+ min);
    }
}
