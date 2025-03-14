import java.util.Scanner;

public class AreaCalculator {
    private static final Scanner scanner = new Scanner(System.in);
    private final static int EXIT = 0;
    static double pi(){
        return 3.14159;
    }

    static double circle(double radius){
        return pi() * radius * radius;
    }
    private static double square(double s) {
        return s * s;
    }

    private static double trapezoid(double top, double bottom, double ht) {
        return 0.5 * (top + bottom) * ht;
    }


    private static double rectangle(double h, double w) {
        return h * w;
    }

    private static double triangle(double base, double height) {
        return 0.5*base*height;
    }

    public static void printOptions() {
        System.out.println("**** Area Calculator *********");
        System.out.println("""
                0. Exit
                1. Circle
                2. Triangle
                3. Rectangle
                4. Square
                5. Trapezoid""");
        System.out.print("Enter your option (0-5) ");


    }
    public static void main(String[] args) {

        int choice;
        do {
            printOptions();
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exit");
                    return;
                case 1:
                    System.out.println("Please enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.printf("The area of the circle: %.3f\n\n", circle(radius));
                    break;
                case 2:
                    System.out.println("Please enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.println("Please enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    System.out.printf("The area of the triangle: %.3f\n\n", triangle(base, height));
                    break;
                case 3:
                    System.out.println("Please enter the width of the rectangle: ");
                    double h = scanner.nextDouble();
                    System.out.println("Please enter the height of the rectangle: ");
                    double w = scanner.nextDouble();
                    System.out.printf("The area of the rectangle: %.3f\n\n", rectangle(h, w));
                    break;
                case 4:
                    System.out.println("Please enter the side of the square: ");
                    double s = scanner.nextDouble();
                    System.out.printf("The area of the square: %.3f\n\n", square(s));
                    break;
                case 5:
                    System.out.println("Please enter the top of the trapezoid: ");
                    double top = scanner.nextDouble();
                    System.out.println("Please enter the bottom of the trapezoid: ");
                    double bottom = scanner.nextDouble();
                    System.out.println("Please enter the height of the trapezoid: ");
                    double ht = scanner.nextDouble();
                    System.out.printf("The area of the square: %.3f\n\n", trapezoid(top, bottom, ht));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != EXIT);
    }
}
