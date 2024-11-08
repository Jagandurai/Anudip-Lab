public class ShapeAreaCalculator {

    // Constructor for Rectangle
    public ShapeAreaCalculator(double length, double width) {
        double area = length * width;
        System.out.printf("Area of Rectangle: %.2f\n", area);
    }

    // Constructor for Square
    public ShapeAreaCalculator(double side) {
        double area = side * side;
        System.out.printf("Area of Square: %.2f\n", area);
    }

    // Constructor for Circle
    public ShapeAreaCalculator(double radius, boolean isCircle) {
        if (isCircle) {
            double area = Math.PI * radius * radius;
            System.out.printf("Area of Circle: %.2f\n", area);
        }
    }

    // Constructor for Triangle
    public ShapeAreaCalculator(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            double area = 0.5 * base * height;
            System.out.printf("Area of Triangle: %.2f\n", area);
        }
    }

    public static void main(String[] args) {

        // Rectangle
        new ShapeAreaCalculator(5.0, 3.0);

        // Square
        new ShapeAreaCalculator(4.0);

        // Circle
        new ShapeAreaCalculator(7.0, true);

        // Triangle
        new ShapeAreaCalculator(6.0, 8.0, true);
    }
}
