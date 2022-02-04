package Part_2_Patterns;

import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
//        Pattern 18
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = n;
        int sp = 0;
        for(int i = 1; i <= n; i++){
//            Space
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
//            Stars
            for(int j = 1; j <= st; j++){
                if(i > 1 && i <= n / 2 && j > 1 && j < st)
                    System.out.print("\t");
                else
                    System.out.print("*\t");
            }

//            Prep for new line
            if(i <= n / 2){
                sp++;
                st = st - 2;
            }else {
                sp--;
                st = st + 2;
            }
            System.out.println();
        }
    }
}
