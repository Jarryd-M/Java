import java.util.Scanner; 

/**  
 * NOTE.
 * If wanting to calculate with a decimal, Use a comma not a period.
 * This calculator was created by J.Matthews and is an Open Source Calculator
*/ 

public class DebuggingFormative {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Welcome message and operation menu
        System.out.println("Welcome to My Calculator!");
        System.out.println("Please select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        // Input for operation selection
        int choice = input.nextInt();

        // Perform operation based on user's choice
        switch (choice) {
            case 1:
                performAddition(input);
                break;
            case 2:
                performSubtraction(input);
                break;
            case 3:
                performMultiplication(input);
                break;
            case 4:
                performDivision(input);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }
    }

    // Method to perform addition
    public static void performAddition(Scanner input) {
        System.out.println("Enter the first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = input.nextDouble();

        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    // Method to perform subtraction
    public static void performSubtraction(Scanner input) {
        System.out.println("Enter the first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = input.nextDouble();

        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    // Method to perform multiplication
    public static void performMultiplication(Scanner input) {
        System.out.println("Enter the first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = input.nextDouble();

        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    // Method to perform division
    public static void performDivision(Scanner input) {
        System.out.println("Enter the dividend:");
        double dividend = input.nextDouble();

        System.out.println("Enter the divisor:");
        double divisor = input.nextDouble();

        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Error: Division by zero, Please try a number other than 0.");
        } else {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        }
    }
}
