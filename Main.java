import java.util.Scanner;
 
public class Main {
 
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
 
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
 
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
 
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return num1 / num2;
    }
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        double num1, num2;
 
        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();
 
        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();
 
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
        sc.close();
    }
 
    
}
 
