package Part_1_Basics;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
//        If-else condition

    /* Program for Grading System */

//        Taking the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int n = sc.nextInt();

        if(n > 90){
            System.out.println("Excellent");
        }else if(n > 80 && n <= 90){
            System.out.println("Good");
        }else if(n > 70 && n <= 80){
            System.out.println("Fair");
        }else if(n > 60 && n <= 70){
            System.out.println("Satisfactory");
        }else {
            System.out.println("Below par");
        }

    }
}
