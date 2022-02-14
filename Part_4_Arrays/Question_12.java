package Part_4_Arrays;

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
//        Broken Economy AKA ceil and floor value
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int val = sc.nextInt();
        int ceil = 0;
        int floor = 0;
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi){
            int mid = (lo + hi) / 2;
            if(val < arr[mid]){
                hi = mid - 1;
                ceil = arr[mid];
            }else if (val > arr[mid]){
                lo = mid + 1;
                floor = arr[mid];
            }else {
                ceil = arr[mid];
                floor = arr[mid];
            }
        }
        System.out.println(floor);
        System.out.println(ceil);
    }

}
