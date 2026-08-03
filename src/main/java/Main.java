import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter a number for Fibonacci generation: ");

        if (scanner.hasNextInt()) {

        int count = scanner.nextInt();

            if (count <= 0) {
                System.out.println("The number must be higher than zero!");
            }  else {

                int firstNumber = 0;
                int secondNumber = 1;

                System.out.println("Here you are:");

                for (int i = 1; i <= count; i++) {
                    System.out.print(firstNumber + " ");

                    int nextNumber = firstNumber + secondNumber;
                    firstNumber = secondNumber;
                    secondNumber = nextNumber;
                }
            }

        } else {
            System.out.println("Entered data is not valid!");
        }
    }
}
