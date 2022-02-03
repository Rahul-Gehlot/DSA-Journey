package Part_2_Patterns;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
//        Pattern 8
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n - 1;     //Space
        int st = 1;     //Star

//        rows
        for (int i = 0; i < n; i++) {

//            Work for space
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }

//            Work for stars
            for (int j = 0; j < st; j++) {
                System.out.println("*\t");
            }

//            Prep for next line
            System.out.println();
            sp--;
        }
    }
}
