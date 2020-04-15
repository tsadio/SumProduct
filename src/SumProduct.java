import java.util.Scanner;

public class SumProduct {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);

        //Question 1
        //Sum and Product of numbers
        int num1, num2;
        System.out.println("Enter a number:");
        num1 = in.nextInt();
        in.nextLine();
        System.out.println("Enter another number:");
        num2 = in.nextInt();
        in.nextLine();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Product: " + (num1 * num2));

        //Question 2
        //Square of a number
        System.out.println(" ");
        int num3;
        System.out.println(" ");
        System.out.println("Enter one more number: ");
        num3 = in.nextInt();
        in.nextLine();
        System.out.println("The square of " + num3 + " is: " + (num3 * num3));

        //Question 3
        //String concatenation
        System.out.println(" ");
        String brand, color;
        System.out.println("Enter a car brand: ");
        brand = in.nextLine();
        System.out.println("Enter a car color: ");
        color = in.nextLine();
        System.out.println(color + " " + brand);
    }
}
