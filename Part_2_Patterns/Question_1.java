package Part_2_Patterns;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
//        Pattern 1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}