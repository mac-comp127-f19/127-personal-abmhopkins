package basicjava;

import java.util.Scanner;

public class Hypotenuse {
    public static double calculateHypotenuse(double length1, double length2) {
        double hypotenuse = Math.sqrt((length1 * length1) + (length2 * length2));

        return hypotenuse;
    }

        public static void main(String [] args) {
            Scanner scan = new Scanner(System.in);

            double length1, length2;

            System.out.println("Enter side length 1:");
            length1 = scan.nextDouble();

            System.out.println("Enter side length 2:");
            length2 = scan.nextDouble();

            double result = calculateHypotenuse(length1, length2);

            System.out.println("The hypotenuse for sides " + length1 + " and " + length2 + " is " + result);
        }

}
