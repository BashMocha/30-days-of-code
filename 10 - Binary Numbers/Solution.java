import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        System.out.println(sumBinary(getBinary(n)));
    }

    public static String getBinary(int n) {
        String binNum = "";
        while (n > 0) {
            if (n % 2 == 0) {
                binNum += "0";
            } else {
                binNum += "1";
            }
            n /= 2;
        }
        return binNum;
    }

    public static int sumBinary(String s) {
        int count = 0, maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                if (count > maxCount)
                    maxCount = count;
                count = 0;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
