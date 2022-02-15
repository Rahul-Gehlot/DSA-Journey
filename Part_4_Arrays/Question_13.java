package Part_4_Arrays;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
//        First and the last index
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        int first = firstIndex(arr, key);
        System.out.println("First index is " + first);
        int last = lastIndex(arr, key);
        System.out.println("Last index is " + last);
    }

    private static int lastIndex(int[] arr, int key) {
        int last = -1;
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi){
            int mid = (lo + hi) / 2;
            if(key < arr[mid])
                hi = mid - 1;
            else if (key > arr[mid])
                lo = mid + 1;
            else {
                last = mid;
                lo = mid + 1;
            }
        }
        return last;
    }

    private static int firstIndex(int[] arr, int key) {
        int first = -1;
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi){
            int mid = (lo + hi) / 2;
            if(key < arr[mid])
                hi = mid - 1;
            else if (key > arr[mid])
                lo = mid + 1;
            else {
                first = mid;
                hi = mid - 1;
            }
        }
        return first;
    }
}
