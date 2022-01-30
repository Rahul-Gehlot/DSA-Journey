package Part_1_Basics;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
//        Print all fibonacci till n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        first fibo is always 0;
        int a = 0;
//        second fibo is always 1;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
