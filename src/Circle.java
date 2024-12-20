public class Circle implements GeometricalFigure{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
        calculateArea(radius);
    }

    @Override
    public void calculateArea(double side1) {
        System.out.println("The area of a circle is " + Math.floor(Math.PI * Math.pow(radius, 2)));
    }

    @Override
    public void calculateArea(double side1, double side2) {
    }

    @Override
    public void calculateArea(double side1, double side2, double side3) {
    }


}
