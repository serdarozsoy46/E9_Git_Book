package day39_Recap.shapeTask;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            System.err.println("Invalid Side: "+side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Squara");
        setSide(side);
    }

    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side='" + side +'\''+
                ", area='" + area() + '\''+
                ", perimeter='" + perimeter() + '\''+
                '}';
    }
}
