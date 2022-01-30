package Part_1_Basics;

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
//        Program to print the digits of a number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 0;
        int temp = n;

        while (temp != 0){
            temp = temp / 10;
            digit++;
        }

        int div = (int)Math.pow(10, digit - 1);
        while (div != 0){
            int q = n / div;
            System.out.println(q);
            n = n % div;
            div = div / 10;
        }
    }
}
