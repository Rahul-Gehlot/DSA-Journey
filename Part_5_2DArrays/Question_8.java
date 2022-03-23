package Part_5_2DArrays;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
//        Diagonal Traversal
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        diagonalTraversal(arr);
    }

    private static void diagonalTraversal(int[][] arr) {
        for(int gap = 0; gap < arr.length; gap++){
//            i always starts with 0 and j is controlled the gap value
//            loop ends when j is equal to length of the array everytime.
            for (int i = 0, j = gap; j < arr.length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
