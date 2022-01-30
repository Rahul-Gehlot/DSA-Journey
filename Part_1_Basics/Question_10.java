package Part_1_Basics;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
//        Program to reverse a number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n != 0){
            int rem = n % 10;
            n = n / 10;
            System.out.print(rem + " ");
        }
    }
}
