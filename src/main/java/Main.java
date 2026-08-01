import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter a number for Fibonacci generation: ");

        if (scanner.hasNextInt()) {

            int count = scanner.nextInt();

            if (count <= 0) {
                System.out.println("The number must be higher than zero!");
            } else {
                List<Integer> result = FibonacciGenerator.generateFibonacciSequence(count);
                for (int number : result) {
                    System.out.print(number + " ");
                }
            }
        } else {
            System.out.println("Entered data is not valid!");
        }
    }
}