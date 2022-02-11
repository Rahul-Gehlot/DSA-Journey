package Part_4_Arrays;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
//        Reverse an array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr);
        for(int val: arr){
            System.out.print(val + " ");
        }
    }

    private static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
