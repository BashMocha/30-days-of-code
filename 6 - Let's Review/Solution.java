import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        for (int i = 1; i <= testCases; i++) {
            String input = scan.next();
            System.out.println(getReview(input));
        }
        scan.close();
    }

    public static String getReview(String input) {
        String even = "", odd = "";

        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0)
                even += input.charAt(i);
            else
                odd += input.charAt(i);
        }
        return even + " " + odd;
    }
}