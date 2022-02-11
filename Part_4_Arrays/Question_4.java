package Part_4_Arrays;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
//        Sum of two arrays
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

//        Sum array
        int[] sum = new int[Math.max(n1, n2)];
        int i = a.length - 1;
        int j = b.length - 1;
        int k = sum.length - 1;
        int carry = 0;

        while(k >= 0){
            int digit = carry;
            if(i >= 0)
                digit = digit + a[i];
            if(j >= 0)
                digit = digit + b[j];

            carry = digit / 10;
            digit = digit % 10;
            sum[k] = digit;
            i--;
            j--;
            k--;

        }
        if(carry > 0)
            System.out.println(carry);

        for(int ans: sum)
            System.out.println(ans);
    }
}
