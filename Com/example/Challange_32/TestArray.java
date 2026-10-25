package Com.example.Challange_32;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int []{10,20,30});
        ArrayOperations.Statistics obj = opr.new Statistics();
        System.out.println(obj.mean());
    }
}
