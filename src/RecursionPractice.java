public class RecursionPractice {
    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println("The factorial of 5 is " + ans);
        int fib = fibonacci(5);
        System.out.println("The 5th number of the fibonacci sequence is " + fib);

    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}