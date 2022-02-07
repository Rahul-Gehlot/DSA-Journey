package Part_3_Functions;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
//        Decimal to any base
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int ans = decimalToAnyBase(n, b);
        System.out.println(ans);
    }

    private static int decimalToAnyBase(int n, int b) {
        int ans = 0;
        int p = 1;
        while (n != 0){
            int rem = n % b;
            n = n / b;
            ans = ans + rem * p;
            p = p * 10;
        }
        return ans;
    }
}
