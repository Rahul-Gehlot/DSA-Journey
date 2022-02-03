package Part_2_Patterns;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
//        Pattern 10
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp1 = n / 2;
        int sp2 = -1;

//        Rows
        for(int i = 1; i <= n; i++){

//            Work for outer space
            for(int j = 1; j <= sp1; j++){
                System.out.print("\t");
            }

//            Work for star
            System.out.print("*\t");

//            Work for inner space
            for(int j = 1; j <= sp2; j++){
                System.out.print("\t");
            }

//            Prep
            if(i > 1 && i < n){
                System.out.print("*\t");
            }

            if(i <= n / 2){
                sp1--;
                sp2 = sp2 + 2;
            }else {
                sp1++;
                sp2 = sp2 - 2;
            }
            System.out.println();
        }
    }
}
