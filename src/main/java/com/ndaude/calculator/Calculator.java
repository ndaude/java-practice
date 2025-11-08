import java.util.OptionalInt;

public class Calculator {
    public static int sum(int a, int b) { return a + b; }
    
    public static int subtract(int a, int b) { return a - b; }
    
    public static int multiply(int a, int b) { return a * b; }
    
    public static OptionalInt safeDivide(int a, int b) {
        if (b == 0) return OptionalInt.empty();
        return OptionalInt.of(a / b);
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 3));       // 5
        System.out.println(subtract(5, 2));  // 3
        System.out.println(multiply(3, 4));  // 12
        System.out.println(safeDivide(10, 2).orElse(-1));   // 5
	System.out.println(safeDivide(10, 0).orElse(-1)); // -1 simula erro
    }
}
