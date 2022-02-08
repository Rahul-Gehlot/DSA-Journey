package Part_3_Functions;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
//        Any Base Multiplication
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ans = anyBaseMultiplication(b, n1, n2);
        System.out.println(ans);
    }

    private static int anyBaseMultiplication(int b, int n1, int n2) {
        int ans = 0;
        int p = 1;
        while(n2 > 0){
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int mul = mulWithSingleDigit(b, n1, d2);
            ans = anyBaseAddition(b, ans, mul * p);
            p = p * 10;
        }
        return ans;
    }

    private static int anyBaseAddition(int b, int n1, int n2) {
        int ans = 0;
        int c = 0;
        int p = 1;
        while(n1 > 0 || n2 > 0 || c > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int sum = d1 + d2 + c;
            c = sum / b;
            sum = sum % b;
            ans = ans + sum * p;
            p = p * 10;
        }
        return ans;
    }

    private static int mulWithSingleDigit(int b, int n1, int d2) {
        int ans = 0;
        int p = 1;
        int c = 0;
        while (n1 > 0 || c > 0){
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int mul = d1 * d2 + c;
            c = mul / b;
            mul = mul % b;
            ans = ans + mul * p;
            p = p * 10;
        }
        return ans;
    }
}
