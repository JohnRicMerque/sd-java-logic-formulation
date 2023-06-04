// 3. Fibonacci Series

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int t1 = 0, t2 = 1;

        System.out.print("First " + n + " terms: ");
        
        int fib = 0;
        
        // loop from 0 to (n)
        for (int i = 0; i <= n; i++) {
            if (i <= 1) { // for 0, and 1 print as is
                System.out.print(i + " ");
            } else {
                fib = t1 + t2; // add two previous values then store to a variable (fib)
                t1 = t2; // set new first value as the second
                t2 = fib; // set new second value as the derrived
                System.out.print(fib + " ");
            }
        }

        System.out.println();
    }
}
