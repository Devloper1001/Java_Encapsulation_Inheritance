import java.util.Scanner;

class CalCircle {
    double radius ;

    CalCircle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CalCircle{area of circle : " + getArea() + "}" +" "+
                "{Circumference of circle :" + getCircumference() +"}";

    }

    double getCircumference(){
        return 2 * Math.PI * radius;

    }double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of circle ");
        System.out.print("Enter the radius of circle :");
        radius = input.nextDouble();
        CalCircle circle = new CalCircle(radius);
        System.out.println(circle.toString());

    }
}
