package Part_5_2DArrays;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
//        Wave Traversal
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

//        As the columns are increasing
        for(int j = 0; j < arr[0].length; j++){
//            As the row is increasing when going down(column is in a even state);
            if(j % 2 == 0){
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
//                If column is in a odd state
            }else {
                for(int i = arr.length - 1; i >= 0; i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
