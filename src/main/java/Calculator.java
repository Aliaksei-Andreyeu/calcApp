import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        CalculatorOperations operations = new CalculatorOperations();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.println("Enter second number: ");
                double num2 = sc.nextDouble();

                System.out.println("Enter operation (+, -, *, /): ");
                char operation = sc.next().charAt(0);

                switch (operation) {
                    case '+':
                        System.out.println("Result: " + operations.addition(num1, num2));
                        break;
                    case '-':
                        System.out.println("Result: " + operations.subtraction(num1, num2));
                        break;
                    case '*':
                        System.out.println("Result: " + operations.multiplication(num1, num2));
                        break;
                    case '/':
                        if (num2 != 0) {
                            System.out.println("Result: " + operations.division(num1, num2));
                        } else {
                            System.out.println("Cannot divide by zero");
                        }
                        break;
                    default:
                        System.out.println("Invalid operation");
                }

                System.out.println("Do you want to continue? yes/no");
                String answer = sc.next();
                if (answer.equals("no")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter the correct data.");
                sc.next();
            }
        }
    }
}