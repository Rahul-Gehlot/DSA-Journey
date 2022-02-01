package Part_2_Patterns;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
//        Pattern 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
