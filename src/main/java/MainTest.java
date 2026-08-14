import org.testng.annotations.*;
import java.util.*;
import static org.testng.Assert.*;


public class MainTest {

    @BeforeMethod
    public void programStart() {
        System.out.println("The program is starting");
    }

    @AfterMethod
    public void programEnd() {
        System.out.println("The program has ended");
    }

    @DataProvider(name = "checkFibonacciFalseOutput")
    public Object[][] checkFibonacciFalseOutput() {
        return new Object[][] {
                {"hello world"},
                {"false"},
                {"999999999999999999999999"},
                {""},
                {"5.0"},
                {"char"},
                {"5"}};
    }


    @Test(groups = "Smoke")
    public void checkSizeOfFibonacciSequence() {
        List<Integer> result = FibonacciGenerator.generateFibonacciSequence(5);
        assertEquals(result.size(),5);
    }

    @Test
    public void checkOutputOfFibonacciSequence() {
        List<Integer> result = FibonacciGenerator.generateFibonacciSequence(5);
        assertEquals(result, List.of(0,1,1,2,3));
    }

    @Test
    public void checkExistNumberInFibonacciSequence() {
        List<Integer> result = FibonacciGenerator.generateFibonacciSequence(5);
        assertTrue(result.contains(3));
    }

    @Test(groups = "Regression")
    public void firstNumberIsAlwaysZero() {
        List<Integer> result = FibonacciGenerator.generateFibonacciSequence(5);
        assertEquals(result.getFirst(),0);
    }

    @Test(groups = "Smoke")
    public void checkFibonacciCountHasNotPositiveNumber() {
        List<Integer> result = FibonacciGenerator.generateFibonacciSequence(0);
        assertTrue(result.isEmpty());
    }

    @Test(dataProvider = "checkFibonacciFalseOutput")
    public void checkInputCheckerReturnsFalseOutput(String output) {
        Scanner scanner = new Scanner(output);
        boolean result = FibonacciGenerator.inputChecker(scanner);
        assertFalse(result, "The value is a number");
    }

    @Test
    public void returnNumberSum() {
        int result = 4 + 4;
        assertEquals(result,8);
    }

    @Test
    public void returnNumberSumInCycle() {
            int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += i;
        }
        assertEquals(sum,45);
    }

    @Test
    public void checkStringLength() {
        String text = "hello world";
        assertEquals(text.length(), 11);
    }

    @Test
    public void checkListContainsElement() {
        Map<String, Integer> names = Map.of("Anna", 10, "BigBob", 12, "Erik",30);
        assertTrue(names.containsKey("Anna"));
    }
}