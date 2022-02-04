package Part_2_Patterns;

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
//        Pattern 16
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 2 * n - 3;     //Space
        int st = 1;     //Star

//        Rows
        for(int i = 1; i <= n; i++){
//            Star or val
            int val = 1;
            for (int j = 0; j < st; j++) {
                System.out.print(val + "\t");
                val++;
            }
//            SPACE
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
//            STAR OR VAL
            if(i == n){
                st--;
                val--;
            }
            for (int j = 0; j < st; j++) {
                val--;
                System.out.print(val + "\t");
            }

//            prep for new line
            System.out.println();
            st++;
            sp = sp - 2;
        }
    }
}
