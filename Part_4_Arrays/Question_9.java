package Part_4_Arrays;

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
//        SubArray Problem
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = i; k <= j ; k++) {
                    System.out.print(arr[k] + " ");
                }
            System.out.println();
            }
        }
    }
}
