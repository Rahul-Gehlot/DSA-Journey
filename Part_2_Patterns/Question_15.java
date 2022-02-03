package Part_2_Patterns;

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
//        Pattern 15
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n / 2;
        int st = 1;
        int val = 1;
        for (int i = 0; i < n; i++) {
//            Work for space
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
//            work for star
            int cval = val;
            for (int j = 0; j < st; j++) {
                System.out.print(cval + "\t");
                if(j < st / 2)
                    cval++;
                else
                    cval--;
            }

//            Prep for new line
            if(i < n / 2){
                sp--;
                st += 2;
                val++;
            }else {
                sp++;
                st -= 2;
                val--;
            }
            System.out.println();
        }
    }
}
