public class Calculator {
    public static int sum(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero");
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 3));       // 5
        System.out.println(subtract(5, 2));  // 3
        System.out.println(multiply(3, 4));  // 12
        System.out.println(divide(10, 2));   // 5
    }
}
