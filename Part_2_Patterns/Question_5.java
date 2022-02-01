package Part_2_Patterns;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
//        Pattern 5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n / 2; //Space
        int st = 1; //Stars

//        Rows
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
            if(i < n / 2){
                sp--;
                st = st + 2;
            }else {
                sp++;
                st = st - 2;
            }
        }
    }
}
