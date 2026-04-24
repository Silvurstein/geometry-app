import java.util.Scanner;

public class ConsoleUi {

    Scanner scanner = new Scanner(System.in);

    public void start() {

    boolean running = true;


    while(running) {

        System.out.println("Choose shape: 1. circle / rectangle");
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                circleMath();
                break;
            case 2:
                rectangleMath();
                break;

        }
     }
    }

    public void circleMath() {
        System.out.println("Enter radius: ");
        int radius = scanner.nextInt();

        Circle circle = new Circle(radius);
        double area = circle.area();
        double circumference = circle.perimeter();

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public void rectangleMath() {
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enther height: ");
        int height = scanner.nextInt();

        Rectangle rectangle = new Rectangle(width, height);
        double area = rectangle.area();
        double circumference = rectangle.perimeter();

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

}

