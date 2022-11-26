import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] returnedDate = new int[3];
        int[] dueDate = new int[3];

        for (int i = 0; i < 3; i++) {
            returnedDate[i] = scan.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            dueDate[i] = scan.nextInt();
        }

        boolean sameYear = returnedDate[2] == dueDate[2];
        boolean sameMonth = returnedDate[1] == dueDate[1];
        boolean yearFine = returnedDate[2] > dueDate[2];
        boolean monthFine = returnedDate[1] > dueDate[1];
        boolean dayFine = returnedDate[0] > dueDate[0];

        if (yearFine) System.out.println(10000);
        else if (sameYear && monthFine) System.out.println((returnedDate[1] - dueDate[1]) * 500);
        else if (sameYear && sameMonth && dayFine) System.out.println((returnedDate[0] - dueDate[0]) * 15);
        else System.out.println(0);

        scan.close();
    }

}
