package Part_2_Patterns;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
//        Pattern 4
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 0; //Space
        int st = n; //Stars

//        Loop for rows
        for (int i = 0; i < n; i++) {
//            Work for space
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
//            Work for stars
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }
//            Prep for next line
            System.out.println();
            sp++;
            st--;
        }
    }
}
