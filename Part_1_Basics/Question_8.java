package Part_1_Basics;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
//        Count the digits in a number
//        eg: 12345 has 5 numbers in it //

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 0;
        while (n != 0){
            n = n / 10;
            digit++;
        }
        System.out.println("Total numbers are " + digit);
    }
}
