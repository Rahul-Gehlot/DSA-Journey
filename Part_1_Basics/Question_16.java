package Part_1_Basics;

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
//        Benjamin Bulb
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
    }
}
