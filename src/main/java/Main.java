import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many Fibonacci numbers to generate? Please, enter a number: ");

        if (scanner.hasNextInt()) {

        int count = scanner.nextInt();

            if (count <= 0) {
                System.out.println("The number must be higher than zero!");
            }

        } else {
            System.out.println("Entered data is not valid!");
        }
    }
}
