import java.util.List;
import java.util.ArrayList;

public class FibonacciGenerator {

    public static List<Integer> generateFibonacciSequence(int count) {

        List<Integer> result = new ArrayList<>();

        int firstNumber = 0;
        int secondNumber = 1;

        for (int i = 1; i <= count; i++) {
            result.add(firstNumber);

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;

        }
        return result;
    }
}
