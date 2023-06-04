// Checking a Palindrome - characters that read the same backward as forward.


public class PalindromeCheck {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = "";

        // reverse original word
        reversed = new StringBuilder(original).reverse().toString();

        // if the original and the reverse is equal it is a palindrome
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

    }
}
