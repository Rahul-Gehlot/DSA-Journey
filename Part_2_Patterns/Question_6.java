package Part_2_Patterns;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
//        Pattern
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int st = n / 2 + 1; //Stars
        int sp = 1; //Space

//        Rows
        for (int i = 0; i < n; i++) {

//            Work for stars
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }

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
            if(i < n / 2){
                st--;
                sp = sp + 2;
            }else {
                st++;
                sp = sp - 2;
            }
        }
    }
}
