import Interface.ShapeInterface;

import java.util.Scanner;
//kode der skal refactors
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShapeInterface shape = createShape(scanner);

        if (shape != null) {
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
        } else {
            System.out.println("Unknown shape");
        }

        scanner.close();
    }

    public static ShapeInterface createShape(Scanner scanner) {
        System.out.println("Choose shape: 1) circle / 2) rectangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter radius:");
                double radius = scanner.nextDouble();
                return new Circle(radius);

            case 2:
                System.out.println("Enter width:");
                double width = scanner.nextDouble();

                System.out.println("Enter height:");
                double height = scanner.nextDouble();
                return new Rectangle(height, width);

            default:
                return null;
        }
    }
}
