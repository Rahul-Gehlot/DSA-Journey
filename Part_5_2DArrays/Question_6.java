package Part_5_2DArrays;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        input for shell
        int s = sc.nextInt();
//        input for rotate
        int r = sc.nextInt();

        shellRotate(arr, r, s);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void shellRotate(int[][] arr, int r, int s) {
//        Step 1 -- Fill the 1D array from shell
        int[] oned = fillOnedFromShell(arr, r, s);
//        Step 2 -- Rotate the 1D array
        rotate(oned, r);
//        Step 3 -- Fill the Shell from 1D array
        fillShellFromOned(arr, oned, s);
    }

    private static void fillShellFromOned(int[][] arr, int[] oned, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int idx = 0;
//       left wall
        for(int i = minr; i <= maxr; i++){
             arr[i][minc] = oned[idx];
            idx++;
        }
//        bottom wall
        for(int i = minc + 1; i <= maxc; i++){
            arr[maxr][i] = oned[idx];
            idx++;
        }
//        right wall
        for(int i = maxr - 1; i >= minr; i--){
            arr[i][maxc] = oned[idx];
            idx++;
        }
//        top wall
        for(int i = maxc - 1; i >= minc + 1; i--){
            arr[minr][i] = oned[idx];
            idx++;
        }
    }

    private static int[] fillOnedFromShell(int[][] arr, int r, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

//        size of 1D array
        int size = 2 * (maxr - minr )  + 2 * ( maxc - minc);
        int[] oned = new int[size];
        int idx = 0;
//        left wall
        for(int i = minr; i <= maxr; i++){
            oned[idx] = arr[i][minc];
            idx++;
        }
//        bottom wall
        for(int i = minc + 1; i <= maxc; i++){
            oned[idx] = arr[maxr][i];
            idx++;
        }
//        right wall
        for(int i = maxr - 1; i >= minr; i--){
            oned[idx] = arr[i][maxc];
            idx++;
        }
//        top wall
        for(int i = maxc - 1; i >= minc + 1; i--){
            oned[idx] = arr[minr][i];
            idx++;
        }
        return oned;
    }

    private static void rotate(int[] oned, int r) {
//        if r > length of the array
        r = r % oned.length;
        if(r < 0)
            r = r + oned.length;

//        Part1
        reverse(oned, 0, oned.length - r - 1);
//        Part2
        reverse(oned, oned.length - r, oned.length - 1);
//        Part1 + Part2
        reverse(oned, 0, oned.length - 1);
    }

    private static void reverse(int[] oned, int i, int j) {
        while(i < j){
            int swap = oned[i];
            oned[i] = oned[j];
            oned[j] = swap;

            i++;
            j--;
        }
    }
}
