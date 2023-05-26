//TASK 1

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = calculateCircleArea(radius);
        System.out.println("The area of the circle is: " + area);
    }

    public static double calculateCircleArea(double radius) {
        try {
            if (radius <= 0) {
                throw new IllegalArgumentException("Radius must be a positive number");
            }

            return Math.PI * Math.pow(radius, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return Double.NaN;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }
}