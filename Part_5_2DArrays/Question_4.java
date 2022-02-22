package Part_5_2DArrays;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
//        Program on spiral display
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int minr = 0; //Minimum row
        int minc = 0; //Minimum column
        int maxr = n - 1; //Maximum row
        int maxc = m - 1; //Maximum column

//        when to stop
        int total = n * m;
        int count = 0;
//        using  && count < total because we don't if the wall will be complete for the last remaining elements or not, otherwise it will print duplicates
        while(count < total){
//            left wall
            for(int i = minr; i <= maxr && count < total; i++){
                System.out.println(arr[i][minc] + " ");
                count++;
            }
            minc++;
//            bottom wall
            for (int i = minc; i <= maxc && count < total ; i++) {
                System.out.print(arr[maxr][i] + " ");
                count++;
            }
            maxr--;
//            right wall
            for(int i = maxr; i >= minr && count < total; i--){
                System.out.print(arr[i][maxc] + " ");
                count++;
            }
            maxc--;
//            top wall
            for(int i = maxc; i >= minc && count < total; i--){
                System.out.print(arr[minr][i] + " ");
                count++;
            }
            minr++;
        }
    }
}
