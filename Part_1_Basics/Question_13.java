package Part_1_Basics;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
//        Program for GCD and LCM       //
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int tempn1 = n1;
        int tempn2 = n2;

        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd = n2;
        int lcm = (tempn1 * tempn2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
