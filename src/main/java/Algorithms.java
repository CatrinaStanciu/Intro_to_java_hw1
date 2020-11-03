
import java.util.Arrays;

public class Algorithms {

    public static int sum100() { // Calculate the sum of the first 100 numbers higher than 0
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static int smallest1(int[] numbers) { //Display the smallest number from an array of number (1)

        int smallest = numbers[0];

        for (int x : numbers) {
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest;
    }

    public static int smallest2(int[] numbers) { //Display the smallest number from an array of number (2)

        Arrays.sort(numbers);

        return numbers[0];
    }

    public static int maxDigit(int number) { //Display the max digit from a number

        int maxDigit = 0;

        while (number != 0) {
            maxDigit = Math.max(maxDigit, number % 10);
            number = number / 10;
        }
        return maxDigit;
    }

    public static boolean palindrome(int number) {  //Check if a number is palindrome ( e.g palindrome 1221, 34143)

        int digit;
        int reversedNumber = 0;
        int storedNumber = number;
        boolean isPalindrome = false;

        while (number != 0) {

            digit = number % 10;
            number = number / 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        System.out.println("Given number is: " + storedNumber);
        System.out.println("Reversed number is: " + reversedNumber);

        if (reversedNumber == storedNumber)   //check ul nu era corect initial pentru ca verificam numerele rezultate din while (number)
            isPalindrome = true;

        return isPalindrome;

    }

    public static boolean isPrime(int i) {  //Display all the prime numbers lower than a given number
        //https://stackoverflow.com/questions/47006525/listing-prime-numbers-from-user-input-in-java

        boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            return isPrime;
    }

    public static void listPrimeNumbers (int number) {

        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is Prime");
            }
        }
    }
}


