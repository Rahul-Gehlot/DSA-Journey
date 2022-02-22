package Part_5_2DArrays;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
//        Program on matrix multiplication
        Scanner sc = new Scanner(System.in);
//        Input for array 1
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
//        Input for array 2
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

//        If inputs are invalid
        if(r2 != c1){
            System.out.println("Invalid input");
            return;
        }
        
//        Product array
//        matrix will always be r1 x c2;
        int[][] prd = new int[r1][c2];
        for (int i = 0; i < prd.length; i++) {
            for (int j = 0; j < prd[0].length; j++) {
                for (int k = 0; k < c1; k++) {
//                    Suppose if the prd is c12 then the rows for a and c will be same and cols. for b and c will be same
//                    col varies in a and row varies in b.
                    prd[i][j] = prd[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < prd.length; i++) {
            for (int j = 0; j < prd[0].length; j++) {
                System.out.print(prd[i][j] + " ");
            }
            System.out.println();
        }
    }
}
