import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println("The sum of the first 100 numbers higher than 0: " + Algorithms.sum100());
        out.println("The smallest number from the 1st array of numbers: " + Algorithms.smallest1(new int[]{15, 2, 3, 25}));
        out.println("The smallest number from the 2nd array of numbers: " + Algorithms.smallest2(new int[]{2546, 2345, 2954}));
        //System.out.println("7 modulo 3 " + 7%3);
        //int a = 7/3;
        //float b = (float)7/3;
        //System.out.println(a + " " + b);
        out.println("The max digit from the given number is: " + Algorithms.maxDigit(895));
        out.println("Is the given number a palindrome? " + Algorithms.palindrome(2592952));
        out.println("Display all the prime numbers lower than a given number: ");
        out.println(Algorithms.isPrime(11));
        Algorithms.listPrimeNumbers(500);


    }

}
