package Part_2_Patterns;

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
//        Pattern 12
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

//        Rows
        for (int i = 0; i < n; i++) {
//            work
            for (int j = 0; j <= i; j++) {
                System.out.print(a + "\t");
                int sum = a + b;
                a = b;
                b = sum;
            }

//            prep
            System.out.println();
        }
    }
}
