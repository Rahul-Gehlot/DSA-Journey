package Part_4_Arrays;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
//        Program to inverse of an array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = inverse(arr);
        for(int val: ans){
            System.out.print(val + " ");
        }
    }

    private static int[] inverse(int[] arr) {
        int[] inv = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            inv[val] = i;
        }
        return inv;
    }
}
