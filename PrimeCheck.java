// 2. Checking for a Prime Number

public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29; // this is the number to test
        boolean isPrime = true;

        // set conditions for non-prime numbers
        if (num <= 1) { // numbers less than or equal to 1
            isPrime = false; 
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // number divisible by a factor
                isPrime = false; 
            }
        }

        if(isPrime) {
            System.out.println(num + " is a prime number.");
            } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
