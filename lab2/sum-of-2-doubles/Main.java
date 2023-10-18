import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Please enter the second number: ");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        System.out.println("The sum of the entered numbers is: " + sum);

        scanner.close();
    }
}
