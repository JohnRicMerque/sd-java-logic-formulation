// 1.  Finding the Maximum Value in an Array

public class MaxVal {
    public static void main(String[] args) {

        // initialize array
        int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8};

        // initially set first element of array as max value
        int max = numbers[0];

        // loop through array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) { // if succeeding value is greater than the previously set max value
                max = numbers[i]; // update the maximum value 
            }
        }

        System.out.println("The maximum value in the array is: " + max);
    }
}