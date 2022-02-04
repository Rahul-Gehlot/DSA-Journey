package Part_2_Patterns;

import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
//        Pattern 19        Printing swastik
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
//                condition 1
                if(i == 1){
                    if (j <= n / 2 + 1 || j == n)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
//                condition 2
                else if (i <= n / 2){
                    if(j == n / 2 + 1 || j == n)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
//                condition 3
                else if (i == n / 2 + 1){
                    System.out.print("*\t");
                }
//                condition 4
                else if (i < n){
                    if(j == 1 || j == n / 2 + 1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
//                condition 5
                else{
                    if (j == 1 || j >= n / 2 + 1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
