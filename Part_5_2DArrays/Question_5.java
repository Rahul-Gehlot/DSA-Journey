package Part_5_2DArrays;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
//        Exit point of a matrix
//        Arrays is 0's and 1's
//        Travel to east and if 1 comes it will take 90 degree turn
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int dir = 0;
        int i = 0;
        int j = 0;
        while (true){
            dir = (dir + arr[i][j]) % 4;
//            East
            if(dir == 0)
                j++;
//            south
            else if (dir == 1)
                i++;
//            west
            else if (dir == 2)
                j--;
//            north
            else if (dir == 3)
                i--;


            if(i < 0){
                i++;
                break;
            }
            else if(j < 0){
                j++;
                break;
            }
            else if(i == n){
                i--;
                break;
            }
            else if(j == m){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
