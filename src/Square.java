public class Square implements GeometricalFigure{
    private double side1;
    private double side2;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public Square(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        calculateArea(side1, side2);
    }

    @Override
    public void calculateArea(double side1, double side2) {
        System.out.println("The area of a square is " + side1 * side2);
    }

    @Override
    public void calculateArea(double side1) {
    }

    @Override
    public void calculateArea(double side1, double side2, double side3) {
    }
}
