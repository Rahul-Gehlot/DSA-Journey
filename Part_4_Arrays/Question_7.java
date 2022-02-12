package Part_4_Arrays;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
//        Rotate an array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        At what number you want to rotate
        int r = sc.nextInt();
        rotate(arr, r);
        for(int val: arr){
            System.out.print(val + " ");
        }
    }

    private static void rotate(int[] arr, int r) {
//        If the number is more than the length of an array
        r = r % arr.length;
//        If r is negative
        if (r < 0) {
            r = r + arr.length;
        }

//        Part 1
        reverse(arr, 0, arr.length - r - 1);
//        Part 2
        reverse(arr, arr.length - r, arr.length - 1);
//        PART 1 + PART 2
        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int i, int j) {
        int li = i;
        int ri = j;
        while (li < ri){
            int swap = arr[li];
            arr[li] = arr[ri];
            arr[ri] = swap;
            li++;
            ri--;
        }
    }
}
