package Part_4_Arrays;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        //Find the element in array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int d =sc.nextInt();
        int ans = linearSearch(arr, d);
        System.out.println(ans);
    }

    private static int linearSearch(int[] arr, int d) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == d)
                return i;
        }
        return -1;
    }
}
