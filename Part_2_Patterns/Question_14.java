package Part_2_Patterns;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
//        Pattern 14    -- Table of the given input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.print(n +  " * " +  i +  " = " + (n * i));
            System.out.println();
        }
//        System.out.println();
    }
}
