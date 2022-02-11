package Part_4_Arrays;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
//        Difference of two arrays
        Scanner sc = new Scanner(System.in);
//        array 1
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

//        array 2
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int[] diff = new int[Math.max(n1, n2)];
        int carry = 0;
        int i = a.length - 1;
        int j = b.length - 1;
        int k = diff.length - 1;
        while(k >= 0){
            int digit = 0;
            int aval = i >= 0 ? a[i] : 0;
            if(b[j] + carry >= aval){
                digit = b[j] + carry - aval;
                carry = 0;
            }else{
                digit = b[j] + carry + 10 - aval;
                carry = -1;
            }
            diff[k] = digit;
            i--;
            j--;
            k--;
        }

//        If 0 is at the start of the diff array
        int idx = 0;
        while (idx < diff.length){
            if(diff[idx] == 0)
                idx++;
            else
                break;
        }

        while (idx < diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
    }
}
