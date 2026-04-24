import Interface.ShapeInterface;

public class Circle implements ShapeInterface {

    private double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }

        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }

    };


