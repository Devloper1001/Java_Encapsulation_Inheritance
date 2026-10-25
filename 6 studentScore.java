import java.util.Scanner;

class studentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome the program , Enter the marks ");
        System.out.print("Enter your marks :-");
        int marks = input.nextInt();
        studentScore score = new studentScore();
        score.score(marks);
    }
    public void score(int marks){
        String output = marks >= 80 ? "high" : (marks >= 50 ? "moderate" : "low");
        System.out.println(output);
    }

}
