package Part_2_Patterns;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
//        Pattern 13 (it is a combination pattern)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
//            Work
            int icj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + " ");
//                Formula of nCk
                int icjp1 =  icj * (i - j) / (j + 1);
                icj = icjp1;
            }
//            prep for new line
            System.out.println();
        }
    }
}
