package Part_2_Patterns;

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
//        Pattern 9
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        Rows
        for (int i = 1; i <= n; i++) {
//            work
            for (int j = 1; j <= n; j++) {
                if(i == j || i + j == n + 1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }

//            Prep for new line
            System.out.println();
        }
    }
}
