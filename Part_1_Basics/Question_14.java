package Part_1_Basics;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
//        Program for Prime Factorization
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int div = 2; div * div <= n; div++){
            while (n % div == 0){
                n = n / div;
                System.out.print(div + " ");
            }
        }
        if(n != 1){
            System.out.println(n);
        }
    }
}
