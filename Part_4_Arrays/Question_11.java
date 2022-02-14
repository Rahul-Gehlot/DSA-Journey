package Part_4_Arrays;

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
//        Program Binary Search
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        int ans = binarySearch(arr, key);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi){
            int mid = (lo + hi) / 2;
//            If the key is less the middle number, shift the high to the left of mid
            if(key < arr[mid])
                hi = mid - 1;
//            If the key is greater the middle number, shift the low to the right of mid
            else if(key > arr[mid])
                lo = mid + 1;
//            If key is equal to the mid
            else
                return mid;
        }
//        If the number's not found in the array
        return -1;
    }
}
