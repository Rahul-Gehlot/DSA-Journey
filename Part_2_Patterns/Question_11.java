package Part_2_Patterns;

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
//        Pattern 11
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;
//        Rows
        for (int i = 0; i < n; i++) {
//            Work
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
//                Incrementing for next line
                val++;
            }
//            Prep for new line
            System.out.println();
        }
    }
}
