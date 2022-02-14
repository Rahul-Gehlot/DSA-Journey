package Part_4_Arrays;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
//        Subsets/subsequence of an array
//        Two choices -- Either the number will come or the number won't come.
//        Just like binary...Either 0 or 1.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        guessing the outer loop ending on the basis of the sample O/P.
        int lim = (int)Math.pow(2, n);
        for (int i = 0; i < lim; i++) {
//            using temp so that the outer loop won't be disturbed for further calculations
            int temp = i;
//            Initializing a empty string
            String set = "";
            for(int j = arr.length - 1; j >= 0; j--){
//                Converting the number in 0's and 1's
//                taking the last digit
                int rem = temp % 2;
//                Making the number small
                temp = temp / 2;
//                If remainder is zero, we have print the dash
                if(rem == 0){
                    set = "_\t" + set;
//                    If remainder is 1, then we have to print the number
                }else{
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }
    }
}
