import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        if (n % 2 == 1)
            System.out.println("Weird");
        else if (n % 2 == 0 && n >= 2 && n <= 5)
            System.out.println("Not Weird");
        else if (n % 2 == 0 && n >= 6 && n <= 20)
            System.out.println("Weird");
        else if (n % 2 == 0 && n > 20)
            System.out.println("Not Weird");

        bufferedReader.close();
    }
}
