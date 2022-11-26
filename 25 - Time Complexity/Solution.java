import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int test = scan.nextInt(); // int for test cases

        while (test-- > 0) {
            int num = scan.nextInt(); // int for input
            isPrimeV1(num);
        }
        scan.close();
    }

    // O(n^1/2)
    public static void isPrimeV1(int num) {
        // since 1 is an edge case, if statement is needed
        if (num == 1) {
            System.out.println("Not prime");
            return;
        }

        // check that primality from 2 to n^1/2
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }


    // O(n)
    public static void isPrime(int num) {
        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
