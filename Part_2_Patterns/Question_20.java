package Part_2_Patterns;

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
//        Pattern 20---- Print "W"
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
//                Condition 1
                if(j == 1 || j == n)
                    System.out.print("*\t");
                else if (i > n / 2 && (i == j || i + j == n + 1))
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
