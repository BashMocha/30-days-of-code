import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        int i;
        try {
            i = Integer.parseInt(S);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Bad String");
        }

        bufferedReader.close();
    }
}
