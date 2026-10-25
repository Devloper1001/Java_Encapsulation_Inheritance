package Com.example.Challenge_27.geometry;

public class geometry {
    private double AreaOfCircle ;
    private double AreaOfRectangle ;
    private double length;
    private double bredth;
    private double radius;

    public geometry(double length,double bredth){
        this.length = length;
        this.bredth = bredth;
    }

    public geometry(double radius){
        this.radius = radius;
    }

    public double getAreaOfCircle(){
        return Math.PI*(Math.pow(radius,2));
    }

    public double getAreaOfRectangle() {
        if (length == bredth){
            System.out.println("Length and bredth are not same it make a square please " +
                    "enter different length and different bredth");
        }else {
            return length * bredth;
        }
        return 0;

    }
}
