import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        printReverse(arr);
        bufferedReader.close();
    }

    public static void printReverse(List<Integer> arr) {
        for (int i = arr.size() - 1; i >= 0; i--)
            System.out.print(arr.get(i) + " ");
    }
}
