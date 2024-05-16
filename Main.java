import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Select operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
    }
}
